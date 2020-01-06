package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningPreferences extends js.Object {
  /**
    * One or more AWS accounts that will have access to the provisioned product. Applicable only to a CFN_STACKSET provisioned product type. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all accounts from the STACKSET constraint.
    */
  var StackSetAccounts: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetAccounts] = js.native
  /**
    * The number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both. The default value is 0 if no value is specified.
    */
  var StackSetFailureToleranceCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetFailureToleranceCount] = js.native
  /**
    * The percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetFailureToleranceCount or StackSetFailureTolerancePercentage, but not both.
    */
  var StackSetFailureTolerancePercentage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetFailureTolerancePercentage] = js.native
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of StackSetFailureToleranceCount. StackSetMaxConcurrentCount is at most one more than the StackSetFailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyCount: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetMaxConcurrencyCount] = js.native
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Applicable only to a CFN_STACKSET provisioned product type. Conditional: You must specify either StackSetMaxConcurrentCount or StackSetMaxConcurrentPercentage, but not both.
    */
  var StackSetMaxConcurrencyPercentage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetMaxConcurrencyPercentage] = js.native
  /**
    * One or more AWS Regions where the provisioned product will be available. Applicable only to a CFN_STACKSET provisioned product type. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the DescribeProvisioningParameters operation. If no values are specified, the default value is all regions from the STACKSET constraint.
    */
  var StackSetRegions: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackSetRegions] = js.native
}

object ProvisioningPreferences {
  @scala.inline
  def apply(
    StackSetAccounts: StackSetAccounts = null,
    StackSetFailureToleranceCount: Int | Double = null,
    StackSetFailureTolerancePercentage: Int | Double = null,
    StackSetMaxConcurrencyCount: Int | Double = null,
    StackSetMaxConcurrencyPercentage: Int | Double = null,
    StackSetRegions: StackSetRegions = null
  ): ProvisioningPreferences = {
    val __obj = js.Dynamic.literal()
    if (StackSetAccounts != null) __obj.updateDynamic("StackSetAccounts")(StackSetAccounts.asInstanceOf[js.Any])
    if (StackSetFailureToleranceCount != null) __obj.updateDynamic("StackSetFailureToleranceCount")(StackSetFailureToleranceCount.asInstanceOf[js.Any])
    if (StackSetFailureTolerancePercentage != null) __obj.updateDynamic("StackSetFailureTolerancePercentage")(StackSetFailureTolerancePercentage.asInstanceOf[js.Any])
    if (StackSetMaxConcurrencyCount != null) __obj.updateDynamic("StackSetMaxConcurrencyCount")(StackSetMaxConcurrencyCount.asInstanceOf[js.Any])
    if (StackSetMaxConcurrencyPercentage != null) __obj.updateDynamic("StackSetMaxConcurrencyPercentage")(StackSetMaxConcurrencyPercentage.asInstanceOf[js.Any])
    if (StackSetRegions != null) __obj.updateDynamic("StackSetRegions")(StackSetRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningPreferences]
  }
}

