package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an interface for the new-style {@link DatabaseContext} service to implement.
  * @since LibreOffice 4.0
  */
trait XDatabaseContext
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XNamingService
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XSingleServiceFactory
     with XDatabaseRegistrations

object XDatabaseContext {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RegistrationNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    addContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => scala.Unit,
    changeDatabaseLocation: (java.lang.String, java.lang.String) => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    createInstance: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    createInstanceWithArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getByName: java.lang.String => js.Any,
    getDatabaseLocation: java.lang.String => java.lang.String,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getRegisteredObject: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getRegistrationNames: () => stdLib.SafeArray[java.lang.String],
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    hasRegisteredDatabase: java.lang.String => scala.Boolean,
    isDatabaseRegistrationReadOnly: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerDatabaseLocation: (java.lang.String, java.lang.String) => scala.Unit,
    registerObject: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface) => scala.Unit,
    release: () => scala.Unit,
    removeContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => scala.Unit,
    revokeDatabaseLocation: java.lang.String => scala.Unit,
    revokeObject: java.lang.String => scala.Unit
  ): XDatabaseContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, RegistrationNames = RegistrationNames, acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addDatabaseRegistrationsListener = js.Any.fromFunction1(addDatabaseRegistrationsListener), changeDatabaseLocation = js.Any.fromFunction2(changeDatabaseLocation), createEnumeration = js.Any.fromFunction0(createEnumeration), createInstance = js.Any.fromFunction0(createInstance), createInstanceWithArguments = js.Any.fromFunction1(createInstanceWithArguments), getByName = js.Any.fromFunction1(getByName), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), getRegistrationNames = js.Any.fromFunction0(getRegistrationNames), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), queryInterface = js.Any.fromFunction1(queryInterface), registerDatabaseLocation = js.Any.fromFunction2(registerDatabaseLocation), registerObject = js.Any.fromFunction2(registerObject), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeDatabaseRegistrationsListener = js.Any.fromFunction1(removeDatabaseRegistrationsListener), revokeDatabaseLocation = js.Any.fromFunction1(revokeDatabaseLocation), revokeObject = js.Any.fromFunction1(revokeObject))
  
    __obj.asInstanceOf[XDatabaseContext]
  }
}

