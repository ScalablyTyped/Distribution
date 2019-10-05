package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediapackageMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.ADS
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SCTE35_ENHANCED
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type AdMarkers = _AdMarkers | String
  type AdTriggers = js.Array[__AdTriggersElement]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.RESTRICTED
    - typings.awsDashSdk.awsDashSdkStrings.UNRESTRICTED
    - typings.awsDashSdk.awsDashSdkStrings.BOTH
    - java.lang.String
  */
  type AdsOnDeliveryRestrictions = _AdsOnDeliveryRestrictions | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES_128
    - typings.awsDashSdk.awsDashSdkStrings.SAMPLE_AES
    - java.lang.String
  */
  type EncryptionMethod = _EncryptionMethod | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FULL
    - typings.awsDashSdk.awsDashSdkStrings.COMPACT
    - java.lang.String
  */
  type ManifestLayout = _ManifestLayout | String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW
    - typings.awsDashSdk.awsDashSdkStrings.DENY
    - java.lang.String
  */
  type Origination = _Origination | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.EVENT
    - typings.awsDashSdk.awsDashSdkStrings.VOD
    - java.lang.String
  */
  type PlaylistType = _PlaylistType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = _Profile | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NUMBER_WITH_TIMELINE
    - typings.awsDashSdk.awsDashSdkStrings.TIME_WITH_TIMELINE
    - typings.awsDashSdk.awsDashSdkStrings.NUMBER_WITH_DURATION
    - java.lang.String
  */
  type SegmentTemplateFormat = _SegmentTemplateFormat | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.SUCCEEDED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type Status = _Status | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ORIGINAL
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_BITRATE_ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = _StreamOrder | String
  type Tags = StringDictionary[__string]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SPLICE_INSERT
    - typings.awsDashSdk.awsDashSdkStrings.BREAK
    - typings.awsDashSdk.awsDashSdkStrings.PROVIDER_ADVERTISEMENT
    - typings.awsDashSdk.awsDashSdkStrings.DISTRIBUTOR_ADVERTISEMENT
    - typings.awsDashSdk.awsDashSdkStrings.PROVIDER_PLACEMENT_OPPORTUNITY
    - typings.awsDashSdk.awsDashSdkStrings.DISTRIBUTOR_PLACEMENT_OPPORTUNITY
    - typings.awsDashSdk.awsDashSdkStrings.PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY
    - typings.awsDashSdk.awsDashSdkStrings.DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
    - java.lang.String
  */
  type __AdTriggersElement = ___AdTriggersElement | String
  type __PeriodTriggersElement = ADS | String
  type __boolean = Boolean
  type __integer = Double
  type __listOfChannel = js.Array[Channel]
  type __listOfHarvestJob = js.Array[HarvestJob]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-12`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
