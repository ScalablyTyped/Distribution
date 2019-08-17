package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSnowballMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AddressId = java.lang.String
  type AddressList = js.Array[Address]
  type AmiId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterListEntryList = js.Array[ClusterListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AwaitingQuorum
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InUse
    - typings.awsDashSdk.awsDashSdkStrings.Complete
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  type CompatibleImageList = js.Array[CompatibleImage]
  type Ec2AmiResourceList = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type Integer = Double
  type JobId = java.lang.String
  type JobListEntryList = js.Array[JobListEntry]
  type JobMetadataList = js.Array[JobMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.New
    - typings.awsDashSdk.awsDashSdkStrings.PreparingAppliance
    - typings.awsDashSdk.awsDashSdkStrings.PreparingShipment
    - typings.awsDashSdk.awsDashSdkStrings.InTransitToCustomer
    - typings.awsDashSdk.awsDashSdkStrings.WithCustomer
    - typings.awsDashSdk.awsDashSdkStrings.InTransitToAWS
    - typings.awsDashSdk.awsDashSdkStrings.WithAWSSortingFacility
    - typings.awsDashSdk.awsDashSdkStrings.WithAWS
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Complete
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - typings.awsDashSdk.awsDashSdkStrings.Listing
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - java.lang.String
  */
  type JobState = _JobState | java.lang.String
  type JobStateList = js.Array[JobState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IMPORT
    - typings.awsDashSdk.awsDashSdkStrings.EXPORT
    - typings.awsDashSdk.awsDashSdkStrings.LOCAL_USE
    - java.lang.String
  */
  type JobType = _JobType | java.lang.String
  type KmsKeyARN = java.lang.String
  type LambdaResourceList = js.Array[LambdaResource]
  type ListLimit = Double
  type Long = Double
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type S3ResourceList = js.Array[S3Resource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SECOND_DAY
    - typings.awsDashSdk.awsDashSdkStrings.NEXT_DAY
    - typings.awsDashSdk.awsDashSdkStrings.EXPRESS
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - java.lang.String
  */
  type ShippingOption = _ShippingOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.T50
    - typings.awsDashSdk.awsDashSdkStrings.T80
    - typings.awsDashSdk.awsDashSdkStrings.T100
    - typings.awsDashSdk.awsDashSdkStrings.T42
    - typings.awsDashSdk.awsDashSdkStrings.NoPreference
    - java.lang.String
  */
  type SnowballCapacity = _SnowballCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.STANDARD
    - typings.awsDashSdk.awsDashSdkStrings.EDGE
    - typings.awsDashSdk.awsDashSdkStrings.EDGE_C
    - typings.awsDashSdk.awsDashSdkStrings.EDGE_CG
    - java.lang.String
  */
  type SnowballType = _SnowballType | java.lang.String
  type SnsTopicARN = java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-06-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
