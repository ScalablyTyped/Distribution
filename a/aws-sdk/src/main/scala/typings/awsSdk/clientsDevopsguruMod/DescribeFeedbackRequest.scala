package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFeedbackRequest extends StObject {
  
  /**
    *  The ID of the insight for which the feedback was provided. 
    */
  var InsightId: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.InsightId] = js.undefined
}
object DescribeFeedbackRequest {
  
  inline def apply(): DescribeFeedbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFeedbackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFeedbackRequest] (val x: Self) extends AnyVal {
    
    inline def setInsightId(value: InsightId): Self = StObject.set(x, "InsightId", value.asInstanceOf[js.Any])
    
    inline def setInsightIdUndefined: Self = StObject.set(x, "InsightId", js.undefined)
  }
}
