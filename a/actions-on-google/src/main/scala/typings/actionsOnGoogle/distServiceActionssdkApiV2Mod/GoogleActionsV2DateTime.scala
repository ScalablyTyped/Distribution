package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distServiceActionssdkConversationArgumentArgumentMod._Argument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DateTime
  extends StObject
     with _Argument {
  
  /**
    * Date value
    */
  var date: js.UndefOr[GoogleTypeDate] = js.undefined
  
  /**
    * Time value
    */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.undefined
}
object GoogleActionsV2DateTime {
  
  inline def apply(): GoogleActionsV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTime]
  }
  
  extension [Self <: GoogleActionsV2DateTime](x: Self) {
    
    inline def setDate(value: GoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setTime(value: GoogleTypeTimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
