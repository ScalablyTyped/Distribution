package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLicensemanagerMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Boolean = scala.Boolean
  type BoxBoolean = scala.Boolean
  type BoxInteger = Double
  type BoxLong = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]
  type DateTime = Date
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.NOT_EQUALS
    - typings.awsDashSdk.awsDashSdkStrings.BEGINS_WITH
    - typings.awsDashSdk.awsDashSdkStrings.CONTAINS
    - java.lang.String
  */
  type InventoryFilterCondition = _InventoryFilterCondition | java.lang.String
  type InventoryFilterList = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.DISABLED
    - java.lang.String
  */
  type LicenseConfigurationStatus = _LicenseConfigurationStatus | java.lang.String
  type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[LicenseConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.vCPU
    - typings.awsDashSdk.awsDashSdkStrings.Instance
    - typings.awsDashSdk.awsDashSdkStrings.Core
    - typings.awsDashSdk.awsDashSdkStrings.Socket
    - java.lang.String
  */
  type LicenseCountingType = _LicenseCountingType | java.lang.String
  type LicenseSpecifications = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]
  type ResourceInventoryList = js.Array[ResourceInventory]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EC2_INSTANCE
    - typings.awsDashSdk.awsDashSdkStrings.EC2_HOST
    - typings.awsDashSdk.awsDashSdkStrings.EC2_AMI
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-08-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
