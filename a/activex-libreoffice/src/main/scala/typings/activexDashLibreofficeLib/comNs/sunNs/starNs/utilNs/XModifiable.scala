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
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[XModifyListener, scala.Unit],
    isModified: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeModifyListener: js.Function1[XModifyListener, scala.Unit],
    setModified: js.Function1[scala.Boolean, scala.Unit]
  ): XModifiable = {
    val __obj = js.Dynamic.literal(acquire = acquire, addModifyListener = addModifyListener, isModified = isModified, queryInterface = queryInterface, release = release, removeModifyListener = removeModifyListener, setModified = setModified)
  
    __obj.asInstanceOf[XModifiable]
  }
}

