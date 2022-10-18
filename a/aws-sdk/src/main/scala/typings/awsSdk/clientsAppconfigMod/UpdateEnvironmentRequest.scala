package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * The environment ID.
    */
  var EnvironmentId: Id
  
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.undefined
  
  /**
    * The name of the environment.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Name] = js.undefined
}
object UpdateEnvironmentRequest {
  
  inline def apply(ApplicationId: Id, EnvironmentId: Id): UpdateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EnvironmentId = EnvironmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentRequest]
  }
  
  extension [Self <: UpdateEnvironmentRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentId(value: Id): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setMonitors(value: MonitorList): Self = StObject.set(x, "Monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsUndefined: Self = StObject.set(x, "Monitors", js.undefined)
    
    inline def setMonitorsVarargs(value: Monitor*): Self = StObject.set(x, "Monitors", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
