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
    acquire: js.Function0[scala.Unit],
    addSpinListener: js.Function1[XSpinListener, scala.Unit],
    down: js.Function0[scala.Unit],
    enableRepeat: js.Function1[scala.Boolean, scala.Unit],
    first: js.Function0[scala.Unit],
    last: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSpinListener: js.Function1[XSpinListener, scala.Unit],
    up: js.Function0[scala.Unit]
  ): XSpinField = {
    val __obj = js.Dynamic.literal(acquire = acquire, addSpinListener = addSpinListener, down = down, enableRepeat = enableRepeat, first = first, last = last, queryInterface = queryInterface, release = release, removeSpinListener = removeSpinListener, up = up)
  
    __obj.asInstanceOf[XSpinField]
  }
}

