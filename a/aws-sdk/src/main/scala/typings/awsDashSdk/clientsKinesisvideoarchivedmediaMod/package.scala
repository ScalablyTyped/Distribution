package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideoarchivedmediaMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Date
  import typings.std.Uint8Array

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FRAGMENTED_MP4
    - typings.awsDashSdk.awsDashSdkStrings.MPEG_TS
    - java.lang.String
  */
  type ContainerFormat = _ContainerFormat | java.lang.String
  type ContentType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentNumber = _DASHDisplayFragmentNumber | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type DASHDisplayFragmentTimestamp = _DASHDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type DASHFragmentSelectorType = _DASHFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LIVE
    - typings.awsDashSdk.awsDashSdkStrings.LIVE_REPLAY
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type DASHPlaybackMode = _DASHPlaybackMode | java.lang.String
  type DASHStreamingSessionURL = java.lang.String
  type Expires = Double
  type FragmentList = js.Array[Fragment]
  type FragmentNumberList = js.Array[FragmentNumberString]
  type FragmentNumberString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type FragmentSelectorType = _FragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type HLSDiscontinuityMode = _HLSDiscontinuityMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALWAYS
    - typings.awsDashSdk.awsDashSdkStrings.NEVER
    - java.lang.String
  */
  type HLSDisplayFragmentTimestamp = _HLSDisplayFragmentTimestamp | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - java.lang.String
  */
  type HLSFragmentSelectorType = _HLSFragmentSelectorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LIVE
    - typings.awsDashSdk.awsDashSdkStrings.LIVE_REPLAY
    - typings.awsDashSdk.awsDashSdkStrings.ON_DEMAND
    - java.lang.String
  */
  type HLSPlaybackMode = _HLSPlaybackMode | java.lang.String
  type HLSStreamingSessionURL = java.lang.String
  type Long = Double
  type PageLimit = Double
  type Payload = Buffer | Uint8Array | Blob | java.lang.String | Readable
  type ResourceARN = java.lang.String
  type StreamName = java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
