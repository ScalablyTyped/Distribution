package typings.awsSdk.anon

import typings.awsSdk.clientsIamMod.arnType
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/iam.GetPolicyRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetPolicyRequestwaiterWai extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the managed policy that you want information about. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var PolicyArn: arnType
}
object GetPolicyRequestwaiterWai {
  
  inline def apply(PolicyArn: arnType): GetPolicyRequestwaiterWai = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequestwaiterWai]
  }
  
  extension [Self <: GetPolicyRequestwaiterWai](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
  }
}
