package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionName extends StObject {
  
  var FunctionName: String = js.native
  
  var UserParameters: String = js.native
}
object FunctionName {
  
  @scala.inline
  def apply(FunctionName: String, UserParameters: String): FunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionName]
  }
  
  @scala.inline
  implicit class FunctionNameMutableBuilder[Self <: FunctionName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserParameters(value: String): Self = StObject.set(x, "UserParameters", value.asInstanceOf[js.Any])
  }
}
