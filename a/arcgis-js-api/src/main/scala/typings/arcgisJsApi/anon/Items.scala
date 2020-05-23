package typings.arcgisJsApi.anon

import typings.arcgisJsApi.esri.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items[T /* <: Base */, Base] extends js.Object {
  var items: js.UndefOr[js.Array[T] | Collection[T]] = js.undefined
}

object Items {
  @scala.inline
  def apply[T, Base](items: js.Array[T] | Collection[T] = null): Items[T, Base] = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[T, Base]]
  }
}

