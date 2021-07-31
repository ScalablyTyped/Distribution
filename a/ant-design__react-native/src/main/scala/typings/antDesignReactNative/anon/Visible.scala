package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  var value: js.Any
  
  var visible: js.Any
}
object Visible {
  
  @scala.inline
  def apply(value: js.Any, visible: js.Any): Visible = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
  
  @scala.inline
  implicit class VisibleMutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: js.Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
