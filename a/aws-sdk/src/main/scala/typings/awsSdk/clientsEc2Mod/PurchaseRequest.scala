package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseRequest extends StObject {
  
  /**
    * The number of instances.
    */
  var InstanceCount: Integer
  
  /**
    * The purchase token.
    */
  var PurchaseToken: String
}
object PurchaseRequest {
  
  inline def apply(InstanceCount: Integer, PurchaseToken: String): PurchaseRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], PurchaseToken = PurchaseToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseRequest]
  }
  
  extension [Self <: PurchaseRequest](x: Self) {
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "PurchaseToken", value.asInstanceOf[js.Any])
  }
}
