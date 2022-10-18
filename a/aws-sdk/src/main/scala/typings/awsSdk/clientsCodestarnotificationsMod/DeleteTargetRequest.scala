package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTargetRequest extends StObject {
  
  /**
    * A Boolean value that can be used to delete all associations with this Chatbot topic. The default value is FALSE. If set to TRUE, all associations between that target and every notification rule in your Amazon Web Services account are deleted.
    */
  var ForceUnsubscribeAll: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.ForceUnsubscribeAll] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Chatbot topic or Chatbot client to delete.
    */
  var TargetAddress: typings.awsSdk.clientsCodestarnotificationsMod.TargetAddress
}
object DeleteTargetRequest {
  
  inline def apply(TargetAddress: TargetAddress): DeleteTargetRequest = {
    val __obj = js.Dynamic.literal(TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTargetRequest]
  }
  
  extension [Self <: DeleteTargetRequest](x: Self) {
    
    inline def setForceUnsubscribeAll(value: ForceUnsubscribeAll): Self = StObject.set(x, "ForceUnsubscribeAll", value.asInstanceOf[js.Any])
    
    inline def setForceUnsubscribeAllUndefined: Self = StObject.set(x, "ForceUnsubscribeAll", js.undefined)
    
    inline def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
  }
}
