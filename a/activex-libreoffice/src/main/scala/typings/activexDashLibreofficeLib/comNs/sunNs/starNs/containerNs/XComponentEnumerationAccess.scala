package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs

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
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    createComponentEnumeration: js.Function0[XComponentEnumeration],
    createEnumeration: js.Function0[XEnumeration],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XComponentEnumerationAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = acquire, createComponentEnumeration = createComponentEnumeration, createEnumeration = createEnumeration, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XComponentEnumerationAccess]
  }
}

