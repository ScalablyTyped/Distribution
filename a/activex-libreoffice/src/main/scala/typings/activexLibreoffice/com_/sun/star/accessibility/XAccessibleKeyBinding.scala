package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.KeyStroke
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
@js.native
trait XAccessibleKeyBinding extends XInterface {
  /**
    * Return the number of available key bindings.
    * @returns The returned value may be 0 to indicate that there are no key bindings or the positive number of the available key bindings.
    */
  val AccessibleKeyBindingCount: Double = js.native
  /**
    * The returned sequence of key strokes describes one method to invoke the associated action (the one from which you obtained the object at which you
    * called this method) by pressing keys. The keys specified by each of the returned key strokes have to be pressed at the same time (the Control-key and
    * the A-key for example). The keys of one key stroke have to be released before pressing those of the next. The order of the key strokes in the sequence
    * define the order in which to press them.
    * @param nIndex The index selects one of alternative key bindings. It has to non-negative and smaller then the number of key bindings as returned by the {
    * @returns The returned sequence of key strokes specifies one way to invoke the associated action. The sequence may be empty (but should not be; better not
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the index is not valid.
    */
  def getAccessibleKeyBinding(nIndex: Double): SafeArray[KeyStroke] = js.native
  /**
    * Return the number of available key bindings.
    * @returns The returned value may be 0 to indicate that there are no key bindings or the positive number of the available key bindings.
    */
  def getAccessibleKeyBindingCount(): Double = js.native
}

object XAccessibleKeyBinding {
  @scala.inline
  def apply(
    AccessibleKeyBindingCount: Double,
    acquire: () => Unit,
    getAccessibleKeyBinding: Double => SafeArray[KeyStroke],
    getAccessibleKeyBindingCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleKeyBinding = {
    val __obj = js.Dynamic.literal(AccessibleKeyBindingCount = AccessibleKeyBindingCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAccessibleKeyBinding = js.Any.fromFunction1(getAccessibleKeyBinding), getAccessibleKeyBindingCount = js.Any.fromFunction0(getAccessibleKeyBindingCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleKeyBinding]
  }
  @scala.inline
  implicit class XAccessibleKeyBindingOps[Self <: XAccessibleKeyBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibleKeyBindingCount(value: Double): Self = this.set("AccessibleKeyBindingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAccessibleKeyBinding(value: Double => SafeArray[KeyStroke]): Self = this.set("getAccessibleKeyBinding", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAccessibleKeyBindingCount(value: () => Double): Self = this.set("getAccessibleKeyBindingCount", js.Any.fromFunction0(value))
  }
  
}

