package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointResponse extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the new model.
    */
  var DesiredModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
}
object UpdateEndpointResponse {
  
  inline def apply(): UpdateEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setDesiredModelArn(value: ComprehendModelArn): Self = StObject.set(x, "DesiredModelArn", value.asInstanceOf[js.Any])
    
    inline def setDesiredModelArnUndefined: Self = StObject.set(x, "DesiredModelArn", js.undefined)
  }
}
