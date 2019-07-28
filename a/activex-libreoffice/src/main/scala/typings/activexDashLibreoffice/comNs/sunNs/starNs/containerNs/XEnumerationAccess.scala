package typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs

import typings.activexDashLibreoffice.`type`
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
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEnumerationAccess]
  }
}

