package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFunctionResponse extends StObject {
  
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}
object CreateFunctionResponse {
  
  @scala.inline
  def apply(): CreateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFunctionResponse]
  }
  
  @scala.inline
  implicit class CreateFunctionResponseMutableBuilder[Self <: CreateFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "functionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionConfigurationUndefined: Self = StObject.set(x, "functionConfiguration", js.undefined)
  }
}
