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

object XImplicitIDAccess {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    ImplicitIDs: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getByImplicitID: js.Function1[java.lang.String, js.Any],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getImplicitIDs: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XImplicitIDAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, ImplicitIDs = ImplicitIDs, acquire = acquire, getByImplicitID = getByImplicitID, getElementType = getElementType, getImplicitIDs = getImplicitIDs, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XImplicitIDAccess]
  }
}

