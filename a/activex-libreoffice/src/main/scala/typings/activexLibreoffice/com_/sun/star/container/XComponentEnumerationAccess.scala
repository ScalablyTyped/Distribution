package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides a factory for a typified enumeration through a collection of components. */
trait XComponentEnumerationAccess extends XEnumerationAccess {
  /** creates a new instance of enumeration through components. */
  def createComponentEnumeration(): XComponentEnumeration
}

object XComponentEnumerationAccess {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createComponentEnumeration: () => XComponentEnumeration,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XComponentEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createComponentEnumeration = js.Any.fromFunction0(createComponentEnumeration), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XComponentEnumerationAccess]
  }
}

