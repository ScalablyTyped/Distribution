package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var Cancel: Boolean
  val Pres: Presentation
}

object AnonCancel {
  @scala.inline
  def apply(Cancel: Boolean, Pres: Presentation): AnonCancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pres = Pres.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancel]
  }
}

