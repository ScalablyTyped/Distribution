package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediapackageMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.SCTE35_ENHANCED
    - awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH
    - java.lang.String
  */
  type AdMarkers = _AdMarkers | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AES_128
    - awsDashSdkLib.awsDashSdkLibStrings.SAMPLE_AES
    - java.lang.String
  */
  type EncryptionMethod = _EncryptionMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FULL
    - awsDashSdkLib.awsDashSdkLibStrings.COMPACT
    - java.lang.String
  */
  type ManifestLayout = _ManifestLayout | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.EVENT
    - awsDashSdkLib.awsDashSdkLibStrings.VOD
    - java.lang.String
  */
  type PlaylistType = _PlaylistType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = _Profile | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NUMBER_WITH_TIMELINE
    - awsDashSdkLib.awsDashSdkLibStrings.TIME_WITH_TIMELINE
    - java.lang.String
  */
  type SegmentTemplateFormat = _SegmentTemplateFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORIGINAL
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO_BITRATE_ASCENDING
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = _StreamOrder | java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[__string]
  type __PeriodTriggersElement = awsDashSdkLib.awsDashSdkLibStrings.ADS | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfChannel = js.Array[Channel]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfHlsManifestCreateOrUpdateParameters = js.Array[HlsManifestCreateOrUpdateParameters]
  type __listOfIngestEndpoint = js.Array[IngestEndpoint]
  type __listOfOriginEndpoint = js.Array[OriginEndpoint]
  type __listOf__PeriodTriggersElement = js.Array[__PeriodTriggersElement]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-10-12`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
