package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediapackagevodMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.SCTE35_ENHANCED
    - typings.awsDashSdk.awsDashSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type AdMarkers = _AdMarkers | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AES_128
    - typings.awsDashSdk.awsDashSdkStrings.SAMPLE_AES
    - java.lang.String
  */
  type EncryptionMethod = _EncryptionMethod | String
  type MaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NONE
    - typings.awsDashSdk.awsDashSdkStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = _Profile | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ORIGINAL
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_BITRATE_ASCENDING
    - typings.awsDashSdk.awsDashSdkStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = _StreamOrder | String
  type __boolean = Boolean
  type __integer = Double
  type __listOfAssetShallow = js.Array[AssetShallow]
  type __listOfDashManifest = js.Array[DashManifest]
  type __listOfEgressEndpoint = js.Array[EgressEndpoint]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfMssManifest = js.Array[MssManifest]
  type __listOfPackagingConfiguration = js.Array[PackagingConfiguration]
  type __listOfPackagingGroup = js.Array[PackagingGroup]
  type __listOf__string = js.Array[__string]
  type __string = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-07`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
