package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetwork extends StObject {
  
  /**
    * The ARN of a core network.
    */
  var CoreNetworkArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkArn] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The timestamp when a core network was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of a core network.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The edges within a core network.
    */
  var Edges: js.UndefOr[CoreNetworkEdgeList] = js.undefined
  
  /**
    * The ID of the global network that your core network is a part of. 
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The segments within a core network.
    */
  var Segments: js.UndefOr[CoreNetworkSegmentList] = js.undefined
  
  /**
    * The current state of a core network.
    */
  var State: js.UndefOr[CoreNetworkState] = js.undefined
  
  /**
    * The list of key-value tags associated with a core network.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CoreNetwork {
  
  inline def apply(): CoreNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreNetwork] (val x: Self) extends AnyVal {
    
    inline def setCoreNetworkArn(value: CoreNetworkArn): Self = StObject.set(x, "CoreNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkArnUndefined: Self = StObject.set(x, "CoreNetworkArn", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEdges(value: CoreNetworkEdgeList): Self = StObject.set(x, "Edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "Edges", js.undefined)
    
    inline def setEdgesVarargs(value: CoreNetworkEdge*): Self = StObject.set(x, "Edges", js.Array(value*))
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setSegments(value: CoreNetworkSegmentList): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
    
    inline def setSegmentsVarargs(value: CoreNetworkSegment*): Self = StObject.set(x, "Segments", js.Array(value*))
    
    inline def setState(value: CoreNetworkState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
