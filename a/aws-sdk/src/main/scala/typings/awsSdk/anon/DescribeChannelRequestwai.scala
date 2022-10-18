package typings.awsSdk.anon

import typings.awsSdk.clientsMedialiveMod.string
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/medialive.DescribeChannelRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeChannelRequestwai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * channel ID
    */
  var ChannelId: string
}
object DescribeChannelRequestwai {
  
  inline def apply(ChannelId: string): DescribeChannelRequestwai = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequestwai]
  }
  
  extension [Self <: DescribeChannelRequestwai](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
  }
}
