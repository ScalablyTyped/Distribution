package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullScreen extends js.Object {
  val FullScreen: Boolean = js.native
}

object FullScreen {
  @scala.inline
  def apply(FullScreen: Boolean): FullScreen = {
    val __obj = js.Dynamic.literal(FullScreen = FullScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullScreen]
  }
  @scala.inline
  implicit class FullScreenOps[Self <: FullScreen] (val x: Self) extends AnyVal {
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
    def setFullScreen(value: Boolean): Self = this.set("FullScreen", value.asInstanceOf[js.Any])
  }
  
}

