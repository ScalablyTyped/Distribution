package typings.ava.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Title[Args /* <: js.Array[_] */] extends js.Object {
  var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.native
}

object Title {
  @scala.inline
  def apply[/* <: js.Array[_] */ Args](): Title[Args] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Title[Args]]
  }
  @scala.inline
  implicit class TitleOps[Self <: Title[_], /* <: js.Array[_] */ Args] (val x: Self with Title[Args]) extends AnyVal {
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
    def setTitle(value: (/* providedTitle */ js.UndefOr[String], /* args */ Args) => String): Self = this.set("title", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

