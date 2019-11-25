package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: Boolean
  val Pres: Presentation
}

object Anon_Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Pres: Presentation): Anon_Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pres = Pres.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

