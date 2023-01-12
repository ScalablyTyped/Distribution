package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDatepickerCellArgs extends StObject {
  
  var date: js.Date
  
  var mode: DatepickerMode
}
object IDatepickerCellArgs {
  
  inline def apply(date: js.Date, mode: DatepickerMode): IDatepickerCellArgs = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerCellArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDatepickerCellArgs] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setMode(value: DatepickerMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
