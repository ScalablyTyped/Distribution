package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var Cancel: Boolean
  val Pres: Presentation
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, Pres: Presentation): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Pres = Pres.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

