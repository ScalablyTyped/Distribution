package typings.activexLibreoffice.com_.sun.star.configuration

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is thrown when creating a configuration provider fails because a bootstrap file needed to locate the configuration is missing */
trait MissingBootstrapFileException
  extends StObject
     with Exception {
  
  var BootstrapFileURL: String
}
object MissingBootstrapFileException {
  
  inline def apply(BootstrapFileURL: String, Context: XInterface, Message: String): MissingBootstrapFileException = {
    val __obj = js.Dynamic.literal(BootstrapFileURL = BootstrapFileURL.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingBootstrapFileException]
  }
  
  extension [Self <: MissingBootstrapFileException](x: Self) {
    
    inline def setBootstrapFileURL(value: String): Self = StObject.set(x, "BootstrapFileURL", value.asInstanceOf[js.Any])
  }
}
