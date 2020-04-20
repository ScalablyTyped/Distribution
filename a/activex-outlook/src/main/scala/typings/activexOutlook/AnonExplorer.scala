package typings.activexOutlook

import typings.activexOutlook.Outlook.Explorer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExplorer extends js.Object {
  val Explorer: typings.activexOutlook.Outlook.Explorer
}

object AnonExplorer {
  @scala.inline
  def apply(Explorer: Explorer): AnonExplorer = {
    val __obj = js.Dynamic.literal(Explorer = Explorer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExplorer]
  }
}

