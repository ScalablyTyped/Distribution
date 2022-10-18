package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStudioInput extends StObject {
  
  /**
    * The Amazon S3 location to back up Workspaces and notebook files for the Amazon EMR Studio.
    */
  var DefaultS3Location: js.UndefOr[XmlString] = js.undefined
  
  /**
    * A detailed description to assign to the Amazon EMR Studio.
    */
  var Description: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * A descriptive name for the Amazon EMR Studio.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The ID of the Amazon EMR Studio to update.
    */
  var StudioId: XmlStringMaxLen256
  
  /**
    * A list of subnet IDs to associate with the Amazon EMR Studio. The list can include new subnet IDs, but must also include all of the subnet IDs previously associated with the Studio. The list order does not matter. A Studio can have a maximum of 5 subnets. The subnets must belong to the same VPC as the Studio. 
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.undefined
}
object UpdateStudioInput {
  
  inline def apply(StudioId: XmlStringMaxLen256): UpdateStudioInput = {
    val __obj = js.Dynamic.literal(StudioId = StudioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStudioInput]
  }
  
  extension [Self <: UpdateStudioInput](x: Self) {
    
    inline def setDefaultS3Location(value: XmlString): Self = StObject.set(x, "DefaultS3Location", value.asInstanceOf[js.Any])
    
    inline def setDefaultS3LocationUndefined: Self = StObject.set(x, "DefaultS3Location", js.undefined)
    
    inline def setDescription(value: XmlStringMaxLen256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
