package typings
package asanaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T /* <: asanaLib.asanaMod.resourcesNs.Resource */] extends js.Object {
  var data: js.Array[T]
  var next_page: js.UndefOr[asanaLib.asanaMod.resourcesNs.NextPage] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply[T /* <: asanaLib.asanaMod.resourcesNs.Resource */](data: js.Array[T], next_page: asanaLib.asanaMod.resourcesNs.NextPage = null): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(data = data)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page)
    __obj.asInstanceOf[Anon_Data[T]]
  }
}

