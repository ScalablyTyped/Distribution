package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccess
  extends StObject
     with XDataSource {
  
  def addDatabaseAccessListener(listener: XDatabaseAccessListener): Unit
  
  def getIsolatedConnection(user: String, password: String): XConnection
  
  def hasConnections(): Boolean
  
  def removeDatabaseAccessListener(listener: XDatabaseAccessListener): Unit
  
  def suspendConnections(): Boolean
}
object XDatabaseAccess {
  
  inline def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    addDatabaseAccessListener: XDatabaseAccessListener => Unit,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    hasConnections: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeDatabaseAccessListener: XDatabaseAccessListener => Unit,
    setLoginTimeout: Double => Unit,
    suspendConnections: () => Boolean
  ): XDatabaseAccess = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDatabaseAccessListener = js.Any.fromFunction1(addDatabaseAccessListener), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), hasConnections = js.Any.fromFunction0(hasConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseAccessListener = js.Any.fromFunction1(removeDatabaseAccessListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), suspendConnections = js.Any.fromFunction0(suspendConnections))
    __obj.asInstanceOf[XDatabaseAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDatabaseAccess] (val x: Self) extends AnyVal {
    
    inline def setAddDatabaseAccessListener(value: XDatabaseAccessListener => Unit): Self = StObject.set(x, "addDatabaseAccessListener", js.Any.fromFunction1(value))
    
    inline def setGetIsolatedConnection(value: (String, String) => XConnection): Self = StObject.set(x, "getIsolatedConnection", js.Any.fromFunction2(value))
    
    inline def setHasConnections(value: () => Boolean): Self = StObject.set(x, "hasConnections", js.Any.fromFunction0(value))
    
    inline def setRemoveDatabaseAccessListener(value: XDatabaseAccessListener => Unit): Self = StObject.set(x, "removeDatabaseAccessListener", js.Any.fromFunction1(value))
    
    inline def setSuspendConnections(value: () => Boolean): Self = StObject.set(x, "suspendConnections", js.Any.fromFunction0(value))
  }
}
