package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InferenceSpecification extends js.Object {
  /**
    * The Amazon ECR registry path of the Docker image that contains the inference code.
    */
  var Containers: ModelPackageContainerDefinitionList
  /**
    * The supported MIME types for the input data.
    */
  var SupportedContentTypes: ContentTypes
  /**
    * A list of the instance types that are used to generate inferences in real-time.
    */
  var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes
  /**
    * The supported MIME types for the output data.
    */
  var SupportedResponseMIMETypes: ResponseMIMETypes
  /**
    * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
    */
  var SupportedTransformInstanceTypes: TransformInstanceTypes
}

object InferenceSpecification {
  @scala.inline
  def apply(
    Containers: ModelPackageContainerDefinitionList,
    SupportedContentTypes: ContentTypes,
    SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes,
    SupportedResponseMIMETypes: ResponseMIMETypes,
    SupportedTransformInstanceTypes: TransformInstanceTypes
  ): InferenceSpecification = {
    val __obj = js.Dynamic.literal(Containers = Containers, SupportedContentTypes = SupportedContentTypes, SupportedRealtimeInferenceInstanceTypes = SupportedRealtimeInferenceInstanceTypes, SupportedResponseMIMETypes = SupportedResponseMIMETypes, SupportedTransformInstanceTypes = SupportedTransformInstanceTypes)
  
    __obj.asInstanceOf[InferenceSpecification]
  }
}

