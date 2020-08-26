package typings.activexMsforms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexNumber extends js.Object {
  val Index: Double = js.native
}

object IndexNumber {
  @scala.inline
  def apply(Index: Double): IndexNumber = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexNumber]
  }
  @scala.inline
  implicit class IndexNumberOps[Self <: IndexNumber] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
  }
  
}

