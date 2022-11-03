package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationSetInput extends StObject {
  
  /**
    * A token that ensures that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Regions that Incident Manager replicates your data to. You can have up to three Regions in your replication set.
    */
  var regions: RegionMapInput
  
  /**
    * A list of tags to add to the replication set.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateReplicationSetInput {
  
  inline def apply(regions: RegionMapInput): CreateReplicationSetInput = {
    val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationSetInput]
  }
  
  extension [Self <: CreateReplicationSetInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setRegions(value: RegionMapInput): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
