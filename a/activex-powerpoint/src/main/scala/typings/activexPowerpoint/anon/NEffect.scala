package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.Effect
import typings.activexPowerpoint.PowerPoint.SlideShowWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NEffect extends js.Object {
  val Wn: SlideShowWindow = js.native
  val nEffect: Effect = js.native
}

object NEffect {
  @scala.inline
  def apply(Wn: SlideShowWindow, nEffect: Effect): NEffect = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any], nEffect = nEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEffect]
  }
  @scala.inline
  implicit class NEffectOps[Self <: NEffect] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setNEffect(value: Effect): Self = this.set("nEffect", value.asInstanceOf[js.Any])
  }
  
}

