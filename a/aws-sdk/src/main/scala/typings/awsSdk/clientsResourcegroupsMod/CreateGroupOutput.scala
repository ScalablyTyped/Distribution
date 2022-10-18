package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupOutput extends StObject {
  
  /**
    * The description of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Group] = js.undefined
  
  /**
    * The service configuration associated with the resource group. For details about the syntax of a service configuration, see Service configurations for resource groups.
    */
  var GroupConfiguration: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupConfiguration] = js.undefined
  
  /**
    * The resource query associated with the group. For more information about resource queries, see Create a tag-based group in Resource Groups. 
    */
  var ResourceQuery: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.ResourceQuery] = js.undefined
  
  /**
    * The tags associated with the group.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Tags] = js.undefined
}
object CreateGroupOutput {
  
  inline def apply(): CreateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupOutput]
  }
  
  extension [Self <: CreateGroupOutput](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupConfiguration(value: GroupConfiguration): Self = StObject.set(x, "GroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setGroupConfigurationUndefined: Self = StObject.set(x, "GroupConfiguration", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
    
    inline def setResourceQuery(value: ResourceQuery): Self = StObject.set(x, "ResourceQuery", value.asInstanceOf[js.Any])
    
    inline def setResourceQueryUndefined: Self = StObject.set(x, "ResourceQuery", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
