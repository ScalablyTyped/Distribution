package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBindingDef extends js.Object {
  var bindingType: ɵQueryBindingType
  var propName: String
}

object QueryBindingDef {
  @scala.inline
  def apply(bindingType: ɵQueryBindingType, propName: String): QueryBindingDef = {
    val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBindingDef]
  }
}

