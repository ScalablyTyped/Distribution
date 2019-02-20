package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to register for action events of an image button and sets the action command. */
trait XImageButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers a listener for action events. */
  def addActionListener(l: XActionListener): scala.Unit
  /** unregisters a listener for action events. */
  def removeActionListener(l: XActionListener): scala.Unit
  /** sets the action command string. */
  def setActionCommand(Command: java.lang.String): scala.Unit
}

