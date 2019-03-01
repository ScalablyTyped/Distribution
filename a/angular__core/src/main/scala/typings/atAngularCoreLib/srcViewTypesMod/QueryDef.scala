package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDef extends js.Object {
  var bindings: js.Array[QueryBindingDef]
  var filterId: scala.Double
  var id: scala.Double
}

object QueryDef {
  @scala.inline
  def apply(bindings: js.Array[QueryBindingDef], filterId: scala.Double, id: scala.Double): QueryDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindings")(bindings)
    __obj.updateDynamic("filterId")(filterId)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[QueryDef]
  }
}

