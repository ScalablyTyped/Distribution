package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountCustomizationResponse extends StObject {
  
  /**
    * The Amazon QuickSight customizations you're updating in the current Amazon Web Services Region. 
    */
  var AccountCustomization: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AccountCustomization] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the updated customization for this Amazon Web Services account.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The ID for the Amazon Web Services account that you want to update Amazon QuickSight customizations for.
    */
  var AwsAccountId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AwsAccountId] = js.undefined
  
  /**
    * The namespace associated with the customization that you're updating.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object UpdateAccountCustomizationResponse {
  
  inline def apply(): UpdateAccountCustomizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountCustomizationResponse]
  }
  
  extension [Self <: UpdateAccountCustomizationResponse](x: Self) {
    
    inline def setAccountCustomization(value: AccountCustomization): Self = StObject.set(x, "AccountCustomization", value.asInstanceOf[js.Any])
    
    inline def setAccountCustomizationUndefined: Self = StObject.set(x, "AccountCustomization", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
