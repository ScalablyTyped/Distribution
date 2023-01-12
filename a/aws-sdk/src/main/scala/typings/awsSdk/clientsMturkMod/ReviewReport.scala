package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewReport extends StObject {
  
  /**
    *  A list of ReviewAction objects for each action specified in the Review Policy. 
    */
  var ReviewActions: js.UndefOr[ReviewActionDetailList] = js.undefined
  
  /**
    *  A list of ReviewResults objects for each action specified in the Review Policy. 
    */
  var ReviewResults: js.UndefOr[ReviewResultDetailList] = js.undefined
}
object ReviewReport {
  
  inline def apply(): ReviewReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReviewReport] (val x: Self) extends AnyVal {
    
    inline def setReviewActions(value: ReviewActionDetailList): Self = StObject.set(x, "ReviewActions", value.asInstanceOf[js.Any])
    
    inline def setReviewActionsUndefined: Self = StObject.set(x, "ReviewActions", js.undefined)
    
    inline def setReviewActionsVarargs(value: ReviewActionDetail*): Self = StObject.set(x, "ReviewActions", js.Array(value*))
    
    inline def setReviewResults(value: ReviewResultDetailList): Self = StObject.set(x, "ReviewResults", value.asInstanceOf[js.Any])
    
    inline def setReviewResultsUndefined: Self = StObject.set(x, "ReviewResults", js.undefined)
    
    inline def setReviewResultsVarargs(value: ReviewResultDetail*): Self = StObject.set(x, "ReviewResults", js.Array(value*))
  }
}
