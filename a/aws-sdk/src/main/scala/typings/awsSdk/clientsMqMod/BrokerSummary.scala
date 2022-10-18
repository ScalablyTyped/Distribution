package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerSummary extends StObject {
  
  /**
    * The broker's Amazon Resource Name (ARN).
    */
  var BrokerArn: js.UndefOr[string] = js.undefined
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's name. This value is unique in your AWS account, 1-50 characters long, and containing only letters, numbers, dashes, and underscores, and must not contain white spaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's status.
    */
  var BrokerState: js.UndefOr[typings.awsSdk.clientsMqMod.BrokerState] = js.undefined
  
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The broker's deployment mode.
    */
  var DeploymentMode: typings.awsSdk.clientsMqMod.DeploymentMode
  
  /**
    * The type of broker engine.
    */
  var EngineType: typings.awsSdk.clientsMqMod.EngineType
  
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.undefined
}
object BrokerSummary {
  
  inline def apply(DeploymentMode: DeploymentMode, EngineType: EngineType): BrokerSummary = {
    val __obj = js.Dynamic.literal(DeploymentMode = DeploymentMode.asInstanceOf[js.Any], EngineType = EngineType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerSummary]
  }
  
  extension [Self <: BrokerSummary](x: Self) {
    
    inline def setBrokerArn(value: string): Self = StObject.set(x, "BrokerArn", value.asInstanceOf[js.Any])
    
    inline def setBrokerArnUndefined: Self = StObject.set(x, "BrokerArn", js.undefined)
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setBrokerIdUndefined: Self = StObject.set(x, "BrokerId", js.undefined)
    
    inline def setBrokerName(value: string): Self = StObject.set(x, "BrokerName", value.asInstanceOf[js.Any])
    
    inline def setBrokerNameUndefined: Self = StObject.set(x, "BrokerName", js.undefined)
    
    inline def setBrokerState(value: BrokerState): Self = StObject.set(x, "BrokerState", value.asInstanceOf[js.Any])
    
    inline def setBrokerStateUndefined: Self = StObject.set(x, "BrokerState", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDeploymentMode(value: DeploymentMode): Self = StObject.set(x, "DeploymentMode", value.asInstanceOf[js.Any])
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceType(value: string): Self = StObject.set(x, "HostInstanceType", value.asInstanceOf[js.Any])
    
    inline def setHostInstanceTypeUndefined: Self = StObject.set(x, "HostInstanceType", js.undefined)
  }
}
