package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFunctionResponse extends StObject {
  
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}
object GetFunctionResponse {
  
  @scala.inline
  def apply(): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFunctionResponse]
  }
  
  @scala.inline
  implicit class GetFunctionResponseMutableBuilder[Self <: GetFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "functionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionConfigurationUndefined: Self = StObject.set(x, "functionConfiguration", js.undefined)
  }
}
