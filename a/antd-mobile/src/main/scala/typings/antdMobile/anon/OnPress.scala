package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPress[T] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var style: js.UndefOr[T] = js.undefined
  
  var text: String
}
object OnPress {
  
  @scala.inline
  def apply[T](text: String): OnPress[T] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPress[T]]
  }
  
  @scala.inline
  implicit class OnPressMutableBuilder[Self <: OnPress[?], T] (val x: Self & OnPress[T]) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setStyle(value: T): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
