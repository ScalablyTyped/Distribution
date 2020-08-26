package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.sdbc.XDriverManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore.
  * @deprecated Deprecated
  */
@js.native
trait XDatabaseEnvironment extends XDriverManager {
  def createDatabaseAccess(URL: String, title: String): XDatabaseAccess = js.native
  def getDatabaseAccess(URL: String): XDatabaseAccess = js.native
}

object XDatabaseEnvironment {
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    createDatabaseAccess: (String, String) => XDatabaseAccess,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDatabaseAccess: String => XDatabaseAccess,
    getLoginTimeout: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDatabaseEnvironment = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createDatabaseAccess = js.Any.fromFunction2(createDatabaseAccess), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDatabaseAccess = js.Any.fromFunction1(getDatabaseAccess), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
    __obj.asInstanceOf[XDatabaseEnvironment]
  }
  @scala.inline
  implicit class XDatabaseEnvironmentOps[Self <: XDatabaseEnvironment] (val x: Self) extends AnyVal {
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
    def setCreateDatabaseAccess(value: (String, String) => XDatabaseAccess): Self = this.set("createDatabaseAccess", js.Any.fromFunction2(value))
    @scala.inline
    def setGetDatabaseAccess(value: String => XDatabaseAccess): Self = this.set("getDatabaseAccess", js.Any.fromFunction1(value))
  }
  
}

