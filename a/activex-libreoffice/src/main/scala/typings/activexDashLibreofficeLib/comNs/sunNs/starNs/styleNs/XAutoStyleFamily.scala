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
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertStyle: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XAutoStyle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAutoStyleFamily = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = acquire, createEnumeration = createEnumeration, getElementType = getElementType, hasElements = hasElements, insertStyle = insertStyle, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAutoStyleFamily]
  }
}

