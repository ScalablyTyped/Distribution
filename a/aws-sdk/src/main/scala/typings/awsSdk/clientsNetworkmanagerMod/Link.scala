package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  /**
    * The bandwidth for the link.
    */
  var Bandwidth: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Bandwidth] = js.undefined
  
  /**
    * The date and time that the link was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the link.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the link.
    */
  var LinkArn: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkArn] = js.undefined
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkId] = js.undefined
  
  /**
    * The provider of the link.
    */
  var Provider: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.SiteId] = js.undefined
  
  /**
    * The state of the link.
    */
  var State: js.UndefOr[LinkState] = js.undefined
  
  /**
    * The tags for the link.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of the link.
    */
  var Type: js.UndefOr[ConstrainedString] = js.undefined
}
object Link {
  
  inline def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "Bandwidth", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setLinkArn(value: LinkArn): Self = StObject.set(x, "LinkArn", value.asInstanceOf[js.Any])
    
    inline def setLinkArnUndefined: Self = StObject.set(x, "LinkArn", js.undefined)
    
    inline def setLinkId(value: LinkId): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    inline def setProvider(value: ConstrainedString): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    inline def setState(value: LinkState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ConstrainedString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
