package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentRequest extends StObject {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id
  
  /**
    * A description of the environment.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppconfigMod.Description] = js.undefined
  
  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  var Monitors: js.UndefOr[MonitorList] = js.undefined
  
  /**
    * A name for the environment.
    */
  var Name: typings.awsSdk.clientsAppconfigMod.Name
  
  /**
    * Metadata to assign to the environment. Tags help organize and categorize your AppConfig resources. Each tag consists of a key and an optional value, both of which you define.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateEnvironmentRequest {
  
  inline def apply(ApplicationId: Id, Name: Name): CreateEnvironmentRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentRequest]
  }
  
  extension [Self <: CreateEnvironmentRequest](x: Self) {
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMonitors(value: MonitorList): Self = StObject.set(x, "Monitors", value.asInstanceOf[js.Any])
    
    inline def setMonitorsUndefined: Self = StObject.set(x, "Monitors", js.undefined)
    
    inline def setMonitorsVarargs(value: Monitor*): Self = StObject.set(x, "Monitors", js.Array(value*))
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
