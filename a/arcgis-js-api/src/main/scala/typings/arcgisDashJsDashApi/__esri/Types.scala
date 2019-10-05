package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types[T /* <: Base */, Base] extends js.Object {
  var base: Constructor[Base] | js.Function
  var key: String | (js.Function1[/* obj */ js.Any, String])
  var typeMap: HashMap[Constructor[T]]
}

object Types {
  @scala.inline
  def apply[T /* <: Base */, Base](
    base: Constructor[Base] | js.Function,
    key: String | (js.Function1[/* obj */ js.Any, String]),
    typeMap: HashMap[Constructor[T]]
  ): Types[T, Base] = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], typeMap = typeMap)
  
    __obj.asInstanceOf[Types[T, Base]]
  }
}

