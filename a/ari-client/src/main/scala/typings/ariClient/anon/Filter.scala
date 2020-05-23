package typings.ariClient.anon

import typings.ariClient.mod.IndexableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var applicationName: String
  var filter: js.UndefOr[IndexableObject] = js.undefined
}

object Filter {
  @scala.inline
  def apply(applicationName: String, filter: IndexableObject = null): Filter = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

