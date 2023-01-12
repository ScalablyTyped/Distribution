package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThingGroupRequest extends StObject {
  
  /**
    * The name of the parent thing group.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.undefined
  
  /**
    * Metadata which can be used to manage the thing group.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The thing group name to create.
    */
  var thingGroupName: ThingGroupName
  
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
}
object CreateThingGroupRequest {
  
  inline def apply(thingGroupName: ThingGroupName): CreateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateThingGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setParentGroupName(value: ThingGroupName): Self = StObject.set(x, "parentGroupName", value.asInstanceOf[js.Any])
    
    inline def setParentGroupNameUndefined: Self = StObject.set(x, "parentGroupName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    inline def setThingGroupProperties(value: ThingGroupProperties): Self = StObject.set(x, "thingGroupProperties", value.asInstanceOf[js.Any])
    
    inline def setThingGroupPropertiesUndefined: Self = StObject.set(x, "thingGroupProperties", js.undefined)
  }
}
