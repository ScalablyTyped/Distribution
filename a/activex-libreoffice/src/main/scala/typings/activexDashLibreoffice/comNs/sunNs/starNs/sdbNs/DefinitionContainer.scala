package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XSingleServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a container which provides access to database related definitions like commands, forms, and reports.
  *
  * The container supports access to its elements by the elements name or by the elements position.
  *
  * Simple enumeration must be supported as well.
  *
  * To reflect the changes with the underlying database, a refresh mechanism needs to be supported.
  */
trait DefinitionContainer
  extends XNameContainer
     with XIndexAccess
     with XEnumerationAccess
     with XRefreshable
     with XSingleServiceFactory

object DefinitionContainer {
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addRefreshListener: XRefreshListener => Unit,
    createEnumeration: () => XEnumeration,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeByName: String => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    replaceByName: (String, js.Any) => Unit
  ): DefinitionContainer = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), createEnumeration = js.Any.fromFunction0(createEnumeration), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[DefinitionContainer]
  }
}

