package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownIcon extends StObject {
  
  var downIcon: js.UndefOr[ReactNode] = js.undefined
  
  var upIcon: js.UndefOr[ReactNode] = js.undefined
}
object DownIcon {
  
  inline def apply(): DownIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownIcon] (val x: Self) extends AnyVal {
    
    inline def setDownIcon(value: ReactNode): Self = StObject.set(x, "downIcon", value.asInstanceOf[js.Any])
    
    inline def setDownIconUndefined: Self = StObject.set(x, "downIcon", js.undefined)
    
    inline def setUpIcon(value: ReactNode): Self = StObject.set(x, "upIcon", value.asInstanceOf[js.Any])
    
    inline def setUpIconUndefined: Self = StObject.set(x, "upIcon", js.undefined)
  }
}
