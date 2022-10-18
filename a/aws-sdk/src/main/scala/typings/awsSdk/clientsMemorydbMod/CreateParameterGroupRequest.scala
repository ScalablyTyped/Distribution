package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParameterGroupRequest extends StObject {
  
  /**
    * An optional description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group family that the parameter group can be used with.
    */
  var Family: String
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateParameterGroupRequest {
  
  inline def apply(Family: String, ParameterGroupName: String): CreateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(Family = Family.asInstanceOf[js.Any], ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParameterGroupRequest]
  }
  
  extension [Self <: CreateParameterGroupRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
