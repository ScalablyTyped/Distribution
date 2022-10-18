package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkSummary extends StObject {
  
  /**
    * a core network ARN.
    */
  var CoreNetworkArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkArn] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The description of a core network.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The global network ID.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The ID of the account owner.
    */
  var OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The state of a core network.
    */
  var State: js.UndefOr[CoreNetworkState] = js.undefined
  
  /**
    * The key-value tags associated with a core network summary.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CoreNetworkSummary {
  
  inline def apply(): CoreNetworkSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkSummary]
  }
  
  extension [Self <: CoreNetworkSummary](x: Self) {
    
    inline def setCoreNetworkArn(value: CoreNetworkArn): Self = StObject.set(x, "CoreNetworkArn", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkArnUndefined: Self = StObject.set(x, "CoreNetworkArn", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setOwnerAccountId(value: AWSAccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setState(value: CoreNetworkState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
