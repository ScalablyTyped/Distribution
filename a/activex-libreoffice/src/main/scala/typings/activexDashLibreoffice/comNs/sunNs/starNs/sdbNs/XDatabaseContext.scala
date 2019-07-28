package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XContainerListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XSingleServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XNamingService
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an interface for the new-style {@link DatabaseContext} service to implement.
  * @since LibreOffice 4.0
  */
trait XDatabaseContext
  extends XEnumerationAccess
     with XNameAccess
     with XNamingService
     with XContainer
     with XSingleServiceFactory
     with XDatabaseRegistrations

object XDatabaseContext {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    RegistrationNames: SafeArray[String],
    acquire: () => Unit,
    addContainerListener: XContainerListener => Unit,
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Unit,
    changeDatabaseLocation: (String, String) => Unit,
    createEnumeration: () => XEnumeration,
    createInstance: () => XInterface,
    createInstanceWithArguments: SeqEquiv[_] => XInterface,
    getByName: String => js.Any,
    getDatabaseLocation: String => String,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getRegisteredObject: String => XInterface,
    getRegistrationNames: () => SafeArray[String],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    hasRegisteredDatabase: String => Boolean,
    isDatabaseRegistrationReadOnly: String => Boolean,
    queryInterface: `type` => js.Any,
    registerDatabaseLocation: (String, String) => Unit,
    registerObject: (String, XInterface) => Unit,
    release: () => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => Unit,
    revokeDatabaseLocation: String => Unit,
    revokeObject: String => Unit
  ): XDatabaseContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, RegistrationNames = RegistrationNames, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addDatabaseRegistrationsListener = js.Any.fromFunction1(addDatabaseRegistrationsListener), changeDatabaseLocation = js.Any.fromFunction2(changeDatabaseLocation), createEnumeration = js.Any.fromFunction0(createEnumeration), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByName = js.Any.fromFunction1(getByName), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), getRegistrationNames = js.Any.fromFunction0(getRegistrationNames), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), registerDatabaseLocation = js.Any.fromFunction2(registerDatabaseLocation), registerObject = js.Any.fromFunction2(registerObject), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeDatabaseRegistrationsListener = js.Any.fromFunction1(removeDatabaseRegistrationsListener), revokeDatabaseLocation = js.Any.fromFunction1(revokeDatabaseLocation), revokeObject = js.Any.fromFunction1(revokeObject))
  
    __obj.asInstanceOf[XDatabaseContext]
  }
}

