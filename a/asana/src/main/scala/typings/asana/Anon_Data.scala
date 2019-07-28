package typings.asana

import typings.asana.asanaMod.resourcesNs.NextPage
import typings.asana.asanaMod.resourcesNs.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T /* <: Resource */] extends js.Object {
  var data: js.Array[T]
  var next_page: js.UndefOr[NextPage] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply[T /* <: Resource */](data: js.Array[T], next_page: NextPage = null): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page)
    __obj.asInstanceOf[Anon_Data[T]]
  }
}

