package typings.awsSdk.anon

import typings.awsSdk.cloudcontrolMod.RequestToken
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/cloudcontrol.GetResourceRequestStatusInput & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetResourceRequestStatusI extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * A unique token used to track the progress of the resource operation request. Request tokens are included in the ProgressEvent type returned by a resource operation request.
    */
  var RequestToken: typings.awsSdk.cloudcontrolMod.RequestToken
}
object GetResourceRequestStatusI {
  
  inline def apply(RequestToken: RequestToken): GetResourceRequestStatusI = {
    val __obj = js.Dynamic.literal(RequestToken = RequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceRequestStatusI]
  }
  
  extension [Self <: GetResourceRequestStatusI](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setRequestToken(value: RequestToken): Self = StObject.set(x, "RequestToken", value.asInstanceOf[js.Any])
  }
}
