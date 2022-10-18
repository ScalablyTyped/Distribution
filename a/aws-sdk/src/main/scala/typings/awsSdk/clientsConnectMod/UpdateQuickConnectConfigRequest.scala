package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQuickConnectConfigRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * Information about the configuration settings for the quick connect.
    */
  var QuickConnectConfig: typings.awsSdk.clientsConnectMod.QuickConnectConfig
  
  /**
    * The identifier for the quick connect.
    */
  var QuickConnectId: typings.awsSdk.clientsConnectMod.QuickConnectId
}
object UpdateQuickConnectConfigRequest {
  
  inline def apply(InstanceId: InstanceId, QuickConnectConfig: QuickConnectConfig, QuickConnectId: QuickConnectId): UpdateQuickConnectConfigRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QuickConnectConfig = QuickConnectConfig.asInstanceOf[js.Any], QuickConnectId = QuickConnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQuickConnectConfigRequest]
  }
  
  extension [Self <: UpdateQuickConnectConfigRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectConfig(value: QuickConnectConfig): Self = StObject.set(x, "QuickConnectConfig", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
  }
}
