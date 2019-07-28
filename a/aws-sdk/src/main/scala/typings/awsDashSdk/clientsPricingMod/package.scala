package typings.awsDashSdk

import typings.awsDashSdk.awsDashSdkStrings.TERM_MATCH
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPricingMod {
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValue]
  type BoxedInteger = Double
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type FilterType = TERM_MATCH | java.lang.String
  type Filters = js.Array[Filter]
  type PriceList = js.Array[PriceListItemJSON]
  type PriceListItemJSON = java.lang.String
  type ServiceList = js.Array[Service]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-10-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
