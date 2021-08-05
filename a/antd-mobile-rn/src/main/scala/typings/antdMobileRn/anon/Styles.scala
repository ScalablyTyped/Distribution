package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactNative.mod.RegisteredStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Styles extends StObject {
  
  var styles: StringDictionary[RegisteredStyle[js.Any]]
}
object Styles {
  
  inline def apply(styles: StringDictionary[RegisteredStyle[js.Any]]): Styles = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styles]
  }
  
  extension [Self <: Styles](x: Self) {
    
    inline def setStyles(value: StringDictionary[RegisteredStyle[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
