package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the basic interface for managing a set of SDBC drivers.
  *
  * As part of its initialization, the {@link DriverManager} service will attempt to load the registered drivers.
  *
  * When the method `getConnection` is called, the {@link DriverManager} will attempt to locate a suitable driver.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XConnection
  * @since LibreOffice 4.0
  */
trait XDriverManager2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with XDriverManager
     with XDriverAccess

object XDriverManager2 {
  @scala.inline
  def apply(
    ElementType: activexDashLibreofficeLib.`type`,
    LoginTimeout: scala.Double,
    acquire: () => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getConnection: java.lang.String => XConnection,
    getConnectionWithInfo: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]) => XConnection,
    getDriverByURL: java.lang.String => XDriver,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLoginTimeout: () => scala.Double,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setLoginTimeout: scala.Double => scala.Unit
  ): XDriverManager2 = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, LoginTimeout = LoginTimeout, acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDriverByURL = js.Any.fromFunction1(getDriverByURL), getElementType = js.Any.fromFunction0(getElementType), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
  
    __obj.asInstanceOf[XDriverManager2]
  }
}

