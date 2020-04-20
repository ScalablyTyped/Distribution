package typings.activexOutlook

import typings.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPages extends js.Object {
  val Pages: PropertyPages
}

object AnonPages {
  @scala.inline
  def apply(Pages: PropertyPages): AnonPages = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPages]
  }
}

