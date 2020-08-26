package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pres extends js.Object {
  val Pres: Presentation = js.native
}

object Pres {
  @scala.inline
  def apply(Pres: Presentation): Pres = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pres]
  }
  @scala.inline
  implicit class PresOps[Self <: Pres] (val x: Self) extends AnyVal {
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
    def setPres(value: Presentation): Self = this.set("Pres", value.asInstanceOf[js.Any])
  }
  
}

