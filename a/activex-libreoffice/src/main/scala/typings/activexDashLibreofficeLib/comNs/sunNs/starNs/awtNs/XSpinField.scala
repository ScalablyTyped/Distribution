package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value of a spin field and makes it possible to register for spin events. */
trait XSpinField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers a listener for spin events. */
  def addSpinListener(l: XSpinListener): scala.Unit
  /** decreases the value by one step. */
  def down(): scala.Unit
  /** enables/disables automatic repeat mode. */
  def enableRepeat(bRepeat: scala.Boolean): scala.Unit
  /** sets the value to the previously set lower value. */
  def first(): scala.Unit
  /** sets the value to the previously set upper value. */
  def last(): scala.Unit
  /** unregisters a listener for spin events. */
  def removeSpinListener(l: XSpinListener): scala.Unit
  /** increases the value by one step. */
  def up(): scala.Unit
}

object XSpinField {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addSpinListener: XSpinListener => scala.Unit,
    down: () => scala.Unit,
    enableRepeat: scala.Boolean => scala.Unit,
    first: () => scala.Unit,
    last: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSpinListener: XSpinListener => scala.Unit,
    up: () => scala.Unit
  ): XSpinField = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSpinListener = js.Any.fromFunction1(addSpinListener), down = js.Any.fromFunction0(down), enableRepeat = js.Any.fromFunction1(enableRepeat), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSpinListener = js.Any.fromFunction1(removeSpinListener), up = js.Any.fromFunction0(up))
  
    __obj.asInstanceOf[XSpinField]
  }
}

