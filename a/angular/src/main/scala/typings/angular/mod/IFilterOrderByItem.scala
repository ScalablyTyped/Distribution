package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilterOrderByItem extends StObject {
  
  var index: js.Any
  
  var `type`: String
  
  var value: js.Any
}
object IFilterOrderByItem {
  
  inline def apply(index: js.Any, `type`: String, value: js.Any): IFilterOrderByItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterOrderByItem]
  }
  
  extension [Self <: IFilterOrderByItem](x: Self) {
    
    inline def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
