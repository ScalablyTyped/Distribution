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

