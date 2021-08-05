package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorFlex extends StObject {
  
  var backgroundColor: String
  
  var flex: Double
}
object BackgroundColorFlex {
  
  inline def apply(backgroundColor: String, flex: Double): BackgroundColorFlex = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorFlex]
  }
  
  extension [Self <: BackgroundColorFlex](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
  }
}
