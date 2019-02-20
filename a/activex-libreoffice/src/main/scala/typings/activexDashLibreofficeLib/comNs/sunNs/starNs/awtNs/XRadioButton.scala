package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the state of a radio button and makes it possible to register item event listeners. */
trait XRadioButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  var State: scala.Boolean
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** returns `TRUE` if the button is checked, `FALSE` otherwise. */
  def getState(): scala.Boolean
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
  /** sets the label of the radio button. */
  def setLabel(Label: java.lang.String): scala.Unit
  /** sets the state of the radio button. */
  def setState(b: scala.Boolean): scala.Unit
}

