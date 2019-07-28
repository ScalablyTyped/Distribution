package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XConnectionPool
  extends XDriverManager
     with XDriverAccess

object XConnectionPool {
  @scala.inline
  def apply(
    LoginTimeout: Double,
    acquire: () => Unit,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDriverByURL: String => XDriver,
    getLoginTimeout: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XConnectionPool = {
    val __obj = js.Dynamic.literal(LoginTimeout = LoginTimeout, acquire = js.Any.fromFunction0(acquire), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDriverByURL = js.Any.fromFunction1(getDriverByURL), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
  
    __obj.asInstanceOf[XConnectionPool]
  }
}

