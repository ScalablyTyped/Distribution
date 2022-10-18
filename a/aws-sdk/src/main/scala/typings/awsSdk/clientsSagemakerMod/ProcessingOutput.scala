package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingOutput extends StObject {
  
  /**
    * When True, output operations such as data upload are managed natively by the processing job application. When False (default), output operations are managed by Amazon SageMaker.
    */
  var AppManaged: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppManaged] = js.undefined
  
  /**
    * Configuration for processing job outputs in Amazon SageMaker Feature Store. This processing output type is only supported when AppManaged is specified. 
    */
  var FeatureStoreOutput: js.UndefOr[ProcessingFeatureStoreOutput] = js.undefined
  
  /**
    * The name for the processing job output.
    */
  var OutputName: String
  
  /**
    * Configuration for processing job outputs in Amazon S3.
    */
  var S3Output: js.UndefOr[ProcessingS3Output] = js.undefined
}
object ProcessingOutput {
  
  inline def apply(OutputName: String): ProcessingOutput = {
    val __obj = js.Dynamic.literal(OutputName = OutputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingOutput]
  }
  
  extension [Self <: ProcessingOutput](x: Self) {
    
    inline def setAppManaged(value: AppManaged): Self = StObject.set(x, "AppManaged", value.asInstanceOf[js.Any])
    
    inline def setAppManagedUndefined: Self = StObject.set(x, "AppManaged", js.undefined)
    
    inline def setFeatureStoreOutput(value: ProcessingFeatureStoreOutput): Self = StObject.set(x, "FeatureStoreOutput", value.asInstanceOf[js.Any])
    
    inline def setFeatureStoreOutputUndefined: Self = StObject.set(x, "FeatureStoreOutput", js.undefined)
    
    inline def setOutputName(value: String): Self = StObject.set(x, "OutputName", value.asInstanceOf[js.Any])
    
    inline def setS3Output(value: ProcessingS3Output): Self = StObject.set(x, "S3Output", value.asInstanceOf[js.Any])
    
    inline def setS3OutputUndefined: Self = StObject.set(x, "S3Output", js.undefined)
  }
}
