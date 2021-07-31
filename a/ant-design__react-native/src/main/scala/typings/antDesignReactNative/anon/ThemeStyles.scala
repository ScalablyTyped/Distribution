package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeStyles extends StObject {
  
  def themeStyles(): Unit
}
object ThemeStyles {
  
  @scala.inline
  def apply(themeStyles: () => Unit): ThemeStyles = {
    val __obj = js.Dynamic.literal(themeStyles = js.Any.fromFunction0(themeStyles))
    __obj.asInstanceOf[ThemeStyles]
  }
  
  @scala.inline
  implicit class ThemeStylesMutableBuilder[Self <: ThemeStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThemeStyles(value: () => Unit): Self = StObject.set(x, "themeStyles", js.Any.fromFunction0(value))
  }
}
