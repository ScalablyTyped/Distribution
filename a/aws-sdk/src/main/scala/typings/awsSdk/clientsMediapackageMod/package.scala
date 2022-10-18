package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ADS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SCTE35_ENHANCED
  - typings.awsSdk.awsSdkStrings.PASSTHROUGH
  - typings.awsSdk.awsSdkStrings.DATERANGE
  - java.lang.String
*/
type AdMarkers = _AdMarkers | String

type AdTriggers = js.Array[AdTriggersElement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SPLICE_INSERT
  - typings.awsSdk.awsSdkStrings.BREAK
  - typings.awsSdk.awsSdkStrings.PROVIDER_ADVERTISEMENT
  - typings.awsSdk.awsSdkStrings.DISTRIBUTOR_ADVERTISEMENT
  - typings.awsSdk.awsSdkStrings.PROVIDER_PLACEMENT_OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.DISTRIBUTOR_PLACEMENT_OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY
  - typings.awsSdk.awsSdkStrings.DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY
  - java.lang.String
*/
type AdTriggersElement = _AdTriggersElement | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.RESTRICTED
  - typings.awsSdk.awsSdkStrings.UNRESTRICTED
  - typings.awsSdk.awsSdkStrings.BOTH
  - java.lang.String
*/
type AdsOnDeliveryRestrictions = _AdsOnDeliveryRestrictions | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAMPLE_AES
  - typings.awsSdk.awsSdkStrings.AES_CTR
  - java.lang.String
*/
type CmafEncryptionMethod = _CmafEncryptionMethod | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AES_128
  - typings.awsSdk.awsSdkStrings.SAMPLE_AES
  - java.lang.String
*/
type EncryptionMethod = _EncryptionMethod | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.COMPACT
  - java.lang.String
*/
type ManifestLayout = _ManifestLayout | String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type Origination = _Origination | String

type PeriodTriggersElement = ADS | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.VOD
  - java.lang.String
*/
type PlaylistType = _PlaylistType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`PRESET-AUDIO-1`
  - typings.awsSdk.awsSdkStrings.`PRESET-AUDIO-2`
  - typings.awsSdk.awsSdkStrings.`PRESET-AUDIO-3`
  - typings.awsSdk.awsSdkStrings.SHARED
  - typings.awsSdk.awsSdkStrings.UNENCRYPTED
  - java.lang.String
*/
type PresetSpeke20Audio = _PresetSpeke20Audio | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-1`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-2`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-3`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-4`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-5`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-6`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-7`
  - typings.awsSdk.awsSdkStrings.`PRESET-VIDEO-8`
  - typings.awsSdk.awsSdkStrings.SHARED
  - typings.awsSdk.awsSdkStrings.UNENCRYPTED
  - java.lang.String
*/
type PresetSpeke20Video = _PresetSpeke20Video | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.HBBTV_1_5
  - typings.awsSdk.awsSdkStrings.HYBRIDCAST
  - typings.awsSdk.awsSdkStrings.DVB_DASH_2014
  - java.lang.String
*/
type Profile = _Profile | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NUMBER_WITH_TIMELINE
  - typings.awsSdk.awsSdkStrings.TIME_WITH_TIMELINE
  - typings.awsSdk.awsSdkStrings.NUMBER_WITH_DURATION
  - java.lang.String
*/
type SegmentTemplateFormat = _SegmentTemplateFormat | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type Status = _Status | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ORIGINAL
  - typings.awsSdk.awsSdkStrings.VIDEO_BITRATE_ASCENDING
  - typings.awsSdk.awsSdkStrings.VIDEO_BITRATE_DESCENDING
  - java.lang.String
*/
type StreamOrder = _StreamOrder | String

type Tags = StringDictionary[string]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.`HTTP-HEAD`
  - typings.awsSdk.awsSdkStrings.`HTTP-ISO`
  - typings.awsSdk.awsSdkStrings.`HTTP-XSDATE`
  - java.lang.String
*/
type UtcTiming = _UtcTiming | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-12`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type integer = Double

type listOfChannel = js.Array[Channel]

type listOfHarvestJob = js.Array[HarvestJob]

type listOfHlsManifest = js.Array[HlsManifest]

type listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]

type listOfIngestEndpoint = js.Array[IngestEndpoint]

type listOfOriginEndpoint = js.Array[OriginEndpoint]

type listOfPeriodTriggersElement = js.Array[PeriodTriggersElement]

type listOfString = js.Array[string]

type mapOfString = StringDictionary[string]

type string = String
