package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsPosition extends StObject {
  
  var alignItems: String
  
  var position: String
}
object AlignItemsPosition {
  
  inline def apply(alignItems: String, position: String): AlignItemsPosition = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignItemsPosition] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
