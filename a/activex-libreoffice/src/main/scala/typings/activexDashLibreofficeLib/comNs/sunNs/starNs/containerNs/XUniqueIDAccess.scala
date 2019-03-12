package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access contents via a unique ID. */
trait XUniqueIDAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the element with the specified unique ID. */
  def getByUniqueID(ID: java.lang.String): js.Any
  /** removes the element with the specified unique ID from this container. */
  def removeByUniqueID(ID: java.lang.String): scala.Unit
}

object XUniqueIDAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getByUniqueID: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByUniqueID: java.lang.String => scala.Unit
  ): XUniqueIDAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByUniqueID = js.Any.fromFunction1(getByUniqueID), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByUniqueID = js.Any.fromFunction1(removeByUniqueID))
  
    __obj.asInstanceOf[XUniqueIDAccess]
  }
}

