package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSnowballMod {
  type AddressId = java.lang.String
  type AddressList = js.Array[Address]
  type AmiId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterListEntryList = js.Array[ClusterListEntry]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AwaitingQuorum
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InUse
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - java.lang.String
  */
  type ClusterState = _ClusterState | java.lang.String
  type CompatibleImageList = js.Array[CompatibleImage]
  type Ec2AmiResourceList = js.Array[Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[EventTriggerDefinition]
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobListEntryList = js.Array[JobListEntry]
  type JobMetadataList = js.Array[JobMetadata]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.New
    - awsDashSdkLib.awsDashSdkLibStrings.PreparingAppliance
    - awsDashSdkLib.awsDashSdkLibStrings.PreparingShipment
    - awsDashSdkLib.awsDashSdkLibStrings.InTransitToCustomer
    - awsDashSdkLib.awsDashSdkLibStrings.WithCustomer
    - awsDashSdkLib.awsDashSdkLibStrings.InTransitToAWS
    - awsDashSdkLib.awsDashSdkLibStrings.WithAWSSortingFacility
    - awsDashSdkLib.awsDashSdkLibStrings.WithAWS
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Complete
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - awsDashSdkLib.awsDashSdkLibStrings.Listing
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - java.lang.String
  */
  type JobState = _JobState | java.lang.String
  type JobStateList = js.Array[JobState]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IMPORT
    - awsDashSdkLib.awsDashSdkLibStrings.EXPORT
    - awsDashSdkLib.awsDashSdkLibStrings.LOCAL_USE
    - java.lang.String
  */
  type JobType = _JobType | java.lang.String
  type KmsKeyARN = java.lang.String
  type LambdaResourceList = js.Array[LambdaResource]
  type ListLimit = scala.Double
  type Long = scala.Double
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type S3ResourceList = js.Array[S3Resource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SECOND_DAY
    - awsDashSdkLib.awsDashSdkLibStrings.NEXT_DAY
    - awsDashSdkLib.awsDashSdkLibStrings.EXPRESS
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - java.lang.String
  */
  type ShippingOption = _ShippingOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.T50
    - awsDashSdkLib.awsDashSdkLibStrings.T80
    - awsDashSdkLib.awsDashSdkLibStrings.T100
    - awsDashSdkLib.awsDashSdkLibStrings.T42
    - awsDashSdkLib.awsDashSdkLibStrings.NoPreference
    - java.lang.String
  */
  type SnowballCapacity = _SnowballCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.EDGE
    - awsDashSdkLib.awsDashSdkLibStrings.EDGE_C
    - awsDashSdkLib.awsDashSdkLibStrings.EDGE_CG
    - java.lang.String
  */
  type SnowballType = _SnowballType | java.lang.String
  type SnsTopicARN = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-06-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
