package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppFlowConfig extends StObject {
  
  /**
    *  name of the flow.
    */
  var FlowName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.FlowName] = js.undefined
  
  /**
    * An IAM role that gives Amazon Lookout for Metrics permission to access the flow.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
}
object AppFlowConfig {
  
  inline def apply(): AppFlowConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppFlowConfig]
  }
  
  extension [Self <: AppFlowConfig](x: Self) {
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "FlowName", value.asInstanceOf[js.Any])
    
    inline def setFlowNameUndefined: Self = StObject.set(x, "FlowName", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
