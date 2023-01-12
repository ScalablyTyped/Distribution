package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobCompiledOutputConfig extends StObject {
  
  /**
    * Identifies the Amazon S3 bucket where you want SageMaker to store the compiled model artifacts.
    */
  var S3OutputUri: js.UndefOr[S3Uri] = js.undefined
}
object RecommendationJobCompiledOutputConfig {
  
  inline def apply(): RecommendationJobCompiledOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationJobCompiledOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationJobCompiledOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setS3OutputUri(value: S3Uri): Self = StObject.set(x, "S3OutputUri", value.asInstanceOf[js.Any])
    
    inline def setS3OutputUriUndefined: Self = StObject.set(x, "S3OutputUri", js.undefined)
  }
}
