package typings
package awsDashSdkLib.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PI
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_PI: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsPiMod.PINs.ClientConfiguration = js.native
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.
    */
  def describeDimensionKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDimensionKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * For a specific time period, retrieve the top N dimension keys for a metric.
    */
  def describeDimensionKeys(params: awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDimensionKeys(
    params: awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.DescribeDimensionKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
    */
  def getResourceMetrics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResourceMetrics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve Performance Insights metrics for a set of data sources, over a time period. You can provide specific dimension groups and dimensions, and provide aggregation and filtering criteria for each group.
    */
  def getResourceMetrics(params: awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResourceMetrics(
    params: awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPiMod.PINs.GetResourceMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

