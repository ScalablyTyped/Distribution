package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface can be used to represent any number of key bindings which then can be associated to a certain action.
  *
  * There can be zero, one, or more key bindings. Each key binding consists of a sequence of {@link com.sun.star.awt.KeyStroke} objects. The association
  * of an action with a key binding is established by the {@link XAccessibleAction} interface returning an {@link XAccessibleKeyBinding} object.
  *
  * A key binding describes alternative ways how to invoke an action with pressing one or more keys after each other. Each individual sequence of key
  * strokes
  * @since OOo 1.1.2
  */
trait XAccessibleKeyBinding
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Return the number of available key bindings.
    * @returns The returned value may be 0 to indicate that there are no key bindings or the positive number of the available key bindings.
    */
  val AccessibleKeyBindingCount: scala.Double
  /**
    * The returned sequence of key strokes describes one method to invoke the associated action (the one from which you obtained the object at which you
    * called this method) by pressing keys. The keys specified by each of the returned key strokes have to be pressed at the same time (the Control-key and
    * the A-key for example). The keys of one key stroke have to be released before pressing those of the next. The order of the key strokes in the sequence
    * define the order in which to press them.
    * @param nIndex The index selects one of alternative key bindings. It has to non-negative and smaller then the number of key bindings as returned by the {
    * @returns The returned sequence of key strokes specifies one way to invoke the associated action. The sequence may be empty (but should not be; better not
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is not valid.
    */
  def getAccessibleKeyBinding(nIndex: scala.Double): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyStroke]
  /**
    * Return the number of available key bindings.
    * @returns The returned value may be 0 to indicate that there are no key bindings or the positive number of the available key bindings.
    */
  def getAccessibleKeyBindingCount(): scala.Double
}

