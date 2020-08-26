package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.SlideShowWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wn extends js.Object {
  val Wn: SlideShowWindow = js.native
}

object Wn {
  @scala.inline
  def apply(Wn: SlideShowWindow): Wn = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wn]
  }
  @scala.inline
  implicit class WnOps[Self <: Wn] (val x: Self) extends AnyVal {
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
    def setWn(value: SlideShowWindow): Self = this.set("Wn", value.asInstanceOf[js.Any])
  }
  
}

