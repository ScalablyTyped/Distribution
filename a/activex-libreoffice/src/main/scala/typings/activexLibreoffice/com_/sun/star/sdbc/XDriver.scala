package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the interface that every driver class must implement.
  *
  * Each driver should supply a service that implements the {@link Driver} interface.
  *
  * The {@link DriverManager} will try to load as many drivers as it can find, and then for any given connection request, it will ask each driver in turn
  * to try to connect to the target URL.
  *
  * It is strongly recommended that each {@link Driver} object should be small and standalone so that the {@link Driver} object can be loaded and queried
  * without bringing in vast quantities of supporting code.
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.XConnection
  */
@js.native
trait XDriver extends XInterface {
  /**
    * gets the driver's major version number. Initially this should be 1.
    * @returns this driver's major version number
    */
  val MajorVersion: Double = js.native
  /**
    * gets the driver's minor version number. Initially this should be 0.
    * @returns this driver's minor version number.
    */
  val MinorVersion: Double = js.native
  /**
    * returns `TRUE` if the driver thinks that it can open a connection to the given URL. Typically drivers will return `TRUE` if they understand the
    * subprotocol specified in the URL and `FALSE` if they do not.
    * @param url is the URL of the database to which to connect.
    * @returns `TRUE` if this driver can connect to the given URL.
    * @throws SQLException if a database access error occurs.
    */
  def acceptsURL(url: String): Boolean = js.native
  /**
    * attempts to make a database connection to the given URL. The driver should return `NULL` if it realizes it is the wrong kind of driver to connect to
    * the given URL. This will be common, as when the driver manager is asked to connect to a given URL it passes the URL to each loaded driver in turn.
    *
    * The driver should raise a {@link com.sun.star.sdbc.SQLException} if it is the right driver to connect to the given URL, but has trouble connecting to
    * the database.
    *
    * The info argument can be used to pass arbitrary string tag/value pairs as connection arguments. Normally at least "user" and "password" properties
    * should be included in the Properties. For a JDBC driver also the Java class must be supplied in the property named JavaDriverClass, and a class path
    * (a space-separated list of URLs) needed to locate that class can optionally be supplied in a property named JavaDriverClassPath. Possible property
    * value names are when supported by the driver:
    * @param url is the URL of the database to which to connect.
    * @param info a list of arbitrary string tag/value pairs as connection arguments. Normally at least a "user" and "password" property should be included.
    * @returns a {@link Connection} object that represents a connection to the URL
    * @see com.sun.star.sdbc.ConnectionProperties
    * @see com.sun.star.sdbc.ConnectionProperties
    * @throws SQLException if a database access error occurs
    */
  def connect(url: String, info: SeqEquiv[PropertyValue]): XConnection = js.native
  /**
    * gets the driver's major version number. Initially this should be 1.
    * @returns this driver's major version number
    */
  def getMajorVersion(): Double = js.native
  /**
    * gets the driver's minor version number. Initially this should be 0.
    * @returns this driver's minor version number.
    */
  def getMinorVersion(): Double = js.native
  /**
    * gets information about the possible properties for this driver.
    *
    * The getPropertyInfo method is intended to allow a generic GUI tool to discover what properties it should prompt a human for in order to get enough
    * information to connect to a database. Note that depending on the values the human has supplied so far, additional values may become necessary, so it
    * may be necessary to iterate though several calls to getPropertyInfo.
    * @param url is the URL of the database to which to connect.
    * @param info is a proposed list of tag/value pairs that will be sent on connect open.
    * @returns an array of {@link DriverPropertyInfo} objects describing possible properties. This array may be an empty array if no properties are required.
    * @throws SQLException if a database access error occurs.
    */
  def getPropertyInfo(url: String, info: SeqEquiv[PropertyValue]): SafeArray[DriverPropertyInfo] = js.native
}

object XDriver {
  @scala.inline
  def apply(
    MajorVersion: Double,
    MinorVersion: Double,
    acceptsURL: String => Boolean,
    acquire: () => Unit,
    connect: (String, SeqEquiv[PropertyValue]) => XConnection,
    getMajorVersion: () => Double,
    getMinorVersion: () => Double,
    getPropertyInfo: (String, SeqEquiv[PropertyValue]) => SafeArray[DriverPropertyInfo],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDriver = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], acceptsURL = js.Any.fromFunction1(acceptsURL), acquire = js.Any.fromFunction0(acquire), connect = js.Any.fromFunction2(connect), getMajorVersion = js.Any.fromFunction0(getMajorVersion), getMinorVersion = js.Any.fromFunction0(getMinorVersion), getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDriver]
  }
  @scala.inline
  implicit class XDriverOps[Self <: XDriver] (val x: Self) extends AnyVal {
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
    def setMajorVersion(value: Double): Self = this.set("MajorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinorVersion(value: Double): Self = this.set("MinorVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcceptsURL(value: String => Boolean): Self = this.set("acceptsURL", js.Any.fromFunction1(value))
    @scala.inline
    def setConnect(value: (String, SeqEquiv[PropertyValue]) => XConnection): Self = this.set("connect", js.Any.fromFunction2(value))
    @scala.inline
    def setGetMajorVersion(value: () => Double): Self = this.set("getMajorVersion", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinorVersion(value: () => Double): Self = this.set("getMinorVersion", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPropertyInfo(value: (String, SeqEquiv[PropertyValue]) => SafeArray[DriverPropertyInfo]): Self = this.set("getPropertyInfo", js.Any.fromFunction2(value))
  }
  
}

