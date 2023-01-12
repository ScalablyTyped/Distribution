package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionName extends StObject {
  
  var FunctionName: String
  
  var UserParameters: String
}
object FunctionName {
  
  inline def apply(FunctionName: String, UserParameters: String): FunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionName] (val x: Self) extends AnyVal {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setUserParameters(value: String): Self = StObject.set(x, "UserParameters", value.asInstanceOf[js.Any])
  }
}
