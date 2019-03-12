package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes the modify state of the object accessible.
  *
  * Additionally, it makes it possible to register listener objects, which get notification whenever the status or content of the object changes.
  */
trait XModifiable extends XModifyBroadcaster {
  /** @returns `TRUE` if the object is modified.  The modification is always in relation to a certain state (i.e., the initial, loaded, or last stored version). */
  def isModified(): scala.Boolean
  /** sets the status of the **modified** -flag from outside of the object. */
  def setModified(bModified: scala.Boolean): scala.Unit
}

object XModifiable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addModifyListener: XModifyListener => scala.Unit,
    isModified: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeModifyListener: XModifyListener => scala.Unit,
    setModified: scala.Boolean => scala.Unit
  ): XModifiable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), isModified = js.Any.fromFunction0(isModified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setModified = js.Any.fromFunction1(setModified))
  
    __obj.asInstanceOf[XModifiable]
  }
}

