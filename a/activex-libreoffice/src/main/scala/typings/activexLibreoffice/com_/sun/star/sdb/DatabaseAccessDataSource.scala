package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.ucb.RememberAuthentication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a factory to create data access beans. Data access beans are shared among components, so if an already existing bean is requested, the existing one
  * is returned.
  * @deprecated Deprecated
  */
trait DatabaseAccessDataSource
  extends StObject
     with XPropertySet
     with XDataSource
     with XCompletedConnection {
  
  /** determines the password handling. */
  var PasswordMode: RememberAuthentication
  
  /** locates the database access bean. */
  var URL: String
}
object DatabaseAccessDataSource {
  
  inline def apply(
    LoginTimeout: Double,
    PasswordMode: RememberAuthentication,
    PropertySetInfo: XPropertySetInfo,
    URL: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    connectWithCompletion: XInteractionHandler => XConnection,
    getConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setLoginTimeout: Double => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DatabaseAccessDataSource = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], PasswordMode = PasswordMode.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), connectWithCompletion = js.Any.fromFunction1(connectWithCompletion), getConnection = js.Any.fromFunction2(getConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DatabaseAccessDataSource]
  }
  
  extension [Self <: DatabaseAccessDataSource](x: Self) {
    
    inline def setPasswordMode(value: RememberAuthentication): Self = StObject.set(x, "PasswordMode", value.asInstanceOf[js.Any])
    
    inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
