package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPress extends StObject {
  
  def onPress(): Unit
}
object OnPress {
  
  @scala.inline
  def apply(onPress: () => Unit): OnPress = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[OnPress]
  }
  
  @scala.inline
  implicit class OnPressMutableBuilder[Self <: OnPress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
  }
}
