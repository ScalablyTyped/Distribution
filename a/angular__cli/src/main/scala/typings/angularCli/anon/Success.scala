package typings.angularCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success extends StObject {
  
  var success: Boolean
  
  var tempNodeModules: String
}
object Success {
  
  inline def apply(success: Boolean, tempNodeModules: String): Success = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], tempNodeModules = tempNodeModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTempNodeModules(value: String): Self = StObject.set(x, "tempNodeModules", value.asInstanceOf[js.Any])
  }
}
