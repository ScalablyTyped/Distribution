package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that you want to delete the Amazon QuickSight namespace from.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The namespace that you want to delete.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
}
object DeleteNamespaceRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): DeleteNamespaceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceRequest]
  }
  
  extension [Self <: DeleteNamespaceRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
