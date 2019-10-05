package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProvisioningPreferences extends js.Object {
  /**
    * One or more AWS accounts that will have access to the provisioned product. Applicable only to a CFN_STACKSET provisioned product type. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all accounts from the STACKSET constraint.
    */
  var StackSetAccounts: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetAccounts] = js.undefined
  /**
    * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both. The default value is 0 if no value is specified.
    */
  var StackSetFailureToleranceCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetFailureToleranceCount] = js.undefined
  /**
    * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both.
    */
  var StackSetFailureTolerancePercentage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetFailureTolerancePercentage] = js.undefined
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of StackSetFailureToleranceCount. StackSetMaxConcurrentCount is at most one more than the StackSetFailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetMaxConcurrencyCount] = js.undefined
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyPercentage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetMaxConcurrencyPercentage] = js.undefined
  /**
    * Determines what action AWS Service Catalog performs to a stack set or a stack instance represented by the provisioned product. The default value is UPDATE if nothing is specified. Applicable only to a CFN_STACKSET provisioned product type.  CREATE  Creates a new stack instance in the stack set represented by the provisioned product. In this case, only new stack instances are created based on accounts and regions; if new ProductId or ProvisioningArtifactID are passed, they will be ignored.  UPDATE  Updates the stack set represented by the provisioned product and also its stack instances.  DELETE  Deletes a stack instance in the stack set represented by the provisioned product.  
    */
  var StackSetOperationType: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetOperationType] = js.undefined
  /**
    * One or more AWS Regions where the provisioned product will be available. Applicable only to a CFN_STACKSET provisioned product type. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all regions from the STACKSET constraint.
    */
  var StackSetRegions: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetRegions] = js.undefined
}

object UpdateProvisioningPreferences {
  @scala.inline
  def apply(
    StackSetAccounts: StackSetAccounts = null,
    StackSetFailureToleranceCount: Int | Double = null,
    StackSetFailureTolerancePercentage: Int | Double = null,
    StackSetMaxConcurrencyCount: Int | Double = null,
    StackSetMaxConcurrencyPercentage: Int | Double = null,
    StackSetOperationType: StackSetOperationType = null,
    StackSetRegions: StackSetRegions = null
  ): UpdateProvisioningPreferences = {
    val __obj = js.Dynamic.literal()
    if (StackSetAccounts != null) __obj.updateDynamic("StackSetAccounts")(StackSetAccounts)
    if (StackSetFailureToleranceCount != null) __obj.updateDynamic("StackSetFailureToleranceCount")(StackSetFailureToleranceCount.asInstanceOf[js.Any])
    if (StackSetFailureTolerancePercentage != null) __obj.updateDynamic("StackSetFailureTolerancePercentage")(StackSetFailureTolerancePercentage.asInstanceOf[js.Any])
    if (StackSetMaxConcurrencyCount != null) __obj.updateDynamic("StackSetMaxConcurrencyCount")(StackSetMaxConcurrencyCount.asInstanceOf[js.Any])
    if (StackSetMaxConcurrencyPercentage != null) __obj.updateDynamic("StackSetMaxConcurrencyPercentage")(StackSetMaxConcurrencyPercentage.asInstanceOf[js.Any])
    if (StackSetOperationType != null) __obj.updateDynamic("StackSetOperationType")(StackSetOperationType.asInstanceOf[js.Any])
    if (StackSetRegions != null) __obj.updateDynamic("StackSetRegions")(StackSetRegions)
    __obj.asInstanceOf[UpdateProvisioningPreferences]
  }
}

