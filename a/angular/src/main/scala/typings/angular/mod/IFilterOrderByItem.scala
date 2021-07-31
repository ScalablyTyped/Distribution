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
  
  @scala.inline
  def apply(index: js.Any, `type`: String, value: js.Any): IFilterOrderByItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterOrderByItem]
  }
  
  @scala.inline
  implicit class IFilterOrderByItemMutableBuilder[Self <: IFilterOrderByItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: js.Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
