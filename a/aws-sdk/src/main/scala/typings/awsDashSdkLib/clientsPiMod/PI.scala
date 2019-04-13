package typings
package awsDashSdkLib.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PI
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_PI: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.
    */
  def describeDimensionKeys(): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDimensionKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDimensionKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.
    */
  def describeDimensionKeys(params: DescribeDimensionKeysRequest): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDimensionKeys(
    params: DescribeDimensionKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDimensionKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDimensionKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
    */
  def getResourceMetrics(): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceMetrics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
    */
  def getResourceMetrics(params: GetResourceMetricsRequest): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceMetrics(
    params: GetResourceMetricsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

