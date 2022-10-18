package typings.antd.anon

import typings.rcMenu.esInterfaceMod.MenuMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd.antd/lib/menu.MenuProps, 'mode'> */
trait PickMenuPropsmode extends StObject {
  
  var mode: js.UndefOr[MenuMode] = js.undefined
}
object PickMenuPropsmode {
  
  inline def apply(): PickMenuPropsmode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMenuPropsmode]
  }
  
  extension [Self <: PickMenuPropsmode](x: Self) {
    
    inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
