package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorklinkMod {
  type AuditStreamArn = java.lang.String
  type Boolean = scala.Boolean
  type Certificate = java.lang.String
  type CertificateChain = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CompanyCode = java.lang.String
  type DateTime = stdLib.Date
  type DeviceManufacturer = java.lang.String
  type DeviceModel = java.lang.String
  type DeviceOperatingSystemName = java.lang.String
  type DeviceOperatingSystemVersion = java.lang.String
  type DevicePatchLevel = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.SIGNED_OUT
    - java.lang.String
  */
  type DeviceStatus = _DeviceStatus | java.lang.String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type DisplayName = java.lang.String
  type FleetArn = java.lang.String
  type FleetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED_TO_CREATE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED_TO_DELETE
    - java.lang.String
  */
  type FleetStatus = _FleetStatus | java.lang.String
  type FleetSummaryList = js.Array[FleetSummary]
  type Id = java.lang.String
  type IdentityProviderType = awsDashSdkLib.awsDashSdkLibStrings.SAML | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type SamlMetadata = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type Username = java.lang.String
  type VpcId = java.lang.String
  type WebsiteCaSummaryList = js.Array[WebsiteCaSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-09-25`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
