package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsWorklinkMod {
  import typings.awsDashSdk.awsDashSdkStrings.SAML
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AcmCertificateArn = String
  type AuditStreamArn = String
  type AuthorizationProviderType = SAML | String
  type Boolean = scala.Boolean
  type Certificate = String
  type CertificateChain = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CompanyCode = String
  type DateTime = Date
  type DeviceManufacturer = String
  type DeviceModel = String
  type DeviceOperatingSystemName = String
  type DeviceOperatingSystemVersion = String
  type DevicePatchLevel = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.SIGNED_OUT
    - java.lang.String
  */
  type DeviceStatus = _DeviceStatus | String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type DisplayName = String
  type DomainName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING_VALIDATION
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.INACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DISASSOCIATING
    - typings.awsDashSdk.awsDashSdkStrings.DISASSOCIATED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_TO_ASSOCIATE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_TO_DISASSOCIATE
    - java.lang.String
  */
  type DomainStatus = _DomainStatus | String
  type DomainSummaryList = js.Array[DomainSummary]
  type FleetArn = String
  type FleetName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_TO_CREATE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED_TO_DELETE
    - java.lang.String
  */
  type FleetStatus = _FleetStatus | String
  type FleetSummaryList = js.Array[FleetSummary]
  type Id = String
  type IdentityProviderType = SAML | String
  type MaxResults = Double
  type NextToken = String
  type SamlMetadata = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type Username = String
  type VpcId = String
  type WebsiteAuthorizationProvidersSummaryList = js.Array[WebsiteAuthorizationProviderSummary]
  type WebsiteCaSummaryList = js.Array[WebsiteCaSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-09-25`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
