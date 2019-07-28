package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import typings.std.SafeArray
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
  extends XNameAccess
     with XIndexAccess
     with XEnumerationAccess
     with XRefreshable
     with XDataDescriptorFactory
     with XAppend
     with XDrop

object Container {
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    appendByDescriptor: XPropertySet => Unit,
    createDataDescriptor: () => XPropertySet,
    createEnumeration: () => XEnumeration,
    dropByIndex: Double => Unit,
    dropByName: String => Unit,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeRefreshListener: XRefreshListener => Unit
  ): Container = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), appendByDescriptor = js.Any.fromFunction1(appendByDescriptor), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), createEnumeration = js.Any.fromFunction0(createEnumeration), dropByIndex = js.Any.fromFunction1(dropByIndex), dropByName = js.Any.fromFunction1(dropByName), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
  
    __obj.asInstanceOf[Container]
  }
}

