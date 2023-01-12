package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Is used for interaction handle in case password protected modules exceed the size that can be stored in OpenOffice 2.x, 1.x formats */
trait ModuleSizeExceededRequest
  extends StObject
     with Exception {
  
  /** The name of the modules that exceed size that can be stored */
  var Names: SafeArray[String]
}
object ModuleSizeExceededRequest {
  
  inline def apply(Context: XInterface, Message: String, Names: SafeArray[String]): ModuleSizeExceededRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSizeExceededRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleSizeExceededRequest] (val x: Self) extends AnyVal {
    
    inline def setNames(value: SafeArray[String]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
  }
}
