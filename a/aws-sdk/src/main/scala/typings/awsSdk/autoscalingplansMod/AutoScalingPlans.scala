package typings.awsSdk.autoscalingplansMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingPlans extends Service {
  
  @JSName("config")
  var config_AutoScalingPlans: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a scaling plan.
    */
  def createScalingPlan(): Request[CreateScalingPlanResponse, AWSError] = js.native
  def createScalingPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateScalingPlanResponse, Unit]): Request[CreateScalingPlanResponse, AWSError] = js.native
  /**
    * Creates a scaling plan.
    */
  def createScalingPlan(params: CreateScalingPlanRequest): Request[CreateScalingPlanResponse, AWSError] = js.native
  def createScalingPlan(
    params: CreateScalingPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScalingPlanResponse, Unit]
  ): Request[CreateScalingPlanResponse, AWSError] = js.native
  
  /**
    * Deletes the specified scaling plan. Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that are covered by the plan. If the plan has launched resources or has scaling activities in progress, you must delete those resources separately.
    */
  def deleteScalingPlan(): Request[DeleteScalingPlanResponse, AWSError] = js.native
  def deleteScalingPlan(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScalingPlanResponse, Unit]): Request[DeleteScalingPlanResponse, AWSError] = js.native
  /**
    * Deletes the specified scaling plan. Deleting a scaling plan deletes the underlying ScalingInstruction for all of the scalable resources that are covered by the plan. If the plan has launched resources or has scaling activities in progress, you must delete those resources separately.
    */
  def deleteScalingPlan(params: DeleteScalingPlanRequest): Request[DeleteScalingPlanResponse, AWSError] = js.native
  def deleteScalingPlan(
    params: DeleteScalingPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScalingPlanResponse, Unit]
  ): Request[DeleteScalingPlanResponse, AWSError] = js.native
  
  /**
    * Describes the scalable resources in the specified scaling plan.
    */
  def describeScalingPlanResources(): Request[DescribeScalingPlanResourcesResponse, AWSError] = js.native
  def describeScalingPlanResources(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingPlanResourcesResponse, Unit]): Request[DescribeScalingPlanResourcesResponse, AWSError] = js.native
  /**
    * Describes the scalable resources in the specified scaling plan.
    */
  def describeScalingPlanResources(params: DescribeScalingPlanResourcesRequest): Request[DescribeScalingPlanResourcesResponse, AWSError] = js.native
  def describeScalingPlanResources(
    params: DescribeScalingPlanResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingPlanResourcesResponse, Unit]
  ): Request[DescribeScalingPlanResourcesResponse, AWSError] = js.native
  
  /**
    * Describes one or more of your scaling plans.
    */
  def describeScalingPlans(): Request[DescribeScalingPlansResponse, AWSError] = js.native
  def describeScalingPlans(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingPlansResponse, Unit]): Request[DescribeScalingPlansResponse, AWSError] = js.native
  /**
    * Describes one or more of your scaling plans.
    */
  def describeScalingPlans(params: DescribeScalingPlansRequest): Request[DescribeScalingPlansResponse, AWSError] = js.native
  def describeScalingPlans(
    params: DescribeScalingPlansRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScalingPlansResponse, Unit]
  ): Request[DescribeScalingPlansResponse, AWSError] = js.native
  
  /**
    * Retrieves the forecast data for a scalable resource. Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data points from a specified CloudWatch load metric. Data points are available for up to 56 days. 
    */
  def getScalingPlanResourceForecastData(): Request[GetScalingPlanResourceForecastDataResponse, AWSError] = js.native
  def getScalingPlanResourceForecastData(
    callback: js.Function2[/* err */ AWSError, /* data */ GetScalingPlanResourceForecastDataResponse, Unit]
  ): Request[GetScalingPlanResourceForecastDataResponse, AWSError] = js.native
  /**
    * Retrieves the forecast data for a scalable resource. Capacity forecasts are represented as predicted values, or data points, that are calculated using historical data points from a specified CloudWatch load metric. Data points are available for up to 56 days. 
    */
  def getScalingPlanResourceForecastData(params: GetScalingPlanResourceForecastDataRequest): Request[GetScalingPlanResourceForecastDataResponse, AWSError] = js.native
  def getScalingPlanResourceForecastData(
    params: GetScalingPlanResourceForecastDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetScalingPlanResourceForecastDataResponse, Unit]
  ): Request[GetScalingPlanResourceForecastDataResponse, AWSError] = js.native
  
  /**
    * Updates the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
    */
  def updateScalingPlan(): Request[UpdateScalingPlanResponse, AWSError] = js.native
  def updateScalingPlan(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScalingPlanResponse, Unit]): Request[UpdateScalingPlanResponse, AWSError] = js.native
  /**
    * Updates the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
    */
  def updateScalingPlan(params: UpdateScalingPlanRequest): Request[UpdateScalingPlanResponse, AWSError] = js.native
  def updateScalingPlan(
    params: UpdateScalingPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScalingPlanResponse, Unit]
  ): Request[UpdateScalingPlanResponse, AWSError] = js.native
}
