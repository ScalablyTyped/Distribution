package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoButton extends StObject {
  
  var goButton: js.UndefOr[ReactNode] = js.undefined
}
object GoButton {
  
  @scala.inline
  def apply(): GoButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoButton]
  }
  
  @scala.inline
  implicit class GoButtonMutableBuilder[Self <: GoButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoButton(value: ReactNode): Self = StObject.set(x, "goButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoButtonUndefined: Self = StObject.set(x, "goButton", js.undefined)
  }
}
