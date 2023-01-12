package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerValidationOutput extends StObject {
  
  var server: js.UndefOr[Server] = js.undefined
}
object ServerValidationOutput {
  
  inline def apply(): ServerValidationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerValidationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerValidationOutput] (val x: Self) extends AnyVal {
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
