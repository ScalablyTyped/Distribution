package typings.awsSdk.anon

import typings.awsSdk.clientsNimbleMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/nimble.GetStudioComponentRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetStudioComponentRequest extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The studio component ID.
    */
  var studioComponentId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStudioComponentRequest {
  
  inline def apply(studioComponentId: String, studioId: String): GetStudioComponentRequest = {
    val __obj = js.Dynamic.literal(studioComponentId = studioComponentId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStudioComponentRequest]
  }
  
  extension [Self <: GetStudioComponentRequest](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setStudioComponentId(value: String): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
