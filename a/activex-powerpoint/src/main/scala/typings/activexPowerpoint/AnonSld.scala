package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSld extends js.Object {
  val Sld: Slide
}

object AnonSld {
  @scala.inline
  def apply(Sld: Slide): AnonSld = {
    val __obj = js.Dynamic.literal(Sld = Sld.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSld]
  }
}

