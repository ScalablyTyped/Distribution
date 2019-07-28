package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implement this interface to represent a set of states.
  *
  * The interface {@link XAccessibleStateSet} represents a set of states of an accessible object. It can hold any combination of states defined by the
  * constants collection {@link AccessibleStateType} .
  * @since OOo 1.1.2
  */
trait XAccessibleStateSet extends XInterface {
  /**
    * Get all currently set states as a sequence of state ids.
    *
    * The purpose of this function is to reduce the communication between accessibility objects and AT. Without this function an AT-Tool had to call {@link
    * contains()} for every state type. Now a single call is sufficient.
    * @returns The returned sequence contains one entry for every currently set state. This entry is the id of that state. The order of the states in the sequen
    */
  val States: SafeArray[Double]
  /**
    * Checks if the given state is a member of the state set of the called object.
    * @param aState The state for which to check membership. This has to be one of the constants of {@link AccessibleStateType} .
    * @returns Returns `TRUE` if the given state is a member of this object's state set and `FALSE` otherwise.
    */
  def contains(aState: Double): Boolean
  /**
    * Checks if all of the given states are in the state set of the called object.
    * @param aStateSet This sequence of states is interpreted as set and every of its members, duplicates are ignored, is checked for membership in this objec
    * @returns Returns `TRUE` if all states of the given state set are members of this object's state set. `FALSE` is returned if at least one of the states in
    */
  def containsAll(aStateSet: SeqEquiv[Double]): Boolean
  /**
    * Get all currently set states as a sequence of state ids.
    *
    * The purpose of this function is to reduce the communication between accessibility objects and AT. Without this function an AT-Tool had to call {@link
    * contains()} for every state type. Now a single call is sufficient.
    * @returns The returned sequence contains one entry for every currently set state. This entry is the id of that state. The order of the states in the sequen
    */
  def getStates(): SafeArray[Double]
  /**
    * Checks whether the current state set is empty.
    * @returns Returns `TRUE` if there is no state in this state set and `FALSE` if there is at least one set state in it.
    */
  def isEmpty(): Boolean
}

object XAccessibleStateSet {
  @scala.inline
  def apply(
    States: SafeArray[Double],
    acquire: () => Unit,
    contains: Double => Boolean,
    containsAll: SeqEquiv[Double] => Boolean,
    getStates: () => SafeArray[Double],
    isEmpty: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleStateSet = {
    val __obj = js.Dynamic.literal(States = States, acquire = js.Any.fromFunction0(acquire), contains = js.Any.fromFunction1(contains), containsAll = js.Any.fromFunction1(containsAll), getStates = js.Any.fromFunction0(getStates), isEmpty = js.Any.fromFunction0(isEmpty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleStateSet]
  }
}

