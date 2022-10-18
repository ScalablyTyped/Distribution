package typings.awsSdk.anon

import typings.awsSdk.clientsTransferMod.ServerId
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/transfer.DescribeServerRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeServerRequestwait extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * A system-assigned unique identifier for a server.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object DescribeServerRequestwait {
  
  inline def apply(ServerId: ServerId): DescribeServerRequestwait = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServerRequestwait]
  }
  
  extension [Self <: DescribeServerRequestwait](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
