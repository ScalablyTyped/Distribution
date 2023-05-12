package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupInput extends StObject {
  
  /**
    * A configuration associates the resource group with an Amazon Web Services service and specifies how the service can interact with the resources in the group. A configuration is an array of GroupConfigurationItem elements. For details about the syntax of service configurations, see Service configurations for Resource Groups.  A resource group can contain either a Configuration or a ResourceQuery, but not both. 
    */
  var Configuration: js.UndefOr[GroupConfigurationList] = js.undefined
  
  /**
    * The description of the resource group. Descriptions can consist of letters, numbers, hyphens, underscores, periods, and spaces.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Description] = js.undefined
  
  /**
    * The name of the group, which is the identifier of the group in other operations. You can't change the name of a resource group after you create it. A resource group name can consist of letters, numbers, hyphens, periods, and underscores. The name cannot start with AWS or aws; these are reserved. A resource group name must be unique within each Amazon Web Services Region in your Amazon Web Services account.
    */
  var Name: GroupName
  
  /**
    * The resource query that determines which Amazon Web Services resources are members of this group. For more information about resource queries, see Create a tag-based group in Resource Groups.   A resource group can contain either a ResourceQuery or a Configuration, but not both. 
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ResourceQuery] = js.undefined
  
  /**
    * The tags to add to the group. A tag is key-value pair string.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Tags] = js.undefined
}
object CreateGroupInput {
  
  inline def apply(Name: GroupName): CreateGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGroupInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: GroupConfigurationList): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setConfigurationVarargs(value: GroupConfigurationItem*): Self = StObject.set(x, "Configuration", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: GroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
    
    inline def setResourceQueryUndefined: Self = StObject.set(x, "ResourceQuery", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
