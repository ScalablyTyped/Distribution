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
    acquire: js.Function0[scala.Unit],
    getByUniqueID: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByUniqueID: js.Function1[java.lang.String, scala.Unit]
  ): XUniqueIDAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire, getByUniqueID = getByUniqueID, queryInterface = queryInterface, release = release, removeByUniqueID = removeByUniqueID)
  
    __obj.asInstanceOf[XUniqueIDAccess]
  }
}

