package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the basic interface for managing a set of SDBC drivers.
  *
  * When the method {@link com.sun.star.sdbc.XDriverManager.getConnection()} is called, the {@link DriverManager} will attempt to locate a suitable
  * driver.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XConnection
  */
trait XDriverManager
  extends StObject
     with XInterface {
  
  /**
    * gets the maximum time in seconds that a driver can wait when attempting to login to a database.
    * @returns the driver login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  var LoginTimeout: Double
  
  /**
    * attempts to establish a connection to the given database URL. The {@link DriverManager} attempts to select an appropriate driver from the set of
    * registered JDBC/SDBC drivers.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(url: String): XConnection
  
  /**
    * attempts to establish a connection to the given database URL. The {@link DriverManager} attempts to select an appropriate driver from the set of
    * registered JDBC/SDBC drivers.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @param info a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included
    * @returns the {@link Connection} object
    * @see com.sun.star.sdbc.ConnectionProperties
    * @throws SQLException if a database access error occurs.
    */
  def getConnectionWithInfo(url: String, info: SeqEquiv[PropertyValue]): XConnection
  
  /**
    * gets the maximum time in seconds that a driver can wait when attempting to login to a database.
    * @returns the driver login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def getLoginTimeout(): Double
  
  /**
    * sets the maximum time in seconds that a driver will wait while attempting to connect to a database.
    * @param seconds the login time limit in seconds
    * @throws SQLException if a database access error occurs.
    */
  def setLoginTimeout(seconds: Double): Unit
}
object XDriverManager {
  
  inline def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getLoginTimeout: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDriverManager = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
    __obj.asInstanceOf[XDriverManager]
  }
  
  extension [Self <: XDriverManager](x: Self) {
    
    inline def setGetConnection(value: String => XConnection): Self = StObject.set(x, "getConnection", js.Any.fromFunction1(value))
    
    inline def setGetConnectionWithInfo(value: (String, SeqEquiv[PropertyValue]) => XConnection): Self = StObject.set(x, "getConnectionWithInfo", js.Any.fromFunction2(value))
    
    inline def setGetLoginTimeout(value: () => Double): Self = StObject.set(x, "getLoginTimeout", js.Any.fromFunction0(value))
    
    inline def setLoginTimeout(value: Double): Self = StObject.set(x, "LoginTimeout", value.asInstanceOf[js.Any])
    
    inline def setSetLoginTimeout(value: Double => Unit): Self = StObject.set(x, "setLoginTimeout", js.Any.fromFunction1(value))
  }
}
