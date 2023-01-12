package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItemsFlexDirection extends StObject {
  
  var alignItems: String
  
  var flexDirection: String
}
object AlignItemsFlexDirection {
  
  inline def apply(alignItems: String, flexDirection: String): AlignItemsFlexDirection = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsFlexDirection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignItemsFlexDirection] (val x: Self) extends AnyVal {
    
    inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
  }
}
