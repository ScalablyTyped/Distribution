package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetGroupRequest extends StObject {
  
  /**
    * A description for the subnet group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: String
  
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  var SubnetIds: SubnetIdentifierList
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateSubnetGroupRequest {
  
  inline def apply(SubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetGroupRequest]
  }
  
  extension [Self <: CreateSubnetGroupRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
