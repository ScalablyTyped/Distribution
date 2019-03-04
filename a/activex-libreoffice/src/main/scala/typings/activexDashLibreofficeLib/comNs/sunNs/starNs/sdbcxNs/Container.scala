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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit],
    appendByDescriptor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    createDataDescriptor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    dropByIndex: js.Function1[scala.Double, scala.Unit],
    dropByName: js.Function1[java.lang.String, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeRefreshListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener, scala.Unit]
  ): Container = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, addRefreshListener = addRefreshListener, appendByDescriptor = appendByDescriptor, createDataDescriptor = createDataDescriptor, createEnumeration = createEnumeration, dropByIndex = dropByIndex, dropByName = dropByName, getByIndex = getByIndex, getByName = getByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, refresh = refresh, release = release, removeRefreshListener = removeRefreshListener)
  
    __obj.asInstanceOf[Container]
  }
}

