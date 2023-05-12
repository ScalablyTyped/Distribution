package typings.awsSdk.clientsKendrarankingMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KendraRanking extends Service {
  
  @JSName("config")
  var config_KendraRanking: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API. You set the number of capacity units that you require for Amazon Kendra Intelligent Ranking to rescore or re-rank a search service's results. For an example of using the CreateRescoreExecutionPlan API, including using the Python and Java SDKs, see Semantically ranking a search service's results.
    */
  def createRescoreExecutionPlan(): Request[CreateRescoreExecutionPlanResponse, AWSError] = js.native
  def createRescoreExecutionPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateRescoreExecutionPlanResponse, Unit]): Request[CreateRescoreExecutionPlanResponse, AWSError] = js.native
  /**
    * Creates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API. You set the number of capacity units that you require for Amazon Kendra Intelligent Ranking to rescore or re-rank a search service's results. For an example of using the CreateRescoreExecutionPlan API, including using the Python and Java SDKs, see Semantically ranking a search service's results.
    */
  def createRescoreExecutionPlan(params: CreateRescoreExecutionPlanRequest): Request[CreateRescoreExecutionPlanResponse, AWSError] = js.native
  def createRescoreExecutionPlan(
    params: CreateRescoreExecutionPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRescoreExecutionPlanResponse, Unit]
  ): Request[CreateRescoreExecutionPlanResponse, AWSError] = js.native
  
  /**
    * Deletes a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  def deleteRescoreExecutionPlan(): Request[js.Object, AWSError] = js.native
  def deleteRescoreExecutionPlan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  def deleteRescoreExecutionPlan(params: DeleteRescoreExecutionPlanRequest): Request[js.Object, AWSError] = js.native
  def deleteRescoreExecutionPlan(
    params: DeleteRescoreExecutionPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets information about a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  def describeRescoreExecutionPlan(): Request[DescribeRescoreExecutionPlanResponse, AWSError] = js.native
  def describeRescoreExecutionPlan(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRescoreExecutionPlanResponse, Unit]): Request[DescribeRescoreExecutionPlanResponse, AWSError] = js.native
  /**
    * Gets information about a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  def describeRescoreExecutionPlan(params: DescribeRescoreExecutionPlanRequest): Request[DescribeRescoreExecutionPlanResponse, AWSError] = js.native
  def describeRescoreExecutionPlan(
    params: DescribeRescoreExecutionPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRescoreExecutionPlanResponse, Unit]
  ): Request[DescribeRescoreExecutionPlanResponse, AWSError] = js.native
  
  /**
    * Lists your rescore execution plans. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  def listRescoreExecutionPlans(): Request[ListRescoreExecutionPlansResponse, AWSError] = js.native
  def listRescoreExecutionPlans(callback: js.Function2[/* err */ AWSError, /* data */ ListRescoreExecutionPlansResponse, Unit]): Request[ListRescoreExecutionPlansResponse, AWSError] = js.native
  /**
    * Lists your rescore execution plans. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API.
    */
  def listRescoreExecutionPlans(params: ListRescoreExecutionPlansRequest): Request[ListRescoreExecutionPlansResponse, AWSError] = js.native
  def listRescoreExecutionPlans(
    params: ListRescoreExecutionPlansRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRescoreExecutionPlansResponse, Unit]
  ): Request[ListRescoreExecutionPlansResponse, AWSError] = js.native
  
  /**
    * Gets a list of tags associated with a specified resource. A rescore execution plan is an example of a resource that can have tags associated with it.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Gets a list of tags associated with a specified resource. A rescore execution plan is an example of a resource that can have tags associated with it.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Rescores or re-ranks search results from a search service such as OpenSearch (self managed). You use the semantic search capabilities of Amazon Kendra Intelligent Ranking to improve the search service's results.
    */
  def rescore(): Request[RescoreResult, AWSError] = js.native
  def rescore(callback: js.Function2[/* err */ AWSError, /* data */ RescoreResult, Unit]): Request[RescoreResult, AWSError] = js.native
  /**
    * Rescores or re-ranks search results from a search service such as OpenSearch (self managed). You use the semantic search capabilities of Amazon Kendra Intelligent Ranking to improve the search service's results.
    */
  def rescore(params: RescoreRequest): Request[RescoreResult, AWSError] = js.native
  def rescore(params: RescoreRequest, callback: js.Function2[/* err */ AWSError, /* data */ RescoreResult, Unit]): Request[RescoreResult, AWSError] = js.native
  
  /**
    * Adds a specified tag to a specified rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API. If the tag already exists, the existing value is replaced with the new value.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds a specified tag to a specified rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API. If the tag already exists, the existing value is replaced with the new value.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore operation.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore operation.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API. You can update the number of capacity units you require for Amazon Kendra Intelligent Ranking to rescore or re-rank a search service's results.
    */
  def updateRescoreExecutionPlan(): Request[js.Object, AWSError] = js.native
  def updateRescoreExecutionPlan(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a rescore execution plan. A rescore execution plan is an Amazon Kendra Intelligent Ranking resource used for provisioning the Rescore API. You can update the number of capacity units you require for Amazon Kendra Intelligent Ranking to rescore or re-rank a search service's results.
    */
  def updateRescoreExecutionPlan(params: UpdateRescoreExecutionPlanRequest): Request[js.Object, AWSError] = js.native
  def updateRescoreExecutionPlan(
    params: UpdateRescoreExecutionPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}
