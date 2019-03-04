package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to enumerate objects in a container which contains objects. */
trait XEnumerationAccess extends XElementAccess {
  /** @returns a new enumeration object for this container. It returns NULL if there are no objects in this container. */
  def createEnumeration(): XEnumeration
}

object XEnumerationAccess {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[XEnumeration],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = acquire, createEnumeration = createEnumeration, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEnumerationAccess]
  }
}

