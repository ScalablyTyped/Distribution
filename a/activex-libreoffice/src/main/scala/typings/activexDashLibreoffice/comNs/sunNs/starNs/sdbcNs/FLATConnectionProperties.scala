package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

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
  var DecimalDelimiter: String
  /** the extension of the files to be used. */
  var Extension: String
  /** A one character delimiter to separate the fields. */
  var FieldDelimiter: String
  /** `TRUE` when the file contains a header line otherwise `FALSE` */
  var HeaderLine: Boolean
  /** A one character delimiter to separate the strings. */
  var StringDelimiter: String
  /** A one character delimiter to separate the thousands. */
  var ThousandDelimiter: String
}

object FLATConnectionProperties {
  @scala.inline
  def apply(
    CharSet: String,
    DecimalDelimiter: String,
    Extension: String,
    FieldDelimiter: String,
    HeaderLine: Boolean,
    StringDelimiter: String,
    ThousandDelimiter: String,
    password: String,
    user: String
  ): FLATConnectionProperties = {
    val __obj = js.Dynamic.literal(CharSet = CharSet, DecimalDelimiter = DecimalDelimiter, Extension = Extension, FieldDelimiter = FieldDelimiter, HeaderLine = HeaderLine, StringDelimiter = StringDelimiter, ThousandDelimiter = ThousandDelimiter, password = password, user = user)
  
    __obj.asInstanceOf[FLATConnectionProperties]
  }
}

