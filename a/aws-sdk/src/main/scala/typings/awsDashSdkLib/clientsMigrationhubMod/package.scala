package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMigrationhubMod {
  type ApplicationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type ApplicationStatus = _ApplicationStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConfigurationId = java.lang.String
  type CreatedArtifactDescription = java.lang.String
  type CreatedArtifactList = js.Array[CreatedArtifact]
  type CreatedArtifactName = java.lang.String
  type DiscoveredResourceDescription = java.lang.String
  type DiscoveredResourceList = js.Array[DiscoveredResource]
  type DryRun = scala.Boolean
  type LatestResourceAttributeList = js.Array[ResourceAttribute]
  type MaxResults = scala.Double
  type MaxResultsCreatedArtifacts = scala.Double
  type MaxResultsResources = scala.Double
  type MigrationTaskName = java.lang.String
  type MigrationTaskSummaryList = js.Array[MigrationTaskSummary]
  type NextUpdateSeconds = scala.Double
  type ProgressPercent = scala.Double
  type ProgressUpdateStream = java.lang.String
  type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]
  type ResourceAttributeList = js.Array[ResourceAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IPV4_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.IPV6_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.MAC_ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FQDN
    - awsDashSdkLib.awsDashSdkLibStrings.VM_MANAGER_ID
    - awsDashSdkLib.awsDashSdkLibStrings.VM_MANAGED_OBJECT_REFERENCE
    - awsDashSdkLib.awsDashSdkLibStrings.VM_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.VM_PATH
    - awsDashSdkLib.awsDashSdkLibStrings.BIOS_ID
    - awsDashSdkLib.awsDashSdkLibStrings.MOTHERBOARD_SERIAL_NUMBER
    - java.lang.String
  */
  type ResourceAttributeType = _ResourceAttributeType | java.lang.String
  type ResourceAttributeValue = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NOT_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - java.lang.String
  */
  type Status = _Status | java.lang.String
  type StatusDetail = java.lang.String
  type Token = java.lang.String
  type UpdateDateTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-05-31`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
