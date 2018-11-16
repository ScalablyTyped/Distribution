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
     * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
     */
  def createScalingPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
     */
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
     * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
     */
  def createScalingPlan(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.CreateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a scaling plan. A scaling plan contains a set of instructions used to configure dynamic scaling for the scalable resources in your application. AWS Auto Scaling creates target tracking scaling policies based on the scaling instructions in your scaling plan.
     */
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
     * Deletes the specified scaling plan.
     */
  def deleteScalingPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified scaling plan.
     */
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
     * Deletes the specified scaling plan.
     */
  def deleteScalingPlan(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DeleteScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified scaling plan.
     */
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
  /**
     * Describes the scalable resources in the specified scaling plan.
     */
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
  /**
     * Describes the scalable resources in the specified scaling plan.
     */
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
     * Describes the specified scaling plans or all of your scaling plans.
     */
  def describeScalingPlans(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified scaling plans or all of your scaling plans.
     */
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
     * Describes the specified scaling plans or all of your scaling plans.
     */
  def describeScalingPlans(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.DescribeScalingPlansResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the specified scaling plans or all of your scaling plans.
     */
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
     * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     */
  def updateScalingPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     */
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
     * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     */
  def updateScalingPlan(params: awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAutoscalingplansMod.AutoScalingPlansNs.UpdateScalingPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the scaling plan for the specified scaling plan. You cannot update a scaling plan if it is in the process of being created, updated, or deleted.
     */
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

