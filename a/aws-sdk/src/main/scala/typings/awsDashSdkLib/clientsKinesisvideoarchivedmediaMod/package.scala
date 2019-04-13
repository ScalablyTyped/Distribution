package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideoarchivedmediaMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FRAGMENTED_MP4
    - awsDashSdkLib.awsDashSdkLibStrings.MPEG_TS
    - java.lang.String
  */
  type ContainerFormat = _ContainerFormat | java.lang.String
  type ContentType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS
    - awsDashSdkLib.awsDashSdkLibStrings.NEVER
    - java.lang.String
  */
  type DiscontinuityMode = _DiscontinuityMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS
    - awsDashSdkLib.awsDashSdkLibStrings.NEVER
    - java.lang.String
  */
  type DisplayFragmentTimestamp = _DisplayFragmentTimestamp | java.lang.String
  type Expires = scala.Double
  type FragmentList = js.Array[Fragment]
  type FragmentNumberList = js.Array[FragmentNumberString]
  type FragmentNumberString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCER_TIMESTAMP
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type FragmentSelectorType = _FragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCER_TIMESTAMP
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type HLSFragmentSelectorType = _HLSFragmentSelectorType | java.lang.String
  type HLSStreamingSessionURL = java.lang.String
  type Long = scala.Double
  type PageLimit = scala.Double
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LIVE
    - awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND
    - java.lang.String
  */
  type PlaybackMode = _PlaybackMode | java.lang.String
  type ResourceARN = java.lang.String
  type StreamName = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
