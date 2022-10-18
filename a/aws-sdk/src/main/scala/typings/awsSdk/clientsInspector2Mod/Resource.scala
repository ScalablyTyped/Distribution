package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    * An object that contains details about the resource involved in a finding.
    */
  var details: js.UndefOr[ResourceDetails] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var id: NonEmptyString
  
  /**
    * The partition of the resource.
    */
  var partition: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Web Services Region the impacted resource is located in.
    */
  var region: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The tags attached to the resource.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of resource.
    */
  var `type`: ResourceType
}
object Resource {
  
  inline def apply(id: NonEmptyString, `type`: ResourceType): Resource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  
  extension [Self <: Resource](x: Self) {
    
    inline def setDetails(value: ResourceDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: NonEmptyString): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setRegion(value: NonEmptyString): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
