package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access of sdbc driver components
  * @see com.sun.star.sdbc.XDriverManager
  * @see com.sun.star.sdbc.XDriver
  */
trait XDriverAccess
  extends StObject
     with XInterface {
  
  /**
    * get a driver which accepts a given url.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @returns a {@link Driver} that can connect to the URL
    * @see com.sun.star.sdbc.XDriver.acceptsURL
    * @throws SQLException if a database access error occurs.
    */
  def getDriverByURL(url: String): XDriver
}
object XDriverAccess {
  
  inline def apply(
    acquire: () => Unit,
    getDriverByURL: String => XDriver,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDriverAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDriverByURL = js.Any.fromFunction1(getDriverByURL), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDriverAccess]
  }
  
  extension [Self <: XDriverAccess](x: Self) {
    
    inline def setGetDriverByURL(value: String => XDriver): Self = StObject.set(x, "getDriverByURL", js.Any.fromFunction1(value))
  }
}
