package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMigrationhubMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ApplicationId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type ApplicationStatus = _ApplicationStatus | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationId = String
  type CreatedArtifactDescription = String
  type CreatedArtifactList = js.Array[CreatedArtifact]
  type CreatedArtifactName = String
  type DiscoveredResourceDescription = String
  type DiscoveredResourceList = js.Array[DiscoveredResource]
  type DryRun = Boolean
  type LatestResourceAttributeList = js.Array[ResourceAttribute]
  type MaxResults = Double
  type MaxResultsCreatedArtifacts = Double
  type MaxResultsResources = Double
  type MigrationTaskName = String
  type MigrationTaskSummaryList = js.Array[MigrationTaskSummary]
  type NextUpdateSeconds = Double
  type ProgressPercent = Double
  type ProgressUpdateStream = String
  type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]
  type ResourceAttributeList = js.Array[ResourceAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IPV4_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.IPV6_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.MAC_ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.FQDN
    - typings.awsDashSdk.awsDashSdkStrings.VM_MANAGER_ID
    - typings.awsDashSdk.awsDashSdkStrings.VM_MANAGED_OBJECT_REFERENCE
    - typings.awsDashSdk.awsDashSdkStrings.VM_NAME
    - typings.awsDashSdk.awsDashSdkStrings.VM_PATH
    - typings.awsDashSdk.awsDashSdkStrings.BIOS_ID
    - typings.awsDashSdk.awsDashSdkStrings.MOTHERBOARD_SERIAL_NUMBER
    - java.lang.String
  */
  type ResourceAttributeType = _ResourceAttributeType | String
  type ResourceAttributeValue = String
  type ResourceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NOT_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - java.lang.String
  */
  type Status = _Status | String
  type StatusDetail = String
  type Token = String
  type UpdateDateTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-05-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
