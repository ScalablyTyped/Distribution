package typings.ariClient.anon

import typings.ariClient.mod.IndexableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterIndexableObject extends js.Object {
  var filter: js.UndefOr[IndexableObject] = js.undefined
}

object FilterIndexableObject {
  @scala.inline
  def apply(filter: IndexableObject = null): FilterIndexableObject = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterIndexableObject]
  }
}

