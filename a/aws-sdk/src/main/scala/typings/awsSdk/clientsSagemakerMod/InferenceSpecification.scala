package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceSpecification extends StObject {
  
  /**
    * The Amazon ECR registry path of the Docker image that contains the inference code.
    */
  var Containers: ModelPackageContainerDefinitionList
  
  /**
    * The supported MIME types for the input data.
    */
  var SupportedContentTypes: ContentTypes
  
  /**
    * A list of the instance types that are used to generate inferences in real-time. This parameter is required for unversioned models, and optional for versioned models.
    */
  var SupportedRealtimeInferenceInstanceTypes: js.UndefOr[RealtimeInferenceInstanceTypes] = js.undefined
  
  /**
    * The supported MIME types for the output data.
    */
  var SupportedResponseMIMETypes: ResponseMIMETypes
  
  /**
    * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed. This parameter is required for unversioned models, and optional for versioned models.
    */
  var SupportedTransformInstanceTypes: js.UndefOr[TransformInstanceTypes] = js.undefined
}
object InferenceSpecification {
  
  inline def apply(
    Containers: ModelPackageContainerDefinitionList,
    SupportedContentTypes: ContentTypes,
    SupportedResponseMIMETypes: ResponseMIMETypes
  ): InferenceSpecification = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedResponseMIMETypes = SupportedResponseMIMETypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferenceSpecification]
  }
  
  extension [Self <: InferenceSpecification](x: Self) {
    
    inline def setContainers(value: ModelPackageContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersVarargs(value: ModelPackageContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setSupportedContentTypes(value: ContentTypes): Self = StObject.set(x, "SupportedContentTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "SupportedContentTypes", js.Array(value*))
    
    inline def setSupportedRealtimeInferenceInstanceTypes(value: RealtimeInferenceInstanceTypes): Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedRealtimeInferenceInstanceTypesUndefined: Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", js.undefined)
    
    inline def setSupportedRealtimeInferenceInstanceTypesVarargs(value: ProductionVariantInstanceType*): Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", js.Array(value*))
    
    inline def setSupportedResponseMIMETypes(value: ResponseMIMETypes): Self = StObject.set(x, "SupportedResponseMIMETypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedResponseMIMETypesVarargs(value: ResponseMIMEType*): Self = StObject.set(x, "SupportedResponseMIMETypes", js.Array(value*))
    
    inline def setSupportedTransformInstanceTypes(value: TransformInstanceTypes): Self = StObject.set(x, "SupportedTransformInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTransformInstanceTypesUndefined: Self = StObject.set(x, "SupportedTransformInstanceTypes", js.undefined)
    
    inline def setSupportedTransformInstanceTypesVarargs(value: TransformInstanceType*): Self = StObject.set(x, "SupportedTransformInstanceTypes", js.Array(value*))
  }
}
