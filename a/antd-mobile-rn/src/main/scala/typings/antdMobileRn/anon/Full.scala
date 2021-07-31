package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: Boolean
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
}
object Full {
  
  @scala.inline
  def apply(full: Boolean, styles: StringDictionary[RegisteredStyle[js.Any]]): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  
  @scala.inline
  implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
