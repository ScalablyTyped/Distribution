package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDef extends js.Object {
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
  implicit class QueryDefOps[Self <: QueryDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindingsVarargs(value: QueryBindingDef*): Self = this.set("bindings", js.Array(value :_*))
    @scala.inline
    def setBindings(value: js.Array[QueryBindingDef]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterId(value: Double): Self = this.set("filterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

