package typings
package arcgisDashJsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Items[T /* <: Base */] extends js.Object {
  var items: js.UndefOr[js.Array[T] | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]] = js.undefined
}

object Anon_Items {
  @scala.inline
  def apply[T /* <: Base */](items: js.Array[T] | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T] = null): Anon_Items[T] = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Items[T]]
  }
}

