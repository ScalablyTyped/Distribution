package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service contains the collection of automatic style families within the container document. */
trait XAutoStyleFamily
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess {
  def insertStyle(Values: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues): XAutoStyle
}

object XAutoStyleFamily {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasElements: () => scala.Boolean,
    insertStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues => XAutoStyle,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAutoStyleFamily = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertStyle = js.Any.fromFunction1(insertStyle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAutoStyleFamily]
  }
}

