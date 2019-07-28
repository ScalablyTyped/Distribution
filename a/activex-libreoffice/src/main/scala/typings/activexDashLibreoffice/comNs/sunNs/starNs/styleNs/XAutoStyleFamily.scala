package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service contains the collection of automatic style families within the container document. */
trait XAutoStyleFamily extends XEnumerationAccess {
  def insertStyle(Values: PropertyValues): XAutoStyle
}

object XAutoStyleFamily {
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    insertStyle: PropertyValues => XAutoStyle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAutoStyleFamily = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertStyle = js.Any.fromFunction1(insertStyle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAutoStyleFamily]
  }
}

