package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickFeedback extends StObject {
  
  /**
    * The Unix timestamp when the result was clicked.
    */
  var ClickTime: js.Date
  
  /**
    * The identifier of the search result that was clicked.
    */
  var ResultId: typings.awsSdk.clientsKendraMod.ResultId
}
object ClickFeedback {
  
  inline def apply(ClickTime: js.Date, ResultId: ResultId): ClickFeedback = {
    val __obj = js.Dynamic.literal(ClickTime = ClickTime.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickFeedback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickFeedback] (val x: Self) extends AnyVal {
    
    inline def setClickTime(value: js.Date): Self = StObject.set(x, "ClickTime", value.asInstanceOf[js.Any])
    
    inline def setResultId(value: ResultId): Self = StObject.set(x, "ResultId", value.asInstanceOf[js.Any])
  }
}
