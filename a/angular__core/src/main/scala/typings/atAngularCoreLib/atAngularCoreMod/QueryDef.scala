package typings
package atAngularCoreLib.atAngularCoreMod

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
    val __obj = js.Dynamic.literal(bindings = bindings, filterId = filterId, id = id)
  
    __obj.asInstanceOf[QueryDef]
  }
}

