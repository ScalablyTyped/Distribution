package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsLicensemanagerMod {
  type Boolean = scala.Boolean
  type BoxBoolean = scala.Boolean
  type BoxInteger = scala.Double
  type BoxLong = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsumedLicenseSummaryList = js.Array[ConsumedLicenseSummary]
  type DateTime = stdLib.Date
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[FilterValue]
  type Filters = js.Array[Filter]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EQUALS
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_EQUALS
    - awsDashSdkLib.awsDashSdkLibStrings.BEGINS_WITH
    - awsDashSdkLib.awsDashSdkLibStrings.CONTAINS
    - java.lang.String
  */
  type InventoryFilterCondition = _InventoryFilterCondition | java.lang.String
  type InventoryFilterList = js.Array[InventoryFilter]
  type LicenseConfigurationAssociations = js.Array[LicenseConfigurationAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type LicenseConfigurationStatus = _LicenseConfigurationStatus | java.lang.String
  type LicenseConfigurationUsageList = js.Array[LicenseConfigurationUsage]
  type LicenseConfigurations = js.Array[LicenseConfiguration]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.vCPU
    - awsDashSdkLib.awsDashSdkLibStrings.Instance
    - awsDashSdkLib.awsDashSdkLibStrings.Core
    - awsDashSdkLib.awsDashSdkLibStrings.Socket
    - java.lang.String
  */
  type LicenseCountingType = _LicenseCountingType | java.lang.String
  type LicenseSpecifications = js.Array[LicenseSpecification]
  type ManagedResourceSummaryList = js.Array[ManagedResourceSummary]
  type ResourceInventoryList = js.Array[ResourceInventory]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EC2_INSTANCE
    - awsDashSdkLib.awsDashSdkLibStrings.EC2_HOST
    - awsDashSdkLib.awsDashSdkLibStrings.EC2_AMI
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-08-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
