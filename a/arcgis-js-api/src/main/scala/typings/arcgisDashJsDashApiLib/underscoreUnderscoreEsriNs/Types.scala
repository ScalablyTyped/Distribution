package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types[T /* <: Base */, Base] extends js.Object {
  var base: Constructor[Base] | js.Function
  var key: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String])
  var typeMap: arcgisDashJsDashApiLib.HashMap[Constructor[T]]
}

object Types {
  @scala.inline
  def apply[T /* <: Base */, Base](
    base: Constructor[Base] | js.Function,
    key: java.lang.String | (js.Function1[/* obj */ js.Any, java.lang.String]),
    typeMap: arcgisDashJsDashApiLib.HashMap[Constructor[T]]
  ): Types[T, Base] = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], typeMap = typeMap)
  
    __obj.asInstanceOf[Types[T, Base]]
  }
}

