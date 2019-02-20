package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

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
trait XAccessibleStateSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Get all currently set states as a sequence of state ids.
    *
    * The purpose of this function is to reduce the communication between accessibility objects and AT. Without this function an AT-Tool had to call {@link
    * contains()} for every state type. Now a single call is sufficient.
    * @returns The returned sequence contains one entry for every currently set state. This entry is the id of that state. The order of the states in the sequen
    */
  val States: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Checks if the given state is a member of the state set of the called object.
    * @param aState The state for which to check membership. This has to be one of the constants of {@link AccessibleStateType} .
    * @returns Returns `TRUE` if the given state is a member of this object's state set and `FALSE` otherwise.
    */
  def contains(aState: scala.Double): scala.Boolean
  /**
    * Checks if all of the given states are in the state set of the called object.
    * @param aStateSet This sequence of states is interpreted as set and every of its members, duplicates are ignored, is checked for membership in this objec
    * @returns Returns `TRUE` if all states of the given state set are members of this object's state set. `FALSE` is returned if at least one of the states in
    */
  def containsAll(aStateSet: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Boolean
  /**
    * Get all currently set states as a sequence of state ids.
    *
    * The purpose of this function is to reduce the communication between accessibility objects and AT. Without this function an AT-Tool had to call {@link
    * contains()} for every state type. Now a single call is sufficient.
    * @returns The returned sequence contains one entry for every currently set state. This entry is the id of that state. The order of the states in the sequen
    */
  def getStates(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * Checks whether the current state set is empty.
    * @returns Returns `TRUE` if there is no state in this state set and `FALSE` if there is at least one set state in it.
    */
  def isEmpty(): scala.Boolean
}

