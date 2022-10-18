package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFeedbackRequest extends StObject {
  
  /**
    *  The feedback from customers is about the recommendations in this insight. 
    */
  var InsightFeedback: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.InsightFeedback] = js.undefined
}
object PutFeedbackRequest {
  
  inline def apply(): PutFeedbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutFeedbackRequest]
  }
  
  extension [Self <: PutFeedbackRequest](x: Self) {
    
    inline def setInsightFeedback(value: InsightFeedback): Self = StObject.set(x, "InsightFeedback", value.asInstanceOf[js.Any])
    
    inline def setInsightFeedbackUndefined: Self = StObject.set(x, "InsightFeedback", js.undefined)
  }
}
