package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var partial: Boolean = js.native
}

object Data {
  @scala.inline
  def apply[T](partial: Boolean): Data[T] = {
    val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

