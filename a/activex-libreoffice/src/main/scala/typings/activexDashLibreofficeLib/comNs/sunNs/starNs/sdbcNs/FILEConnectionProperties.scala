package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the properties for a FILE connection (session) with a specific database. These properties can be used when calling the method {@link
  * com.sun.star.sdbc.XDriver.connect()} or {@link com.sun.star.sdbc.XDriverManager.getConnectionWithInfo()} .
  *
  * The properties for a connection contain additional information about how to connect to a database and how to control the behavior of the resulting
  * connection should be.
  * @see com.sun.star.sdbc.XDriver
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.ConnectionProperties
  */
trait FILEConnectionProperties extends ConnectionProperties {
  /**
    * specifies the encoding to use to translate the backend data
    *
    * See the [IANA character set list]{@link url="http://www.iana.org/assignments/character-sets"} for a list of valid values.
    */
  var CharSet: java.lang.String
}

object FILEConnectionProperties {
  @scala.inline
  def apply(CharSet: java.lang.String, password: java.lang.String, user: java.lang.String): FILEConnectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CharSet")(CharSet)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[FILEConnectionProperties]
  }
}

