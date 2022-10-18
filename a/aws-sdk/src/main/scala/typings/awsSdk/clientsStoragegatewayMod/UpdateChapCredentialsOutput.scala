package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChapCredentialsOutput extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target. This is the same initiator name specified in the request.
    */
  var InitiatorName: js.UndefOr[IqnName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the target. This is the same target specified in the request.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
}
object UpdateChapCredentialsOutput {
  
  inline def apply(): UpdateChapCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChapCredentialsOutput]
  }
  
  extension [Self <: UpdateChapCredentialsOutput](x: Self) {
    
    inline def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNameUndefined: Self = StObject.set(x, "InitiatorName", js.undefined)
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    inline def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
