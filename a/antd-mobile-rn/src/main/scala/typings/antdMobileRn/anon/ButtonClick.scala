package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonClick extends StObject {
  
  def buttonClick(): Unit
  
  var buttonType: String
  
  var styles: StringDictionary[RegisteredStyle[Any]]
}
object ButtonClick {
  
  inline def apply(buttonClick: () => Unit, buttonType: String, styles: StringDictionary[RegisteredStyle[Any]]): ButtonClick = {
    val __obj = js.Dynamic.literal(buttonClick = js.Any.fromFunction0(buttonClick), buttonType = buttonType.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonClick] (val x: Self) extends AnyVal {
    
    inline def setButtonClick(value: () => Unit): Self = StObject.set(x, "buttonClick", js.Any.fromFunction0(value))
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
