package typings.awsSdk.clientsKinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.JPEGQuality
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type ClipFragmentSelectorType = _ClipFragmentSelectorType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FRAGMENTED_MP4
  - typings.awsSdk.awsSdkStrings.MPEG_TS
  - java.lang.String
*/
type ContainerFormat = _ContainerFormat | String

type ContentType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type DASHDisplayFragmentNumber = _DASHDisplayFragmentNumber | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type DASHDisplayFragmentTimestamp = _DASHDisplayFragmentTimestamp | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type DASHFragmentSelectorType = _DASHFragmentSelectorType | String

type DASHMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LIVE
  - typings.awsSdk.awsSdkStrings.LIVE_REPLAY
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
type DASHPlaybackMode = _DASHPlaybackMode | String

type DASHStreamingSessionURL = String

type Expires = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JPEG
  - typings.awsSdk.awsSdkStrings.PNG
  - java.lang.String
*/
type Format = _Format | String

type FormatConfig = StringDictionary[FormatConfigValue]

type FormatConfigKey = JPEGQuality | String

type FormatConfigValue = String

type FragmentList = js.Array[Fragment]

type FragmentNumberList = js.Array[FragmentNumberString]

type FragmentNumberString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type FragmentSelectorType = _FragmentSelectorType | String

type GetImagesMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.NEVER
  - typings.awsSdk.awsSdkStrings.ON_DISCONTINUITY
  - java.lang.String
*/
type HLSDiscontinuityMode = _HLSDiscontinuityMode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALWAYS
  - typings.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
type HLSDisplayFragmentTimestamp = _HLSDisplayFragmentTimestamp | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type HLSFragmentSelectorType = _HLSFragmentSelectorType | String

type HLSMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LIVE
  - typings.awsSdk.awsSdkStrings.LIVE_REPLAY
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
type HLSPlaybackMode = _HLSPlaybackMode | String

type HLSStreamingSessionURL = String

type HeightPixels = Double

type ImageContent = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NO_MEDIA
  - typings.awsSdk.awsSdkStrings.MEDIA_ERROR
  - java.lang.String
*/
type ImageError = _ImageError | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
  - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
  - java.lang.String
*/
type ImageSelectorType = _ImageSelectorType | String

type Images = js.Array[Image]

type ListFragmentsMaxResults = Double

type Long = Double

type NextToken = String

type Payload = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type ResourceARN = String

type SamplingInterval = Double

type StreamName = String

type Timestamp = js.Date

type WidthPixels = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
