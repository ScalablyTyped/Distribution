package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDevEnvironmentRequest extends StObject {
  
  /**
    * The system-generated unique ID of the Dev Environment. 
    */
  var id: Uuid
  
  /**
    * Information about the integrated development environment (IDE) configured for a Dev Environment. 
    */
  var ides: js.UndefOr[IdeConfigurationList] = js.undefined
  
  /**
    * The amount of time the Dev Environment will run without any activity detected before stopping, in minutes. Only whole integers are allowed. Dev Environments consume compute minutes when running.
    */
  var inactivityTimeoutMinutes: js.UndefOr[InactivityTimeoutMinutes] = js.undefined
  
  /**
    * The Amazon EC2 instace type to use for the Dev Environment. 
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object StartDevEnvironmentRequest {
  
  inline def apply(id: Uuid, projectName: NameString, spaceName: NameString): StartDevEnvironmentRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDevEnvironmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDevEnvironmentRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdes(value: IdeConfigurationList): Self = StObject.set(x, "ides", value.asInstanceOf[js.Any])
    
    inline def setIdesUndefined: Self = StObject.set(x, "ides", js.undefined)
    
    inline def setIdesVarargs(value: IdeConfiguration*): Self = StObject.set(x, "ides", js.Array(value*))
    
    inline def setInactivityTimeoutMinutes(value: InactivityTimeoutMinutes): Self = StObject.set(x, "inactivityTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setInactivityTimeoutMinutesUndefined: Self = StObject.set(x, "inactivityTimeoutMinutes", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
