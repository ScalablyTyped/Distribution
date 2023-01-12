package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoButton extends StObject {
  
  var goButton: js.UndefOr[ReactNode] = js.undefined
}
object GoButton {
  
  inline def apply(): GoButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoButton] (val x: Self) extends AnyVal {
    
    inline def setGoButton(value: ReactNode): Self = StObject.set(x, "goButton", value.asInstanceOf[js.Any])
    
    inline def setGoButtonUndefined: Self = StObject.set(x, "goButton", js.undefined)
  }
}
