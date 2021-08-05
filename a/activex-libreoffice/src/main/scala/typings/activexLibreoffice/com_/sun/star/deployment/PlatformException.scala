package typings.activexLibreoffice.com_.sun.star.deployment

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link DeploymentException} indicates that the current platform is not supported.
  * @since OOo 3.0
  */
trait PlatformException
  extends StObject
     with Exception {
  
  /** The package which does not support the current platform. */
  @JSName("package")
  var _package: XPackage
}
object PlatformException {
  
  inline def apply(Context: XInterface, Message: String, _package: XPackage): PlatformException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformException]
  }
  
  extension [Self <: PlatformException](x: Self) {
    
    inline def set_package(value: XPackage): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
