package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackageContainerDefinition extends StObject {
  
  /**
    * The DNS host name for the Docker container.
    */
  var ContainerHostname: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ContainerHostname] = js.undefined
  
  /**
    * The environment variables to set in the Docker container. Each key and value in the Environment string to string map can have length of up to 1024. We support up to 16 entries in the map.
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.undefined
  
  /**
    * The machine learning framework of the model package container image.
    */
  var Framework: js.UndefOr[String] = js.undefined
  
  /**
    * The framework version of the Model Package Container Image.
    */
  var FrameworkVersion: js.UndefOr[ModelPackageFrameworkVersion] = js.undefined
  
  /**
    * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own custom algorithm instead of an algorithm provided by SageMaker, the inference code must meet SageMaker requirements. SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker.
    */
  var Image: ContainerImage
  
  /**
    * An MD5 hash of the training algorithm that identifies the Docker image used for training.
    */
  var ImageDigest: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ImageDigest] = js.undefined
  
  /**
    * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).  The model artifacts must be in an S3 bucket that is in the same region as the model package. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * A structure with Model Input details.
    */
  var ModelInput: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelInput] = js.undefined
  
  /**
    * The name of a pre-trained machine learning benchmarked by Amazon SageMaker Inference Recommender model that matches your model. You can find a list of benchmarked models by calling ListModelMetadata.
    */
  var NearestModelName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Marketplace product ID of the model package.
    */
  var ProductId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ProductId] = js.undefined
}
object ModelPackageContainerDefinition {
  
  inline def apply(Image: ContainerImage): ModelPackageContainerDefinition = {
    val __obj = js.Dynamic.literal(Image = Image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageContainerDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelPackageContainerDefinition] (val x: Self) extends AnyVal {
    
    inline def setContainerHostname(value: ContainerHostname): Self = StObject.set(x, "ContainerHostname", value.asInstanceOf[js.Any])
    
    inline def setContainerHostnameUndefined: Self = StObject.set(x, "ContainerHostname", js.undefined)
    
    inline def setEnvironment(value: EnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    inline def setFrameworkVersion(value: ModelPackageFrameworkVersion): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersionUndefined: Self = StObject.set(x, "FrameworkVersion", js.undefined)
    
    inline def setImage(value: ContainerImage): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "ImageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "ImageDigest", js.undefined)
    
    inline def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
    
    inline def setModelDataUrlUndefined: Self = StObject.set(x, "ModelDataUrl", js.undefined)
    
    inline def setModelInput(value: ModelInput): Self = StObject.set(x, "ModelInput", value.asInstanceOf[js.Any])
    
    inline def setModelInputUndefined: Self = StObject.set(x, "ModelInput", js.undefined)
    
    inline def setNearestModelName(value: String): Self = StObject.set(x, "NearestModelName", value.asInstanceOf[js.Any])
    
    inline def setNearestModelNameUndefined: Self = StObject.set(x, "NearestModelName", js.undefined)
    
    inline def setProductId(value: ProductId): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
  }
}
