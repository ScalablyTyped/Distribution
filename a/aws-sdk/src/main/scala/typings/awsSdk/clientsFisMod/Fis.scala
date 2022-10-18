package typings.awsSdk.clientsFisMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fis extends Service {
  
  @JSName("config")
  var config_Fis: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an experiment template.  An experiment template includes the following components:    Targets: A target can be a specific resource in your Amazon Web Services environment, or one or more resources that match criteria that you specify, for example, resources that have specific tags.    Actions: The actions to carry out on the target. You can specify multiple actions, the duration of each action, and when to start each action during an experiment.    Stop conditions: If a stop condition is triggered while an experiment is running, the experiment is automatically stopped. You can define a stop condition as a CloudWatch alarm.   For more information, see Experiment templates in the Fault Injection Simulator User Guide.
    */
  def createExperimentTemplate(): Request[CreateExperimentTemplateResponse, AWSError] = js.native
  def createExperimentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentTemplateResponse, Unit]): Request[CreateExperimentTemplateResponse, AWSError] = js.native
  /**
    * Creates an experiment template.  An experiment template includes the following components:    Targets: A target can be a specific resource in your Amazon Web Services environment, or one or more resources that match criteria that you specify, for example, resources that have specific tags.    Actions: The actions to carry out on the target. You can specify multiple actions, the duration of each action, and when to start each action during an experiment.    Stop conditions: If a stop condition is triggered while an experiment is running, the experiment is automatically stopped. You can define a stop condition as a CloudWatch alarm.   For more information, see Experiment templates in the Fault Injection Simulator User Guide.
    */
  def createExperimentTemplate(params: CreateExperimentTemplateRequest): Request[CreateExperimentTemplateResponse, AWSError] = js.native
  def createExperimentTemplate(
    params: CreateExperimentTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExperimentTemplateResponse, Unit]
  ): Request[CreateExperimentTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes the specified experiment template.
    */
  def deleteExperimentTemplate(): Request[DeleteExperimentTemplateResponse, AWSError] = js.native
  def deleteExperimentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentTemplateResponse, Unit]): Request[DeleteExperimentTemplateResponse, AWSError] = js.native
  /**
    * Deletes the specified experiment template.
    */
  def deleteExperimentTemplate(params: DeleteExperimentTemplateRequest): Request[DeleteExperimentTemplateResponse, AWSError] = js.native
  def deleteExperimentTemplate(
    params: DeleteExperimentTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExperimentTemplateResponse, Unit]
  ): Request[DeleteExperimentTemplateResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified FIS action.
    */
  def getAction(): Request[GetActionResponse, AWSError] = js.native
  def getAction(callback: js.Function2[/* err */ AWSError, /* data */ GetActionResponse, Unit]): Request[GetActionResponse, AWSError] = js.native
  /**
    * Gets information about the specified FIS action.
    */
  def getAction(params: GetActionRequest): Request[GetActionResponse, AWSError] = js.native
  def getAction(
    params: GetActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetActionResponse, Unit]
  ): Request[GetActionResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified experiment.
    */
  def getExperiment(): Request[GetExperimentResponse, AWSError] = js.native
  def getExperiment(callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentResponse, Unit]): Request[GetExperimentResponse, AWSError] = js.native
  /**
    * Gets information about the specified experiment.
    */
  def getExperiment(params: GetExperimentRequest): Request[GetExperimentResponse, AWSError] = js.native
  def getExperiment(
    params: GetExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentResponse, Unit]
  ): Request[GetExperimentResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified experiment template.
    */
  def getExperimentTemplate(): Request[GetExperimentTemplateResponse, AWSError] = js.native
  def getExperimentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentTemplateResponse, Unit]): Request[GetExperimentTemplateResponse, AWSError] = js.native
  /**
    * Gets information about the specified experiment template.
    */
  def getExperimentTemplate(params: GetExperimentTemplateRequest): Request[GetExperimentTemplateResponse, AWSError] = js.native
  def getExperimentTemplate(
    params: GetExperimentTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExperimentTemplateResponse, Unit]
  ): Request[GetExperimentTemplateResponse, AWSError] = js.native
  
  /**
    * Gets information about the specified resource type.
    */
  def getTargetResourceType(): Request[GetTargetResourceTypeResponse, AWSError] = js.native
  def getTargetResourceType(callback: js.Function2[/* err */ AWSError, /* data */ GetTargetResourceTypeResponse, Unit]): Request[GetTargetResourceTypeResponse, AWSError] = js.native
  /**
    * Gets information about the specified resource type.
    */
  def getTargetResourceType(params: GetTargetResourceTypeRequest): Request[GetTargetResourceTypeResponse, AWSError] = js.native
  def getTargetResourceType(
    params: GetTargetResourceTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTargetResourceTypeResponse, Unit]
  ): Request[GetTargetResourceTypeResponse, AWSError] = js.native
  
  /**
    * Lists the available FIS actions.
    */
  def listActions(): Request[ListActionsResponse, AWSError] = js.native
  def listActions(callback: js.Function2[/* err */ AWSError, /* data */ ListActionsResponse, Unit]): Request[ListActionsResponse, AWSError] = js.native
  /**
    * Lists the available FIS actions.
    */
  def listActions(params: ListActionsRequest): Request[ListActionsResponse, AWSError] = js.native
  def listActions(
    params: ListActionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListActionsResponse, Unit]
  ): Request[ListActionsResponse, AWSError] = js.native
  
  /**
    * Lists your experiment templates.
    */
  def listExperimentTemplates(): Request[ListExperimentTemplatesResponse, AWSError] = js.native
  def listExperimentTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentTemplatesResponse, Unit]): Request[ListExperimentTemplatesResponse, AWSError] = js.native
  /**
    * Lists your experiment templates.
    */
  def listExperimentTemplates(params: ListExperimentTemplatesRequest): Request[ListExperimentTemplatesResponse, AWSError] = js.native
  def listExperimentTemplates(
    params: ListExperimentTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentTemplatesResponse, Unit]
  ): Request[ListExperimentTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists your experiments.
    */
  def listExperiments(): Request[ListExperimentsResponse, AWSError] = js.native
  def listExperiments(callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentsResponse, Unit]): Request[ListExperimentsResponse, AWSError] = js.native
  /**
    * Lists your experiments.
    */
  def listExperiments(params: ListExperimentsRequest): Request[ListExperimentsResponse, AWSError] = js.native
  def listExperiments(
    params: ListExperimentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExperimentsResponse, Unit]
  ): Request[ListExperimentsResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists the target resource types.
    */
  def listTargetResourceTypes(): Request[ListTargetResourceTypesResponse, AWSError] = js.native
  def listTargetResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListTargetResourceTypesResponse, Unit]): Request[ListTargetResourceTypesResponse, AWSError] = js.native
  /**
    * Lists the target resource types.
    */
  def listTargetResourceTypes(params: ListTargetResourceTypesRequest): Request[ListTargetResourceTypesResponse, AWSError] = js.native
  def listTargetResourceTypes(
    params: ListTargetResourceTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTargetResourceTypesResponse, Unit]
  ): Request[ListTargetResourceTypesResponse, AWSError] = js.native
  
  /**
    * Starts running an experiment from the specified experiment template.
    */
  def startExperiment(): Request[StartExperimentResponse, AWSError] = js.native
  def startExperiment(callback: js.Function2[/* err */ AWSError, /* data */ StartExperimentResponse, Unit]): Request[StartExperimentResponse, AWSError] = js.native
  /**
    * Starts running an experiment from the specified experiment template.
    */
  def startExperiment(params: StartExperimentRequest): Request[StartExperimentResponse, AWSError] = js.native
  def startExperiment(
    params: StartExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartExperimentResponse, Unit]
  ): Request[StartExperimentResponse, AWSError] = js.native
  
  /**
    * Stops the specified experiment.
    */
  def stopExperiment(): Request[StopExperimentResponse, AWSError] = js.native
  def stopExperiment(callback: js.Function2[/* err */ AWSError, /* data */ StopExperimentResponse, Unit]): Request[StopExperimentResponse, AWSError] = js.native
  /**
    * Stops the specified experiment.
    */
  def stopExperiment(params: StopExperimentRequest): Request[StopExperimentResponse, AWSError] = js.native
  def stopExperiment(
    params: StopExperimentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopExperimentResponse, Unit]
  ): Request[StopExperimentResponse, AWSError] = js.native
  
  /**
    * Applies the specified tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies the specified tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified experiment template.
    */
  def updateExperimentTemplate(): Request[UpdateExperimentTemplateResponse, AWSError] = js.native
  def updateExperimentTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateExperimentTemplateResponse, Unit]): Request[UpdateExperimentTemplateResponse, AWSError] = js.native
  /**
    * Updates the specified experiment template.
    */
  def updateExperimentTemplate(params: UpdateExperimentTemplateRequest): Request[UpdateExperimentTemplateResponse, AWSError] = js.native
  def updateExperimentTemplate(
    params: UpdateExperimentTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateExperimentTemplateResponse, Unit]
  ): Request[UpdateExperimentTemplateResponse, AWSError] = js.native
}
