package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.Effect
import typings.activexPowerpoint.PowerPoint.SlideShowWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NEffect extends js.Object {
  val Wn: SlideShowWindow
  val nEffect: Effect
}

object NEffect {
  @scala.inline
  def apply(Wn: SlideShowWindow, nEffect: Effect): NEffect = {
    val __obj = js.Dynamic.literal(Wn = Wn.asInstanceOf[js.Any], nEffect = nEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEffect]
  }
}

