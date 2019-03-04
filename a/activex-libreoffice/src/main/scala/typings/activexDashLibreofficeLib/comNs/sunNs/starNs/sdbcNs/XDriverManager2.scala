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
    acquire: js.Function0[scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getConnection: js.Function1[java.lang.String, XConnection],
    getConnectionWithInfo: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XConnection
    ],
    getDriverByURL: js.Function1[java.lang.String, XDriver],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLoginTimeout: js.Function0[scala.Double],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setLoginTimeout: js.Function1[scala.Double, scala.Unit]
  ): XDriverManager2 = {
    val __obj = js.Dynamic.literal(ElementType = ElementType, LoginTimeout = LoginTimeout, acquire = acquire, createEnumeration = createEnumeration, getConnection = getConnection, getConnectionWithInfo = getConnectionWithInfo, getDriverByURL = getDriverByURL, getElementType = getElementType, getLoginTimeout = getLoginTimeout, hasElements = hasElements, queryInterface = queryInterface, release = release, setLoginTimeout = setLoginTimeout)
  
    __obj.asInstanceOf[XDriverManager2]
  }
}

