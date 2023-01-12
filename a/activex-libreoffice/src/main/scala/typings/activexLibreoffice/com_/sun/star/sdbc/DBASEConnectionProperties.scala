package typings.activexLibreoffice.com_.sun.star.sdbc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the properties for a dBase connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.FILEConnectionProperties
  */
trait DBASEConnectionProperties
  extends StObject
     with FILEConnectionProperties {
  
  /** `TRUE` when deleted rows should be shown, otherwise `FALSE` */
  var ShowDeleted: Boolean
}
object DBASEConnectionProperties {
  
  inline def apply(CharSet: String, ShowDeleted: Boolean, password: String, user: String): DBASEConnectionProperties = {
    val __obj = js.Dynamic.literal(CharSet = CharSet.asInstanceOf[js.Any], ShowDeleted = ShowDeleted.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBASEConnectionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBASEConnectionProperties] (val x: Self) extends AnyVal {
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "ShowDeleted", value.asInstanceOf[js.Any])
  }
}
