package typings.activexLibreoffice.com_.sun.star.sdbc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait FLATConnectionProperties extends FILEConnectionProperties {
  
  /** A one character delimiter to separate the decimal. */
  var DecimalDelimiter: String = js.native
  
  /** the extension of the files to be used. */
  var Extension: String = js.native
  
  /** A one character delimiter to separate the fields. */
  var FieldDelimiter: String = js.native
  
  /** `TRUE` when the file contains a header line otherwise `FALSE` */
  var HeaderLine: Boolean = js.native
  
  /** A one character delimiter to separate the strings. */
  var StringDelimiter: String = js.native
  
  /** A one character delimiter to separate the thousands. */
  var ThousandDelimiter: String = js.native
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
    val __obj = js.Dynamic.literal(CharSet = CharSet.asInstanceOf[js.Any], DecimalDelimiter = DecimalDelimiter.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FieldDelimiter = FieldDelimiter.asInstanceOf[js.Any], HeaderLine = HeaderLine.asInstanceOf[js.Any], StringDelimiter = StringDelimiter.asInstanceOf[js.Any], ThousandDelimiter = ThousandDelimiter.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FLATConnectionProperties]
  }
  
  @scala.inline
  implicit class FLATConnectionPropertiesOps[Self <: FLATConnectionProperties] (val x: Self) extends AnyVal {
    
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
    def setDecimalDelimiter(value: String): Self = this.set("DecimalDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = this.set("Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("FieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLine(value: Boolean): Self = this.set("HeaderLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringDelimiter(value: String): Self = this.set("StringDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandDelimiter(value: String): Self = this.set("ThousandDelimiter", value.asInstanceOf[js.Any])
  }
}
