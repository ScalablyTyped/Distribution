package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectRequest extends StObject {
  
  /**
    * Sets the execution timeout value (in minutes) for a project. All test runs in this project use the specified execution timeout value unless overridden when scheduling a run.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  
  /**
    * The project's name.
    */
  var name: Name
  
  /**
    * The VPC security groups and subnets that are attached to a project.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}
object CreateProjectRequest {
  
  inline def apply(name: Name): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "defaultJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setDefaultJobTimeoutMinutesUndefined: Self = StObject.set(x, "defaultJobTimeoutMinutes", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
