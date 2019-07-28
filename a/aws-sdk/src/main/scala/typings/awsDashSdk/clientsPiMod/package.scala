package typings.awsDashSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.awsDashSdkStrings.RDS
import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsPiMod {
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DataPointsList = js.Array[DataPoint]
  type DimensionKeyDescriptionList = js.Array[DimensionKeyDescription]
  type DimensionMap = StringDictionary[String]
  type Double = scala.Double
  type ISOTimestamp = Date
  type Integer = scala.Double
  type Limit = scala.Double
  type MaxResults = scala.Double
  type MetricKeyDataPointsList = js.Array[MetricKeyDataPoints]
  type MetricQueryFilterMap = StringDictionary[String]
  type MetricQueryList = js.Array[MetricQuery]
  type MetricValuesList = js.Array[Double]
  type ResponsePartitionKeyList = js.Array[ResponsePartitionKey]
  type ServiceType = RDS | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-02-27`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
