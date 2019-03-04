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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    connectWithCompletion: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    getConnection: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection
    ],
    getLoginTimeout: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DatabaseAccessDataSource = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, PasswordMode = PasswordMode, PropertySetInfo = PropertySetInfo, URL = URL, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, connectWithCompletion = connectWithCompletion, getConnection = getConnection, getLoginTimeout = getLoginTimeout, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setLoginTimeout = setLoginTimeout, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DatabaseAccessDataSource]
  }
}

