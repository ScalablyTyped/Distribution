package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountCustomizationRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that you want to delete Amazon QuickSight customizations from in this Amazon Web Services Region.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The Amazon QuickSight namespace that you're deleting the customizations from.
    */
  var Namespace: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Namespace] = js.undefined
}
object DeleteAccountCustomizationRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DeleteAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountCustomizationRequest]
  }
  
  extension [Self <: DeleteAccountCustomizationRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
  }
}
