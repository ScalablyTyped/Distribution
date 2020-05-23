package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typings.activexLibreoffice.com_.sun.star.util.XRefreshable
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
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), createEnumeration = js.Any.fromFunction0(createEnumeration), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[DefinitionContainer]
  }
}

