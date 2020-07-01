package typings.asana.anon

import typings.asana.mod.resources.NextPage
import typings.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T /* <: Resource */] extends js.Object {
  var data: js.Array[T]
  var next_page: js.UndefOr[NextPage] = js.undefined
}

object Data {
  @scala.inline
  def apply[/* <: typings.asana.mod.resources.Resource */ T](data: js.Array[T], next_page: NextPage = null): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

