package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentResult extends StObject {
  
  /**
    * Details about the deployment result.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsGamesparksMod.Message] = js.undefined
  
  /**
    * The type of deployment result.
    */
  var ResultCode: js.UndefOr[typings.awsSdk.clientsGamesparksMod.ResultCode] = js.undefined
}
object DeploymentResult {
  
  inline def apply(): DeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentResult]
  }
  
  extension [Self <: DeploymentResult](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setResultCode(value: ResultCode): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
    
    inline def setResultCodeUndefined: Self = StObject.set(x, "ResultCode", js.undefined)
  }
}
