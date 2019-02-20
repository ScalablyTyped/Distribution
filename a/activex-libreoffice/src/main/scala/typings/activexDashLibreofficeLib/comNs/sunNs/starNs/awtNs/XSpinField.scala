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

