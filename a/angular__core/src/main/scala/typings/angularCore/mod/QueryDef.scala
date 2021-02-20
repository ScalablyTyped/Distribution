package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDef extends StObject {
  
  var bindings: js.Array[QueryBindingDef] = js.native
  
  var filterId: Double = js.native
  
  var id: Double = js.native
}
object QueryDef {
  
  @scala.inline
  def apply(bindings: js.Array[QueryBindingDef], filterId: Double, id: Double): QueryDef = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], filterId = filterId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDef]
  }
  
  @scala.inline
  implicit class QueryDefMutableBuilder[Self <: QueryDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[QueryBindingDef]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsVarargs(value: QueryBindingDef*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setFilterId(value: Double): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
