package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudtrailMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type Boolean = scala.Boolean
  type ByteBuffer = Buffer | Uint8Array | Blob | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DataResourceValues = js.Array[String]
  type DataResources = js.Array[DataResource]
  type EventSelectors = js.Array[EventSelector]
  type EventsList = js.Array[Event]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EventId
    - typings.awsDashSdk.awsDashSdkStrings.EventName
    - typings.awsDashSdk.awsDashSdkStrings.ReadOnly
    - typings.awsDashSdk.awsDashSdkStrings.Username
    - typings.awsDashSdk.awsDashSdkStrings.ResourceType
    - typings.awsDashSdk.awsDashSdkStrings.ResourceName
    - typings.awsDashSdk.awsDashSdkStrings.EventSource
    - typings.awsDashSdk.awsDashSdkStrings.AccessKeyId
    - java.lang.String
  */
  type LookupAttributeKey = _LookupAttributeKey | java.lang.String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults = Double
  type NextToken = java.lang.String
  type PublicKeyList = js.Array[PublicKey]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ReadOnly
    - typings.awsDashSdk.awsDashSdkStrings.WriteOnly
    - typings.awsDashSdk.awsDashSdkStrings.All
    - java.lang.String
  */
  type ReadWriteType = _ReadWriteType | java.lang.String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourceTagList = js.Array[ResourceTag]
  type String = java.lang.String
  type TagsList = js.Array[Tag]
  type TrailList = js.Array[Trail]
  type TrailNameList = js.Array[String]
  type _Date = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2013-11-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
