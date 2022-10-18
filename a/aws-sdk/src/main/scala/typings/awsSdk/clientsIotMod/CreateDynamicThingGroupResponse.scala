package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDynamicThingGroupResponse extends StObject {
  
  /**
    * The dynamic thing group index name.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The dynamic thing group search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The dynamic thing group query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  
  /**
    * The dynamic thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  
  /**
    * The dynamic thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  
  /**
    * The dynamic thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
}
object CreateDynamicThingGroupResponse {
  
  inline def apply(): CreateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDynamicThingGroupResponse]
  }
  
  extension [Self <: CreateDynamicThingGroupResponse](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    inline def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    inline def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
    
    inline def setThingGroupArn(value: ThingGroupArn): Self = StObject.set(x, "thingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setThingGroupArnUndefined: Self = StObject.set(x, "thingGroupArn", js.undefined)
    
    inline def setThingGroupId(value: ThingGroupId): Self = StObject.set(x, "thingGroupId", value.asInstanceOf[js.Any])
    
    inline def setThingGroupIdUndefined: Self = StObject.set(x, "thingGroupId", js.undefined)
    
    inline def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    inline def setThingGroupNameUndefined: Self = StObject.set(x, "thingGroupName", js.undefined)
  }
}
