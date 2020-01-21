package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDef extends js.Object {
  var bindings: js.Array[QueryBindingDef]
  var filterId: Double
  var id: Double
}

object QueryDef {
  @scala.inline
  def apply(bindings: js.Array[QueryBindingDef], filterId: Double, id: Double): QueryDef = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], filterId = filterId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryDef]
  }
}

