package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.DocumentWindow
import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresWn extends js.Object {
  val Pres: Presentation
  val Wn: DocumentWindow
}

object PresWn {
  @scala.inline
  def apply(Pres: Presentation, Wn: DocumentWindow): PresWn = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresWn]
  }
}

