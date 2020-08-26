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
@js.native
trait XDatabaseAccess extends XDataSource {
  def addDatabaseAccessListener(listener: XDatabaseAccessListener): Unit = js.native
  def getIsolatedConnection(user: String, password: String): XConnection = js.native
  def hasConnections(): Boolean = js.native
  def removeDatabaseAccessListener(listener: XDatabaseAccessListener): Unit = js.native
  def suspendConnections(): Boolean = js.native
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
  @scala.inline
  implicit class XDatabaseAccessOps[Self <: XDatabaseAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddDatabaseAccessListener(value: XDatabaseAccessListener => Unit): Self = this.set("addDatabaseAccessListener", js.Any.fromFunction1(value))
    @scala.inline
    def setGetIsolatedConnection(value: (String, String) => XConnection): Self = this.set("getIsolatedConnection", js.Any.fromFunction2(value))
    @scala.inline
    def setHasConnections(value: () => Boolean): Self = this.set("hasConnections", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveDatabaseAccessListener(value: XDatabaseAccessListener => Unit): Self = this.set("removeDatabaseAccessListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSuspendConnections(value: () => Boolean): Self = this.set("suspendConnections", js.Any.fromFunction0(value))
  }
  
}

