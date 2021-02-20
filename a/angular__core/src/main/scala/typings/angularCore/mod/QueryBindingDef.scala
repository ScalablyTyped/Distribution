package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryBindingDef extends StObject {
  
  var bindingType: ɵQueryBindingType = js.native
  
  var propName: String = js.native
}
object QueryBindingDef {
  
  @scala.inline
  def apply(bindingType: ɵQueryBindingType, propName: String): QueryBindingDef = {
    val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBindingDef]
  }
  
  @scala.inline
  implicit class QueryBindingDefMutableBuilder[Self <: QueryBindingDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingType(value: ɵQueryBindingType): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
  }
}
