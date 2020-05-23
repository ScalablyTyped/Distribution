package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccess extends XDataSource {
  def addDatabaseAccessListener(listener: XDatabaseAccessListener): Unit
  def getIsolatedConnection(user: String, password: String): XConnection
  def hasConnections(): Boolean
  def removeDatabaseAccessListener(listener: XDatabaseAccessListener): Unit
  def suspendConnections(): Boolean
}

object XDatabaseAccess {
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    addDatabaseAccessListener: XDatabaseAccessListener => Unit,
    getConnection: (String, String) => XConnection,
    getIsolatedConnection: (String, String) => XConnection,
    getLoginTimeout: () => Double,
    hasConnections: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDatabaseAccessListener: XDatabaseAccessListener => Unit,
    setLoginTimeout: Double => Unit,
    suspendConnections: () => Boolean
  ): XDatabaseAccess = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDatabaseAccessListener = js.Any.fromFunction1(addDatabaseAccessListener), getConnection = js.Any.fromFunction2(getConnection), getIsolatedConnection = js.Any.fromFunction2(getIsolatedConnection), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), hasConnections = js.Any.fromFunction0(hasConnections), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDatabaseAccessListener = js.Any.fromFunction1(removeDatabaseAccessListener), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout), suspendConnections = js.Any.fromFunction0(suspendConnections))
    __obj.asInstanceOf[XDatabaseAccess]
  }
}

