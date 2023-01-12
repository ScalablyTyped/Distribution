package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserDefinedFunctionResponse extends StObject {
  
  /**
    * The requested function definition.
    */
  var UserDefinedFunction: js.UndefOr[typings.awsSdk.clientsGlueMod.UserDefinedFunction] = js.undefined
}
object GetUserDefinedFunctionResponse {
  
  inline def apply(): GetUserDefinedFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDefinedFunctionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserDefinedFunctionResponse] (val x: Self) extends AnyVal {
    
    inline def setUserDefinedFunction(value: UserDefinedFunction): Self = StObject.set(x, "UserDefinedFunction", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFunctionUndefined: Self = StObject.set(x, "UserDefinedFunction", js.undefined)
  }
}
