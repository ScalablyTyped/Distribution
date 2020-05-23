package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the value of a spin field and makes it possible to register for spin events. */
trait XSpinField extends XInterface {
  /** registers a listener for spin events. */
  def addSpinListener(l: XSpinListener): Unit
  /** decreases the value by one step. */
  def down(): Unit
  /** enables/disables automatic repeat mode. */
  def enableRepeat(bRepeat: Boolean): Unit
  /** sets the value to the previously set lower value. */
  def first(): Unit
  /** sets the value to the previously set upper value. */
  def last(): Unit
  /** unregisters a listener for spin events. */
  def removeSpinListener(l: XSpinListener): Unit
  /** increases the value by one step. */
  def up(): Unit
}

object XSpinField {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSpinListener: XSpinListener => Unit,
    down: () => Unit,
    enableRepeat: Boolean => Unit,
    first: () => Unit,
    last: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSpinListener: XSpinListener => Unit,
    up: () => Unit
  ): XSpinField = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSpinListener = js.Any.fromFunction1(addSpinListener), down = js.Any.fromFunction0(down), enableRepeat = js.Any.fromFunction1(enableRepeat), first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSpinListener = js.Any.fromFunction1(removeSpinListener), up = js.Any.fromFunction0(up))
    __obj.asInstanceOf[XSpinField]
  }
}

