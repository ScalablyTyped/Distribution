package typings.asana

import typings.asana.mod.resources.NextPage
import typings.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[T /* <: Resource */] extends js.Object {
  var data: js.Array[T]
  var next_page: js.UndefOr[NextPage] = js.undefined
}

object AnonData {
  @scala.inline
  def apply[T /* <: Resource */](data: js.Array[T], next_page: NextPage = null): AnonData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData[T]]
  }
}

