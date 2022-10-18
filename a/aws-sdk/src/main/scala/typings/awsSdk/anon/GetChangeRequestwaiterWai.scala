package typings.awsSdk.anon

import typings.awsSdk.clientsRoute53Mod.ChangeId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/route53.GetChangeRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetChangeRequestwaiterWai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The ID of the change batch request. The value that you specify here is the value that ChangeResourceRecordSets returned in the Id element when you submitted the request.
    */
  var Id: ChangeId
}
object GetChangeRequestwaiterWai {
  
  inline def apply(Id: ChangeId): GetChangeRequestwaiterWai = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeRequestwaiterWai]
  }
  
  extension [Self <: GetChangeRequestwaiterWai](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setId(value: ChangeId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
