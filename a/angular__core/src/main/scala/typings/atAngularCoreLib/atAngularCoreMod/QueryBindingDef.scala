package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBindingDef extends js.Object {
  var bindingType: ɵQueryBindingType
  var propName: java.lang.String
}

object QueryBindingDef {
  @scala.inline
  def apply(bindingType: ɵQueryBindingType, propName: java.lang.String): QueryBindingDef = {
    val __obj = js.Dynamic.literal(bindingType = bindingType, propName = propName)
  
    __obj.asInstanceOf[QueryBindingDef]
  }
}

