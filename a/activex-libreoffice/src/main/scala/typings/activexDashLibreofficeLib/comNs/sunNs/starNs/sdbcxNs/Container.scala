package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes every container which is used for data definition. Each container must support access to its elements by the element's name or by the
  * element's position.
  *
  * Simple enumeration must be supported as well.
  *
  * To reflect the changes with the underlying database, a refresh mechanism needs to be supported.
  *
  * A container may support the possibility to add new elements or to drop existing elements. Additions are always done by descriptors which define the
  * properties of the new element.
  */
trait Container
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with XDataDescriptorFactory
     with XAppend
     with XDrop

object Container {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    addRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    appendByDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet => scala.Unit,
    createDataDescriptor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    dropByIndex: scala.Double => scala.Unit,
    dropByName: java.lang.String => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getByName: java.lang.String => js.Any,
    getCount: () => scala.Double,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removeRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit
  ): Container = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), appendByDescriptor = js.Any.fromFunction1(appendByDescriptor), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), createEnumeration = js.Any.fromFunction0(createEnumeration), dropByIndex = js.Any.fromFunction1(dropByIndex), dropByName = js.Any.fromFunction1(dropByName), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
  
    __obj.asInstanceOf[Container]
  }
}

