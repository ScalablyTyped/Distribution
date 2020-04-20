package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.DocumentWindow
import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPresWn extends js.Object {
  val Pres: Presentation
  val Wn: DocumentWindow
}

object AnonPresWn {
  @scala.inline
  def apply(Pres: Presentation, Wn: DocumentWindow): AnonPresWn = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPresWn]
  }
}

