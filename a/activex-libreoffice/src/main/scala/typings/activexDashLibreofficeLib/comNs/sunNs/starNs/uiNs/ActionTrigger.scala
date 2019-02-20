package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

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
  var CommandURL: java.lang.String
  /** contains the a URL that points to a help text. */
  var HelpURL: java.lang.String
  /** contains the menu item image. */
  var Image: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap
  /** contains a sub menu. */
  var SubContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexContainer
  /** contains the text of the menu entry. */
  var Text: java.lang.String
}

