package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobContainerConfig extends StObject {
  
  /**
    * Specifies the name and shape of the expected data inputs for your trained model with a JSON dictionary form. This field is used for optimizing your model using SageMaker Neo. For more information, see DataInputConfig.
    */
  var DataInputConfig: js.UndefOr[RecommendationJobDataInputConfig] = js.undefined
  
  /**
    * The machine learning domain of the model and its components. Valid Values: COMPUTER_VISION | NATURAL_LANGUAGE_PROCESSING | MACHINE_LEARNING 
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * The machine learning framework of the container image. Valid Values: TENSORFLOW | PYTORCH | XGBOOST | SAGEMAKER-SCIKIT-LEARN 
    */
  var Framework: js.UndefOr[String] = js.undefined
  
  /**
    * The framework version of the container image.
    */
  var FrameworkVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a pre-trained machine learning model benchmarked by Amazon SageMaker Inference Recommender that matches your model. Valid Values: efficientnetb7 | unet | xgboost | faster-rcnn-resnet101 | nasnetlarge | vgg16 | inception-v3 | mask-rcnn | sagemaker-scikit-learn | densenet201-gluon | resnet18v2-gluon | xception | densenet201 | yolov4 | resnet152 | bert-base-cased | xceptionV1-keras | resnet50 | retinanet 
    */
  var NearestModelName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the SamplePayloadUrl and all other sample payload-related fields.
    */
  var PayloadConfig: js.UndefOr[RecommendationJobPayloadConfig] = js.undefined
  
  /**
    * A list of the instance types that are used to generate inferences in real-time.
    */
  var SupportedInstanceTypes: js.UndefOr[RecommendationJobSupportedInstanceTypes] = js.undefined
  
  /**
    * The machine learning task that the model accomplishes. Valid Values: IMAGE_CLASSIFICATION | OBJECT_DETECTION | TEXT_GENERATION | IMAGE_SEGMENTATION | FILL_MASK | CLASSIFICATION | REGRESSION | OTHER 
    */
  var Task: js.UndefOr[String] = js.undefined
}
object RecommendationJobContainerConfig {
  
  inline def apply(): RecommendationJobContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationJobContainerConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationJobContainerConfig] (val x: Self) extends AnyVal {
    
    inline def setDataInputConfig(value: RecommendationJobDataInputConfig): Self = StObject.set(x, "DataInputConfig", value.asInstanceOf[js.Any])
    
    inline def setDataInputConfigUndefined: Self = StObject.set(x, "DataInputConfig", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    inline def setFrameworkVersion(value: String): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersionUndefined: Self = StObject.set(x, "FrameworkVersion", js.undefined)
    
    inline def setNearestModelName(value: String): Self = StObject.set(x, "NearestModelName", value.asInstanceOf[js.Any])
    
    inline def setNearestModelNameUndefined: Self = StObject.set(x, "NearestModelName", js.undefined)
    
    inline def setPayloadConfig(value: RecommendationJobPayloadConfig): Self = StObject.set(x, "PayloadConfig", value.asInstanceOf[js.Any])
    
    inline def setPayloadConfigUndefined: Self = StObject.set(x, "PayloadConfig", js.undefined)
    
    inline def setSupportedInstanceTypes(value: RecommendationJobSupportedInstanceTypes): Self = StObject.set(x, "SupportedInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedInstanceTypesUndefined: Self = StObject.set(x, "SupportedInstanceTypes", js.undefined)
    
    inline def setSupportedInstanceTypesVarargs(value: String*): Self = StObject.set(x, "SupportedInstanceTypes", js.Array(value*))
    
    inline def setTask(value: String): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "Task", js.undefined)
  }
}
