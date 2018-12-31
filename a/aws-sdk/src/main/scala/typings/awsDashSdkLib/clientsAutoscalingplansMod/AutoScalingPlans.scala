package typings
package awsDashSdkLib.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPlans
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AutoScalingPlans: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.ClientConfiguration = js.native
  /**
    * Creates a scaling plan.
    */
  def createScalingPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createScalingPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a scaling plan.
    */
  def createScalingPlan(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createScalingPlan(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified scaling plan. Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that are covered by the plan. If the plan has launched resources or has scaling activities in progress, you must delete those resources separately.
    */
  def deleteScalingPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteScalingPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified scaling plan. Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that are covered by the plan. If the plan has launched resources or has scaling activities in progress, you must delete those resources separately.
    */
  def deleteScalingPlan(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteScalingPlan(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the scalable resources in the specified scaling plan.
    */
  def describeScalingPlanResources(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScalingPlanResources(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the scalable resources in the specified scaling plan.
    */
  def describeScalingPlanResources(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScalingPlanResources(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlanResourcesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your scaling plans.
    */
  def describeScalingPlans(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScalingPlans(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your scaling plans.
    */
  def describeScalingPlans(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScalingPlans(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the forecast data for a scalable resource. Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data points from a specified CloudWatch load metric. Data points are available for up to 56 days. 
    */
  def getScalingPlanResourceForecastData(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getScalingPlanResourceForecastData(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the forecast data for a scalable resource. Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data points from a specified CloudWatch load metric. Data points are available for up to 56 days. 
    */
  def getScalingPlanResourceForecastData(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getScalingPlanResourceForecastData(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.GetScalingPlanResourceForecastDataResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
    */
  def updateScalingPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateScalingPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
    */
  def updateScalingPlan(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateScalingPlan(
    params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

