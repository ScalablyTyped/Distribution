package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TheaterMode extends js.Object {
  val TheaterMode: Boolean = js.native
}

object TheaterMode {
  @scala.inline
  def apply(TheaterMode: Boolean): TheaterMode = {
    val __obj = js.Dynamic.literal(TheaterMode = TheaterMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TheaterMode]
  }
  @scala.inline
  implicit class TheaterModeOps[Self <: TheaterMode] (val x: Self) extends AnyVal {
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
    def setTheaterMode(value: Boolean): Self = this.set("TheaterMode", value.asInstanceOf[js.Any])
  }
  
}

