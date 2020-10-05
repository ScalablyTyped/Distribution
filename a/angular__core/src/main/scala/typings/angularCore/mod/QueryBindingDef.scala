package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryBindingDef extends js.Object {
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
  implicit class QueryBindingDefOps[Self <: QueryBindingDef] (val x: Self) extends AnyVal {
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
    def setBindingType(value: ɵQueryBindingType): Self = this.set("bindingType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropName(value: String): Self = this.set("propName", value.asInstanceOf[js.Any])
  }
  
}

