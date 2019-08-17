package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediatailorMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SINGLE_PERIOD
    - typings.awsDashSdk.awsDashSdkStrings.MULTI_PERIOD
    - java.lang.String
  */
  type OriginManifestType = _OriginManifestType | String
  type __integerMin1Max100 = Double
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = StringDictionary[__string]
  type __string = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-04-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
