package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPointNs.DocumentWindow
import typings.activexDashPowerpoint.PowerPointNs.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PresWn extends js.Object {
  val Pres: Presentation
  val Wn: DocumentWindow
}

object Anon_PresWn {
  @scala.inline
  def apply(Pres: Presentation, Wn: DocumentWindow): Anon_PresWn = {
    val __obj = js.Dynamic.literal(Pres = Pres, Wn = Wn)
  
    __obj.asInstanceOf[Anon_PresWn]
  }
}

