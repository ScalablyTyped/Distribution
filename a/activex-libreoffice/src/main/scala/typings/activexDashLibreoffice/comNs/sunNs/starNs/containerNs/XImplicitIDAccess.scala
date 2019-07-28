package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to access contents through an implicit (unique) ID. */
trait XImplicitIDAccess extends XElementAccess {
  /** @returns a sequence with all existing implicit IDs. */
  val ImplicitIDs: SafeArray[String]
  /** @returns the element with the specified implicit ID. */
  def getByImplicitID(ID: String): js.Any
  /** @returns a sequence with all existing implicit IDs. */
  def getImplicitIDs(): SafeArray[String]
}

object XImplicitIDAccess {
  @scala.inline
  def apply(
    ElementType: `type`,
    ImplicitIDs: SafeArray[String],
    acquire: () => Unit,
    getByImplicitID: String => js.Any,
    getElementType: () => `type`,
    getImplicitIDs: () => SafeArray[String],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImplicitIDAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, ImplicitIDs = ImplicitIDs, acquire = js.Any.fromFunction0(acquire), getByImplicitID = js.Any.fromFunction1(getByImplicitID), getElementType = js.Any.fromFunction0(getElementType), getImplicitIDs = js.Any.fromFunction0(getImplicitIDs), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XImplicitIDAccess]
  }
}

