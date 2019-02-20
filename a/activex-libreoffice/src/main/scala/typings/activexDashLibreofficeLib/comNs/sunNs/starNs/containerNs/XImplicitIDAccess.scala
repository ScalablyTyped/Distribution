package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access contents through an implicit (unique) ID. */
trait XImplicitIDAccess extends XElementAccess {
  /** @returns a sequence with all existing implicit IDs. */
  val ImplicitIDs: activexDashInteropLib.SafeArray[java.lang.String]
  /** @returns the element with the specified implicit ID. */
  def getByImplicitID(ID: java.lang.String): js.Any
  /** @returns a sequence with all existing implicit IDs. */
  def getImplicitIDs(): activexDashInteropLib.SafeArray[java.lang.String]
}

