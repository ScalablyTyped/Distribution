package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDeploymentResponse extends StObject {
  
  /**
    * A message that communicates if the cancel was successful.
    */
  var message: js.UndefOr[NonEmptyString] = js.undefined
}
object CancelDeploymentResponse {
  
  inline def apply(): CancelDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelDeploymentResponse]
  }
  
  extension [Self <: CancelDeploymentResponse](x: Self) {
    
    inline def setMessage(value: NonEmptyString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
