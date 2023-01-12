package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecommendationTemplateResponse extends StObject {
  
  /**
    * The newly created recommendation template, returned as an object. This object includes the template's name, format, status, tags, Amazon S3 bucket location, and more.
    */
  var recommendationTemplate: js.UndefOr[RecommendationTemplate] = js.undefined
}
object CreateRecommendationTemplateResponse {
  
  inline def apply(): CreateRecommendationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRecommendationTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRecommendationTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setRecommendationTemplate(value: RecommendationTemplate): Self = StObject.set(x, "recommendationTemplate", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTemplateUndefined: Self = StObject.set(x, "recommendationTemplate", js.undefined)
  }
}
