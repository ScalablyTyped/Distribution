package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.argumentArgumentMod._Argument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DateTime extends _Argument {
  
  /**
    * Date value
    */
  var date: js.UndefOr[GoogleTypeDate] = js.native
  
  /**
    * Time value
    */
  var time: js.UndefOr[GoogleTypeTimeOfDay] = js.native
}
object GoogleActionsV2DateTime {
  
  @scala.inline
  def apply(): GoogleActionsV2DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTime]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DateTimeMutableBuilder[Self <: GoogleActionsV2DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: GoogleTypeDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setTime(value: GoogleTypeTimeOfDay): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
