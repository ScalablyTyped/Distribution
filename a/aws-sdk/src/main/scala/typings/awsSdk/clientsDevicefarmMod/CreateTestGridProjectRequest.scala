package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTestGridProjectRequest extends StObject {
  
  /**
    * Human-readable description of the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * Human-readable name of the Selenium testing project.
    */
  var name: ResourceName
  
  /**
    * The VPC security groups and subnets that are attached to a project.
    */
  var vpcConfig: js.UndefOr[TestGridVpcConfig] = js.undefined
}
object CreateTestGridProjectRequest {
  
  inline def apply(name: ResourceName): CreateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTestGridProjectRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTestGridProjectRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVpcConfig(value: TestGridVpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
