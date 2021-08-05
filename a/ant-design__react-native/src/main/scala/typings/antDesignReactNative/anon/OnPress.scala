package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPress extends StObject {
  
  var mode: String
  
  def onPress(): Unit
}
object OnPress {
  
  inline def apply(mode: String, onPress: () => Unit): OnPress = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[OnPress]
  }
  
  extension [Self <: OnPress](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
  }
}
