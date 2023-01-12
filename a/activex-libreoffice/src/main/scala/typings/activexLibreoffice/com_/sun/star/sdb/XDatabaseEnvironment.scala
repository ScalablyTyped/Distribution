package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDriverManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is not to be used anymore.
  * @deprecated Deprecated
  */
trait XDatabaseEnvironment
  extends StObject
     with XDriverManager {
  
  def createDatabaseAccess(URL: String, title: String): XDatabaseAccess
  
  def getDatabaseAccess(URL: String): XDatabaseAccess
}
object XDatabaseEnvironment {
  
  inline def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    createDatabaseAccess: (String, String) => XDatabaseAccess,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDatabaseAccess: String => XDatabaseAccess,
    getLoginTimeout: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDatabaseEnvironment = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createDatabaseAccess = js.Any.fromFunction2(createDatabaseAccess), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDatabaseAccess = js.Any.fromFunction1(getDatabaseAccess), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
    __obj.asInstanceOf[XDatabaseEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDatabaseEnvironment] (val x: Self) extends AnyVal {
    
    inline def setCreateDatabaseAccess(value: (String, String) => XDatabaseAccess): Self = StObject.set(x, "createDatabaseAccess", js.Any.fromFunction2(value))
    
    inline def setGetDatabaseAccess(value: String => XDatabaseAccess): Self = StObject.set(x, "getDatabaseAccess", js.Any.fromFunction1(value))
  }
}
