package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XBitmap
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a trigger for an (user inter-)action.
  *
  * Common examples for such triggers are menu entries or toolbar icons.
  */
trait ActionTrigger extends js.Object {
  /** contains the command URL for the menu entry. */
  var CommandURL: String
  /** contains the a URL that points to a help text. */
  var HelpURL: String
  /** contains the menu item image. */
  var Image: XBitmap
  /** contains a sub menu. */
  var SubContainer: XIndexContainer
  /** contains the text of the menu entry. */
  var Text: String
}

object ActionTrigger {
  @scala.inline
  def apply(CommandURL: String, HelpURL: String, Image: XBitmap, SubContainer: XIndexContainer, Text: String): ActionTrigger = {
    val __obj = js.Dynamic.literal(CommandURL = CommandURL, HelpURL = HelpURL, Image = Image, SubContainer = SubContainer, Text = Text)
  
    __obj.asInstanceOf[ActionTrigger]
  }
}

