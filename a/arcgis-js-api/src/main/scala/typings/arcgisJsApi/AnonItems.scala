package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItems[T /* <: Base */, Base] extends js.Object {
  var items: js.UndefOr[js.Array[T] | Collection[T]] = js.undefined
}

object AnonItems {
  @scala.inline
  def apply[T /* <: Base */, Base](items: js.Array[T] | Collection[T] = null): AnonItems[T, Base] = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItems[T, Base]]
  }
}

