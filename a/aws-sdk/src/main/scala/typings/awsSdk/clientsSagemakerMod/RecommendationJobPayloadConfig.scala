package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobPayloadConfig extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where the sample payload is stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var SamplePayloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The supported MIME types for the input data.
    */
  var SupportedContentTypes: js.UndefOr[RecommendationJobSupportedContentTypes] = js.undefined
}
object RecommendationJobPayloadConfig {
  
  inline def apply(): RecommendationJobPayloadConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationJobPayloadConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecommendationJobPayloadConfig] (val x: Self) extends AnyVal {
    
    inline def setSamplePayloadUrl(value: String): Self = StObject.set(x, "SamplePayloadUrl", value.asInstanceOf[js.Any])
    
    inline def setSamplePayloadUrlUndefined: Self = StObject.set(x, "SamplePayloadUrl", js.undefined)
    
    inline def setSupportedContentTypes(value: RecommendationJobSupportedContentTypes): Self = StObject.set(x, "SupportedContentTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedContentTypesUndefined: Self = StObject.set(x, "SupportedContentTypes", js.undefined)
    
    inline def setSupportedContentTypesVarargs(value: String*): Self = StObject.set(x, "SupportedContentTypes", js.Array(value*))
  }
}
