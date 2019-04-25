package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMediatailorMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SINGLE_PERIOD
    - awsDashSdkLib.awsDashSdkLibStrings.MULTI_PERIOD
    - java.lang.String
  */
  type OriginManifestType = _OriginManifestType | java.lang.String
  type __integerMin1Max100 = scala.Double
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = org.scalablytyped.runtime.StringDictionary[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-04-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
