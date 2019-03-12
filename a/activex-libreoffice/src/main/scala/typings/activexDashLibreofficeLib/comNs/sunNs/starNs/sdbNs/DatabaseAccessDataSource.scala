package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a factory to create data access beans. Data access beans are shared among components, so if an already existing bean is requested, the existing one
  * is returned.
  * @deprecated Deprecated
  */
trait DatabaseAccessDataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XDataSource
     with XCompletedConnection {
  /** determines the password handling. */
  var PasswordMode: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication
  /** locates the database access bean. */
  var URL: java.lang.String
}

object DatabaseAccessDataSource {
  @scala.inline
  def apply(
    LoginTimeout: scala.Double,
    PasswordMode: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.RememberAuthentication,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    URL: java.lang.String,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    connectWithCompletion: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getConnection: (java.lang.String, java.lang.String) => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    getLoginTimeout: () => scala.Double,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setLoginTimeout: scala.Double => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DatabaseAccessDataSource = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, PasswordMode = PasswordMode, PropertySetInfo = PropertySetInfo, URL = URL, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), getConnection = js.Any.fromFunction2(getConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DatabaseAccessDataSource]
  }
}

