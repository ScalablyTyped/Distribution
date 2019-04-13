package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCloudtrailMod {
  type Boolean = scala.Boolean
  type ByteBuffer = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataResourceValues = js.Array[String]
  type DataResources = js.Array[DataResource]
  type EventSelectors = js.Array[EventSelector]
  type EventsList = js.Array[Event]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.EventId
    - awsDashSdkLib.awsDashSdkLibStrings.EventName
    - awsDashSdkLib.awsDashSdkLibStrings.ReadOnly
    - awsDashSdkLib.awsDashSdkLibStrings.Username
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceType
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceName
    - awsDashSdkLib.awsDashSdkLibStrings.EventSource
    - awsDashSdkLib.awsDashSdkLibStrings.AccessKeyId
    - java.lang.String
  */
  type LookupAttributeKey = _LookupAttributeKey | java.lang.String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PublicKeyList = js.Array[PublicKey]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ReadOnly
    - awsDashSdkLib.awsDashSdkLibStrings.WriteOnly
    - awsDashSdkLib.awsDashSdkLibStrings.All
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
  type _Date = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2013-11-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
