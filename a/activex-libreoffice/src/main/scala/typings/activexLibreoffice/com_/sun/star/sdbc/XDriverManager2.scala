package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XDriverManager2
  extends XEnumerationAccess
     with XDriverManager
     with XDriverAccess
object XDriverManager2 {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    LoginTimeout: Double,
    acquire: () => Unit,
    createEnumeration: () => XEnumeration,
    getConnection: String => XConnection,
    getConnectionWithInfo: (String, SeqEquiv[PropertyValue]) => XConnection,
    getDriverByURL: String => XDriver,
    getElementType: () => `type`,
    getLoginTimeout: () => Double,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLoginTimeout: Double => Unit
  ): XDriverManager2 = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], LoginTimeout = LoginTimeout.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createEnumeration = js.Any.fromFunction0(createEnumeration), getConnection = js.Any.fromFunction1(getConnection), getConnectionWithInfo = js.Any.fromFunction2(getConnectionWithInfo), getDriverByURL = js.Any.fromFunction1(getDriverByURL), getElementType = js.Any.fromFunction0(getElementType), getLoginTimeout = js.Any.fromFunction0(getLoginTimeout), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLoginTimeout = js.Any.fromFunction1(setLoginTimeout))
    __obj.asInstanceOf[XDriverManager2]
  }
}
