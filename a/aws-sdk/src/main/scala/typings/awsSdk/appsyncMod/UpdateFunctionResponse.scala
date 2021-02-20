package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFunctionResponse extends StObject {
  
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}
object UpdateFunctionResponse {
  
  @scala.inline
  def apply(): UpdateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFunctionResponse]
  }
  
  @scala.inline
  implicit class UpdateFunctionResponseMutableBuilder[Self <: UpdateFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctionConfiguration(value: FunctionConfiguration): Self = StObject.set(x, "functionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionConfigurationUndefined: Self = StObject.set(x, "functionConfiguration", js.undefined)
  }
}
