package typings.activexLibreoffice.com_.sun.star.sdbc

import org.scalablytyped.runtime.StObject
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
  implicit class FLATConnectionPropertiesMutableBuilder[Self <: FLATConnectionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecimalDelimiter(value: String): Self = StObject.set(x, "DecimalDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderLine(value: Boolean): Self = StObject.set(x, "HeaderLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringDelimiter(value: String): Self = StObject.set(x, "StringDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandDelimiter(value: String): Self = StObject.set(x, "ThousandDelimiter", value.asInstanceOf[js.Any])
  }
}
