package typings
package awsDashSdkLib.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTEvents
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTEvents: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a detector model.
    */
  def createDetectorModel(): awsDashSdkLib.libRequestMod.Request[CreateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDetectorModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a detector model.
    */
  def createDetectorModel(params: CreateDetectorModelRequest): awsDashSdkLib.libRequestMod.Request[CreateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDetectorModel(
    params: CreateDetectorModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an input.
    */
  def createInput(): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an input.
    */
  def createInput(params: CreateInputRequest): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createInput(
    params: CreateInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a detector model. Any active instances of the detector model are also deleted.
    */
  def deleteDetectorModel(): awsDashSdkLib.libRequestMod.Request[DeleteDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDetectorModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a detector model. Any active instances of the detector model are also deleted.
    */
  def deleteDetectorModel(params: DeleteDetectorModelRequest): awsDashSdkLib.libRequestMod.Request[DeleteDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDetectorModel(
    params: DeleteDetectorModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an input.
    */
  def deleteInput(): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an input.
    */
  def deleteInput(params: DeleteInputRequest): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteInput(
    params: DeleteInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a detector model. If the version parameter is not specified, information about the latest version is returned.
    */
  def describeDetectorModel(): awsDashSdkLib.libRequestMod.Request[DescribeDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDetectorModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a detector model. If the version parameter is not specified, information about the latest version is returned.
    */
  def describeDetectorModel(params: DescribeDetectorModelRequest): awsDashSdkLib.libRequestMod.Request[DescribeDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDetectorModel(
    params: DescribeDetectorModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an input.
    */
  def describeInput(): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes an input.
    */
  def describeInput(params: DescribeInputRequest): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeInput(
    params: DescribeInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Events logging options.
    */
  def describeLoggingOptions(): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoggingOptions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current settings of the AWS IoT Events logging options.
    */
  def describeLoggingOptions(params: DescribeLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLoggingOptions(
    params: DescribeLoggingOptionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLoggingOptionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLoggingOptionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the versions of a detector model. Only the metadata associated with each detector model version is returned.
    */
  def listDetectorModelVersions(): awsDashSdkLib.libRequestMod.Request[ListDetectorModelVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectorModelVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorModelVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorModelVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all the versions of a detector model. Only the metadata associated with each detector model version is returned.
    */
  def listDetectorModelVersions(params: ListDetectorModelVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListDetectorModelVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectorModelVersions(
    params: ListDetectorModelVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorModelVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorModelVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
    */
  def listDetectorModels(): awsDashSdkLib.libRequestMod.Request[ListDetectorModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectorModels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorModelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the detector models you have created. Only the metadata associated with each detector model is returned.
    */
  def listDetectorModels(params: ListDetectorModelsRequest): awsDashSdkLib.libRequestMod.Request[ListDetectorModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectorModels(
    params: ListDetectorModelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorModelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorModelsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the inputs you have created.
    */
  def listInputs(): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInputs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the inputs you have created.
    */
  def listInputs(params: ListInputsRequest): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInputs(
    params: ListInputsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInputsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInputsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags (metadata) you have assigned to the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Events logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to five minutes for that change to take effect.
    */
  def putLoggingOptions(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLoggingOptions(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets or updates the AWS IoT Events logging options. Note that if you update the value of any loggingOptions field, it takes up to one minute for the change to take effect. Also, if you change the policy attached to the role you specified in the roleArn field (for example, to correct an invalid policy) it takes up to five minutes for that change to take effect.
    */
  def putLoggingOptions(params: PutLoggingOptionsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putLoggingOptions(
    params: PutLoggingOptionsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add to or modifies the tags of the given resource. Tags are metadata which can be used to manage a resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the given tags (metadata) from the resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a detector model. Detectors (instances) spawned by the previous version will be deleted and re-created as new inputs arrive.
    */
  def updateDetectorModel(): awsDashSdkLib.libRequestMod.Request[UpdateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDetectorModel(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a detector model. Detectors (instances) spawned by the previous version will be deleted and re-created as new inputs arrive.
    */
  def updateDetectorModel(params: UpdateDetectorModelRequest): awsDashSdkLib.libRequestMod.Request[UpdateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDetectorModel(
    params: UpdateDetectorModelRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDetectorModelResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDetectorModelResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInput(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an input.
    */
  def updateInput(params: UpdateInputRequest): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateInput(
    params: UpdateInputRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateInputResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateInputResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

