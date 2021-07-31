package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: Element
  
  var mode: String
  
  def onClick(): Unit
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
}
object Icon {
  
  @scala.inline
  def apply(
    icon: Element,
    mode: String,
    onClick: () => Unit,
    styles: StringDictionary[RegisteredStyle[js.Any]]
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
