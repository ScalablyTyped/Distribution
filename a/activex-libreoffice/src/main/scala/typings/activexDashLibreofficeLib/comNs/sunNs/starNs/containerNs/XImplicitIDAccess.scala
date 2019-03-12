package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access contents through an implicit (unique) ID. */
trait XImplicitIDAccess extends XElementAccess {
  /** @returns a sequence with all existing implicit IDs. */
  val ImplicitIDs: stdLib.SafeArray[java.lang.String]
  /** @returns the element with the specified implicit ID. */
  def getByImplicitID(ID: java.lang.String): js.Any
  /** @returns a sequence with all existing implicit IDs. */
  def getImplicitIDs(): stdLib.SafeArray[java.lang.String]
}

object XImplicitIDAccess {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    ImplicitIDs: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getByImplicitID: java.lang.String => js.Any,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getImplicitIDs: () => stdLib.SafeArray[java.lang.String],
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XImplicitIDAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, ImplicitIDs = ImplicitIDs, acquire = js.Any.fromFunction0(acquire), getByImplicitID = js.Any.fromFunction1(getByImplicitID), getElementType = js.Any.fromFunction0(getElementType), getImplicitIDs = js.Any.fromFunction0(getImplicitIDs), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XImplicitIDAccess]
  }
}

