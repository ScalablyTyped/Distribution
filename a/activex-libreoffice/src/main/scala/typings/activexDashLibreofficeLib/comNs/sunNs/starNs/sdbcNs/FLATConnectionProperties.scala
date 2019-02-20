package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the properties for a FLAT connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.FILEConnectionProperties
  */
trait FLATConnectionProperties extends FILEConnectionProperties {
  /** A one character delimiter to separate the decimal. */
  var DecimalDelimiter: java.lang.String
  /** the extension of the files to be used. */
  var Extension: java.lang.String
  /** A one character delimiter to separate the fields. */
  var FieldDelimiter: java.lang.String
  /** `TRUE` when the file contains a header line otherwise `FALSE` */
  var HeaderLine: scala.Boolean
  /** A one character delimiter to separate the strings. */
  var StringDelimiter: java.lang.String
  /** A one character delimiter to separate the thousands. */
  var ThousandDelimiter: java.lang.String
}

