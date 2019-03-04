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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    RegistrationNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    addContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    addDatabaseRegistrationsListener: js.Function1[XDatabaseRegistrationsListener, scala.Unit],
    changeDatabaseLocation: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    createInstance: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    createInstanceWithArguments: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
    ],
    getByName: js.Function1[java.lang.String, js.Any],
    getDatabaseLocation: js.Function1[java.lang.String, java.lang.String],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getRegisteredObject: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getRegistrationNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    hasRegisteredDatabase: js.Function1[java.lang.String, scala.Boolean],
    isDatabaseRegistrationReadOnly: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerDatabaseLocation: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    registerObject: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    removeContainerListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener, 
      scala.Unit
    ],
    removeDatabaseRegistrationsListener: js.Function1[XDatabaseRegistrationsListener, scala.Unit],
    revokeDatabaseLocation: js.Function1[java.lang.String, scala.Unit],
    revokeObject: js.Function1[java.lang.String, scala.Unit]
  ): XDatabaseContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, RegistrationNames = RegistrationNames, acquire = acquire, addContainerListener = addContainerListener, addDatabaseRegistrationsListener = addDatabaseRegistrationsListener, changeDatabaseLocation = changeDatabaseLocation, createEnumeration = createEnumeration, createInstance = createInstance, createInstanceWithArguments = createInstanceWithArguments, getByName = getByName, getDatabaseLocation = getDatabaseLocation, getElementNames = getElementNames, getElementType = getElementType, getRegisteredObject = getRegisteredObject, getRegistrationNames = getRegistrationNames, hasByName = hasByName, hasElements = hasElements, hasRegisteredDatabase = hasRegisteredDatabase, isDatabaseRegistrationReadOnly = isDatabaseRegistrationReadOnly, queryInterface = queryInterface, registerDatabaseLocation = registerDatabaseLocation, registerObject = registerObject, release = release, removeContainerListener = removeContainerListener, removeDatabaseRegistrationsListener = removeDatabaseRegistrationsListener, revokeDatabaseLocation = revokeDatabaseLocation, revokeObject = revokeObject)
  
    __obj.asInstanceOf[XDatabaseContext]
  }
}

