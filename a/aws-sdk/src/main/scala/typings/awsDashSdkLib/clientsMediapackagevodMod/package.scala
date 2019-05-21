package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediapackagevodMod {
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
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = _Profile | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ORIGINAL
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO_BITRATE_ASCENDING
    - awsDashSdkLib.awsDashSdkLibStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = _StreamOrder | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfAssetShallow = js.Array[AssetShallow]
  type __listOfDashManifest = js.Array[DashManifest]
  type __listOfEgressEndpoint = js.Array[EgressEndpoint]
  type __listOfHlsManifest = js.Array[HlsManifest]
  type __listOfMssManifest = js.Array[MssManifest]
  type __listOfPackagingConfiguration = js.Array[PackagingConfiguration]
  type __listOfPackagingGroup = js.Array[PackagingGroup]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-07`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
