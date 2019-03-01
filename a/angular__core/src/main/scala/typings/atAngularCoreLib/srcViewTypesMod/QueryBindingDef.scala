package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBindingDef extends js.Object {
  var bindingType: QueryBindingType
  var propName: java.lang.String
}

object QueryBindingDef {
  @scala.inline
  def apply(bindingType: QueryBindingType, propName: java.lang.String): QueryBindingDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindingType")(bindingType)
    __obj.updateDynamic("propName")(propName)
    __obj.asInstanceOf[QueryBindingDef]
  }
}

