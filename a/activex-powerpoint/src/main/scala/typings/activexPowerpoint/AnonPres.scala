package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPres extends js.Object {
  val Pres: Presentation
}

object AnonPres {
  @scala.inline
  def apply(Pres: Presentation): AnonPres = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPres]
  }
}

