package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec extends StObject {
  
  /**
    * This is used to create prompt to ask for date only.
    * For example: What date are you looking for?
    */
  var requestDateText: js.UndefOr[String] = js.undefined
  
  /**
    * This is used to create initial prompt by datetime sub-dialog.
    * Example question: \"What date and time do you want?\"
    */
  var requestDatetimeText: js.UndefOr[String] = js.undefined
  
  /**
    * This is used to create prompt to ask for time only.
    * For example: What time?
    */
  var requestTimeText: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec {
  
  inline def apply(): GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec]
  }
  
  extension [Self <: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec](x: Self) {
    
    inline def setRequestDateText(value: String): Self = StObject.set(x, "requestDateText", value.asInstanceOf[js.Any])
    
    inline def setRequestDateTextUndefined: Self = StObject.set(x, "requestDateText", js.undefined)
    
    inline def setRequestDatetimeText(value: String): Self = StObject.set(x, "requestDatetimeText", value.asInstanceOf[js.Any])
    
    inline def setRequestDatetimeTextUndefined: Self = StObject.set(x, "requestDatetimeText", js.undefined)
    
    inline def setRequestTimeText(value: String): Self = StObject.set(x, "requestTimeText", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeTextUndefined: Self = StObject.set(x, "requestTimeText", js.undefined)
  }
}
