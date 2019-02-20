package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait Quickstart
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet {
  /** The first two parameters are ignored */
  def createAndSetVeto(p1: scala.Boolean, p2: scala.Boolean, DisableVeto: scala.Boolean): scala.Unit
  def createAutoStart(bQuickstart: scala.Boolean, bAutostart: scala.Boolean): scala.Unit
  def createDefault(): scala.Unit
  def createStart(bQuickstart: scala.Boolean): scala.Unit
}

