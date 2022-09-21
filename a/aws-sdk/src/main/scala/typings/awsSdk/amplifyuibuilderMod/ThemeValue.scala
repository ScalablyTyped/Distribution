package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeValue extends StObject {
  
  /**
    * A list of key-value pairs that define the theme's properties.
    */
  var children: js.UndefOr[ThemeValuesList] = js.undefined
  
  /**
    * The value of a theme property.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ThemeValue {
  
  inline def apply(): ThemeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeValue]
  }
  
  extension [Self <: ThemeValue](x: Self) {
    
    inline def setChildren(value: ThemeValuesList): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ThemeValues*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
