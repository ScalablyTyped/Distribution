package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visible extends StObject {
  
  var value: Any
  
  var visible: Any
}
object Visible {
  
  inline def apply(value: Any, visible: Any): Visible = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visible]
  }
  
  extension [Self <: Visible](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
