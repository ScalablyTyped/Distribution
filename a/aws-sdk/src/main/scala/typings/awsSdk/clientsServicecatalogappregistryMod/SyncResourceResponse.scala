package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResourceResponse extends StObject {
  
  /**
    * The results of the output if an application is associated with an ARN value, which could be syncStarted or None.
    */
  var actionTaken: js.UndefOr[SyncAction] = js.undefined
  
  /**
    * The Amazon resource name (ARN) that specifies the application.
    */
  var applicationArn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The Amazon resource name (ARN) that specifies the resource.
    */
  var resourceArn: js.UndefOr[Arn] = js.undefined
}
object SyncResourceResponse {
  
  inline def apply(): SyncResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResourceResponse]
  }
  
  extension [Self <: SyncResourceResponse](x: Self) {
    
    inline def setActionTaken(value: SyncAction): Self = StObject.set(x, "actionTaken", value.asInstanceOf[js.Any])
    
    inline def setActionTakenUndefined: Self = StObject.set(x, "actionTaken", js.undefined)
    
    inline def setApplicationArn(value: ApplicationArn): Self = StObject.set(x, "applicationArn", value.asInstanceOf[js.Any])
    
    inline def setApplicationArnUndefined: Self = StObject.set(x, "applicationArn", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
  }
}
