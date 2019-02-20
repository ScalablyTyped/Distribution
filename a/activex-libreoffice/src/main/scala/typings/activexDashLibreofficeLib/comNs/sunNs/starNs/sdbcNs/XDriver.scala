package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

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
trait XDriver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets the driver's major version number. Initially this should be 1.
    * @returns this driver's major version number
    */
  val MajorVersion: scala.Double
  /**
    * gets the driver's minor version number. Initially this should be 0.
    * @returns this driver's minor version number.
    */
  val MinorVersion: scala.Double
  /**
    * returns `TRUE` if the driver thinks that it can open a connection to the given URL. Typically drivers will return `TRUE` if they understand the
    * subprotocol specified in the URL and `FALSE` if they do not.
    * @param url is the URL of the database to which to connect.
    * @returns `TRUE` if this driver can connect to the given URL.
    * @throws SQLException if a database access error occurs.
    */
  def acceptsURL(url: java.lang.String): scala.Boolean
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
  def connect(
    url: java.lang.String,
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XConnection
  /**
    * gets the driver's major version number. Initially this should be 1.
    * @returns this driver's major version number
    */
  def getMajorVersion(): scala.Double
  /**
    * gets the driver's minor version number. Initially this should be 0.
    * @returns this driver's minor version number.
    */
  def getMinorVersion(): scala.Double
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
  def getPropertyInfo(
    url: java.lang.String,
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): activexDashInteropLib.SafeArray[DriverPropertyInfo]
}

