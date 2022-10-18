package typings.awsSdk.clientsIoteventsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTEvents extends Service {
  
  @JSName("config")
  var config_IoTEvents: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an alarm model to monitor an AWS IoT Events input attribute. You can use the alarm to get notified when the value is outside a specified range. For more information, see Create an alarm model in the AWS IoT Events Developer Guide.
    */
  def createAlarmModel(): Request[CreateAlarmModelResponse, AWSError] = js.native
  def createAlarmModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateAlarmModelResponse, Unit]): Request[CreateAlarmModelResponse, AWSError] = js.native
  /**
    * Creates an alarm model to monitor an AWS IoT Events input attribute. You can use the alarm to get notified when the value is outside a specified range. For more information, see Create an alarm model in the AWS IoT Events Developer Guide.
    */
  def createAlarmModel(params: CreateAlarmModelRequest): Request[CreateAlarmModelResponse, AWSError] = js.native
  def createAlarmModel(
    params: CreateAlarmModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAlarmModelResponse, Unit]
  ): Request[CreateAlarmModelResponse, AWSError] = js.native
  
  /**
    * Creates a detector model.
    */
  def createDetectorModel(): Request[CreateDetectorModelResponse, AWSError] = js.native
  def createDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorModelResponse, Unit]): Request[CreateDetectorModelResponse, AWSError] = js.native
  /**
    * Creates a detector model.
    */
  def createDetectorModel(params: CreateDetectorModelRequest): Request[CreateDetectorModelResponse, AWSError] = js.native
  def createDetectorModel(
    params: CreateDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorModelResponse, Unit]
  ): Request[CreateDetectorModelResponse, AWSError] = js.native
  
  /**
    * Creates an input.
    */
  def createInput(): Request[CreateInputResponse, AWSError] = js.native
  def createInput(callback: js.Function2[/* err */ AWSError, /* data */ CreateInputResponse, Unit]): Request[CreateInputResponse, AWSError] = js.native
  /**
    * Creates an input.
    */
  def createInput(params: CreateInputRequest): Request[CreateInputResponse, AWSError] = js.native
  def createInput(
    params: CreateInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInputResponse, Unit]
  ): Request[CreateInputResponse, AWSError] = js.native
  
  /**
    * Deletes an alarm model. Any alarm instances that were created based on this alarm model are also deleted. This action can't be undone.
    */
  def deleteAlarmModel(): Request[DeleteAlarmModelResponse, AWSError] = js.native
  def deleteAlarmModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAlarmModelResponse, Unit]): Request[DeleteAlarmModelResponse, AWSError] = js.native
  /**
    * Deletes an alarm model. Any alarm instances that were created based on this alarm model are also deleted. This action can't be undone.
    */
  def deleteAlarmModel(params: DeleteAlarmModelRequest): Request[DeleteAlarmModelResponse, AWSError] = js.native
  def deleteAlarmModel(
    params: DeleteAlarmModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAlarmModelResponse, Unit]
  ): Request[DeleteAlarmModelResponse, AWSError] = js.native
  
  /**
    * Deletes a detector model. Any active instances of the detector model are also deleted.
    */
  def deleteDetectorModel(): Request[DeleteDetectorModelResponse, AWSError] = js.native
  def deleteDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorModelResponse, Unit]): Request[DeleteDetectorModelResponse, AWSError] = js.native
  /**
    * Deletes a detector model. Any active instances of the detector model are also deleted.
    */
  def deleteDetectorModel(params: DeleteDetectorModelRequest): Request[DeleteDetectorModelResponse, AWSError] = js.native
  def deleteDetectorModel(
    params: DeleteDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorModelResponse, Unit]
  ): Request[DeleteDetectorModelResponse, AWSError] = js.native
  
  /**
    * Deletes an input.
    */
  def deleteInput(): Request[DeleteInputResponse, AWSError] = js.native
  def deleteInput(callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputResponse, Unit]): Request[DeleteInputResponse, AWSError] = js.native
  /**
    * Deletes an input.
    */
  def deleteInput(params: DeleteInputRequest): Request[DeleteInputResponse, AWSError] = js.native
  def deleteInput(
    params: DeleteInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInputResponse, Unit]
  ): Request[DeleteInputResponse, AWSError] = js.native
  
  /**
    * Retrieves information about an alarm model. If you don't specify a value for the alarmModelVersion parameter, the latest version is returned.
    */
  def describeAlarmModel(): Request[DescribeAlarmModelResponse, AWSError] = js.native
  def describeAlarmModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlarmModelResponse, Unit]): Request[DescribeAlarmModelResponse, AWSError] = js.native
  /**
    * Retrieves information about an alarm model. If you don't specify a value for the alarmModelVersion parameter, the latest version is returned.
    */
  def describeAlarmModel(params: DescribeAlarmModelRequest): Request[DescribeAlarmModelResponse, AWSError] = js.native
  def describeAlarmModel(
    params: DescribeAlarmModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlarmModelResponse, Unit]
  ): Request[DescribeAlarmModelResponse, AWSError] = js.native
  
  /**
    * Describes a detector model. If the version parameter is not specified, information about the latest version is returned.
    */
  def describeDetectorModel(): Request[DescribeDetectorModelResponse, AWSError] = js.native
  def describeDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorModelResponse, Unit]): Request[DescribeDetectorModelResponse, AWSError] = js.native
  /**
    * Describes a detector model. If the version parameter is not specified, information about the latest version is returned.
    */
  def describeDetectorModel(params: DescribeDetectorModelRequest): Request[DescribeDetectorModelResponse, AWSError] = js.native
  def describeDetectorModel(
    params: DescribeDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorModelResponse, Unit]
  ): Request[DescribeDetectorModelResponse, AWSError] = js.native
  
  /**
    * Retrieves runtime information about a detector model analysis.  After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis results. 
    */
  def describeDetectorModelAnalysis(): Request[DescribeDetectorModelAnalysisResponse, AWSError] = js.native
  def describeDetectorModelAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorModelAnalysisResponse, Unit]): Request[DescribeDetectorModelAnalysisResponse, AWSError] = js.native
  /**
    * Retrieves runtime information about a detector model analysis.  After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis results. 
    */
  def describeDetectorModelAnalysis(params: DescribeDetectorModelAnalysisRequest): Request[DescribeDetectorModelAnalysisResponse, AWSError] = js.native
  def describeDetectorModelAnalysis(
    params: DescribeDetectorModelAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorModelAnalysisResponse, Unit]
  ): Request[DescribeDetectorModelAnalysisResponse, AWSError] = js.native
  
  /**
    * Describes an input.
    */
  def describeInput(): Request[DescribeInputResponse, AWSError] = js.native
  def describeInput(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]): Request[DescribeInputResponse, AWSError] = js.native
  /**
    * Describes an input.
    */
  def describeInput(params: DescribeInputRequest): Request[DescribeInputResponse, AWSError] = js.native
  def describeInput(
    params: DescribeInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInputResponse, Unit]
  ): Request[DescribeInputResponse, AWSError] = js.native
  
  /**
    * Retrieves the current settings of the AWS IoT Events logging options.
    */
  def describeLoggingOptions(): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Events logging options.
    */
  def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  def describeLoggingOptions(
    params: DescribeLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoggingOptionsResponse, Unit]
  ): Request[DescribeLoggingOptionsResponse, AWSError] = js.native
  
  /**
    * Retrieves one or more analysis results of the detector model.  After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis results. 
    */
  def getDetectorModelAnalysisResults(): Request[GetDetectorModelAnalysisResultsResponse, AWSError] = js.native
  def getDetectorModelAnalysisResults(
    callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorModelAnalysisResultsResponse, Unit]
  ): Request[GetDetectorModelAnalysisResultsResponse, AWSError] = js.native
  /**
    * Retrieves one or more analysis results of the detector model.  After AWS IoT Events starts analyzing your detector model, you have up to 24 hours to retrieve the analysis results. 
    */
  def getDetectorModelAnalysisResults(params: GetDetectorModelAnalysisResultsRequest): Request[GetDetectorModelAnalysisResultsResponse, AWSError] = js.native
  def getDetectorModelAnalysisResults(
    params: GetDetectorModelAnalysisResultsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorModelAnalysisResultsResponse, Unit]
  ): Request[GetDetectorModelAnalysisResultsResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of an alarm model. The operation returns only the metadata associated with each alarm model version.
    */
  def listAlarmModelVersions(): Request[ListAlarmModelVersionsResponse, AWSError] = js.native
  def listAlarmModelVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmModelVersionsResponse, Unit]): Request[ListAlarmModelVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of an alarm model. The operation returns only the metadata associated with each alarm model version.
    */
  def listAlarmModelVersions(params: ListAlarmModelVersionsRequest): Request[ListAlarmModelVersionsResponse, AWSError] = js.native
  def listAlarmModelVersions(
    params: ListAlarmModelVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmModelVersionsResponse, Unit]
  ): Request[ListAlarmModelVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the alarm models that you created. The operation returns only the metadata associated with each alarm model.
    */
  def listAlarmModels(): Request[ListAlarmModelsResponse, AWSError] = js.native
  def listAlarmModels(callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmModelsResponse, Unit]): Request[ListAlarmModelsResponse, AWSError] = js.native
  /**
    * Lists the alarm models that you created. The operation returns only the metadata associated with each alarm model.
    */
  def listAlarmModels(params: ListAlarmModelsRequest): Request[ListAlarmModelsResponse, AWSError] = js.native
  def listAlarmModels(
    params: ListAlarmModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmModelsResponse, Unit]
  ): Request[ListAlarmModelsResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of a detector model. Only the metadata associated with each detector model version is returned.
    */
  def listDetectorModelVersions(): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  def listDetectorModelVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelVersionsResponse, Unit]): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of a detector model. Only the metadata associated with each detector model version is returned.
    */
  def listDetectorModelVersions(params: ListDetectorModelVersionsRequest): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  def listDetectorModelVersions(
    params: ListDetectorModelVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelVersionsResponse, Unit]
  ): Request[ListDetectorModelVersionsResponse, AWSError] = js.native
  
  /**
    * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
    */
  def listDetectorModels(): Request[ListDetectorModelsResponse, AWSError] = js.native
  def listDetectorModels(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelsResponse, Unit]): Request[ListDetectorModelsResponse, AWSError] = js.native
  /**
    * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
    */
  def listDetectorModels(params: ListDetectorModelsRequest): Request[ListDetectorModelsResponse, AWSError] = js.native
  def listDetectorModels(
    params: ListDetectorModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorModelsResponse, Unit]
  ): Request[ListDetectorModelsResponse, AWSError] = js.native
  
  /**
    *  Lists one or more input routings. 
    */
  def listInputRoutings(): Request[ListInputRoutingsResponse, AWSError] = js.native
  def listInputRoutings(callback: js.Function2[/* err */ AWSError, /* data */ ListInputRoutingsResponse, Unit]): Request[ListInputRoutingsResponse, AWSError] = js.native
  /**
    *  Lists one or more input routings. 
    */
  def listInputRoutings(params: ListInputRoutingsRequest): Request[ListInputRoutingsResponse, AWSError] = js.native
  def listInputRoutings(
    params: ListInputRoutingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInputRoutingsResponse, Unit]
  ): Request[ListInputRoutingsResponse, AWSError] = js.native
  
  /**
    * Lists the inputs you have created.
    */
  def listInputs(): Request[ListInputsResponse, AWSError] = js.native
  def listInputs(callback: js.Function2[/* err */ AWSError, /* data */ ListInputsResponse, Unit]): Request[ListInputsResponse, AWSError] = js.native
  /**
    * Lists the inputs you have created.
    */
  def listInputs(params: ListInputsRequest): Request[ListInputsResponse, AWSError] = js.native
  def listInputs(
    params: ListInputsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInputsResponse, Unit]
  ): Request[ListInputsResponse, AWSError] = js.native
  
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Sets or updates the AWS IoT Events logging options. If you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. If you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
    */
  def putLoggingOptions(): Request[js.Object, AWSError] = js.native
  def putLoggingOptions(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Events logging options. If you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. If you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy), it takes up to five minutes for that change to take effect.
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): Request[js.Object, AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Performs an analysis of your detector model. For more information, see Troubleshooting a detector model in the AWS IoT Events Developer Guide.
    */
  def startDetectorModelAnalysis(): Request[StartDetectorModelAnalysisResponse, AWSError] = js.native
  def startDetectorModelAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ StartDetectorModelAnalysisResponse, Unit]): Request[StartDetectorModelAnalysisResponse, AWSError] = js.native
  /**
    * Performs an analysis of your detector model. For more information, see Troubleshooting a detector model in the AWS IoT Events Developer Guide.
    */
  def startDetectorModelAnalysis(params: StartDetectorModelAnalysisRequest): Request[StartDetectorModelAnalysisResponse, AWSError] = js.native
  def startDetectorModelAnalysis(
    params: StartDetectorModelAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDetectorModelAnalysisResponse, Unit]
  ): Request[StartDetectorModelAnalysisResponse, AWSError] = js.native
  
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds to or modifies the tags of the given resource. Tags are metadata that can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an alarm model. Any alarms that were created based on the previous version are deleted and then created again as new data arrives.
    */
  def updateAlarmModel(): Request[UpdateAlarmModelResponse, AWSError] = js.native
  def updateAlarmModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAlarmModelResponse, Unit]): Request[UpdateAlarmModelResponse, AWSError] = js.native
  /**
    * Updates an alarm model. Any alarms that were created based on the previous version are deleted and then created again as new data arrives.
    */
  def updateAlarmModel(params: UpdateAlarmModelRequest): Request[UpdateAlarmModelResponse, AWSError] = js.native
  def updateAlarmModel(
    params: UpdateAlarmModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAlarmModelResponse, Unit]
  ): Request[UpdateAlarmModelResponse, AWSError] = js.native
  
  /**
    * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created as new inputs arrive.
    */
  def updateDetectorModel(): Request[UpdateDetectorModelResponse, AWSError] = js.native
  def updateDetectorModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorModelResponse, Unit]): Request[UpdateDetectorModelResponse, AWSError] = js.native
  /**
    * Updates a detector model. Detectors (instances) spawned by the previous version are deleted and then re-created as new inputs arrive.
    */
  def updateDetectorModel(params: UpdateDetectorModelRequest): Request[UpdateDetectorModelResponse, AWSError] = js.native
  def updateDetectorModel(
    params: UpdateDetectorModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorModelResponse, Unit]
  ): Request[UpdateDetectorModelResponse, AWSError] = js.native
  
  /**
    * Updates an input.
    */
  def updateInput(): Request[UpdateInputResponse, AWSError] = js.native
  def updateInput(callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputResponse, Unit]): Request[UpdateInputResponse, AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(params: UpdateInputRequest): Request[UpdateInputResponse, AWSError] = js.native
  def updateInput(
    params: UpdateInputRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInputResponse, Unit]
  ): Request[UpdateInputResponse, AWSError] = js.native
}
