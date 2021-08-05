package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsFlex extends StObject {
  
  var alignItems: String
  
  var flex: Double
  
  var height: Double
  
  var justifyContent: String
}
object AlignItemsFlex {
  
  inline def apply(alignItems: String, flex: Double, height: Double, justifyContent: String): AlignItemsFlex = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsFlex]
  }
  
  extension [Self <: AlignItemsFlex](x: Self) {
    
    inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
  }
}
