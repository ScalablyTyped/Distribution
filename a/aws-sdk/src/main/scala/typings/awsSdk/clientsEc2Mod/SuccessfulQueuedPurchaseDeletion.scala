package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulQueuedPurchaseDeletion extends StObject {
  
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.undefined
}
object SuccessfulQueuedPurchaseDeletion {
  
  inline def apply(): SuccessfulQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulQueuedPurchaseDeletion]
  }
  
  extension [Self <: SuccessfulQueuedPurchaseDeletion](x: Self) {
    
    inline def setReservedInstancesId(value: String): Self = StObject.set(x, "ReservedInstancesId", value.asInstanceOf[js.Any])
    
    inline def setReservedInstancesIdUndefined: Self = StObject.set(x, "ReservedInstancesId", js.undefined)
  }
}
