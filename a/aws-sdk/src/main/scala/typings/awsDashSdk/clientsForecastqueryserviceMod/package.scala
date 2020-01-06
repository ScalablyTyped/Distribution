package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsForecastqueryserviceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

  type Arn = String
  type AttributeName = String
  type AttributeValue = String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DateTime = String
  type Double = scala.Double
  type Filters = StringDictionary[AttributeValue]
  type NextToken = String
  type Predictions = StringDictionary[TimeSeries]
  type Statistic = String
  type TimeSeries = js.Array[DataPoint]
  type Timestamp = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-06-26`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
