package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamResourceDiscoveryAssociation extends StObject {
  
  /**
    * The IPAM ARN.
    */
  var IpamArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The IPAM ID.
    */
  var IpamId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamId] = js.undefined
  
  /**
    * The IPAM home Region.
    */
  var IpamRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The resource discovery association Amazon Resource Name (ARN).
    */
  var IpamResourceDiscoveryAssociationArn: js.UndefOr[String] = js.undefined
  
  /**
    * The resource discovery association ID.
    */
  var IpamResourceDiscoveryAssociationId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryAssociationId] = js.undefined
  
  /**
    * The resource discovery ID.
    */
  var IpamResourceDiscoveryId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId] = js.undefined
  
  /**
    * Defines if the resource discovery is the default. When you create an IPAM, a default resource discovery is created for your IPAM and it's associated with your IPAM.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the resource discovery owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource discovery status.    active - Connection or permissions required to read the results of the resource discovery are intact.    not-found - Connection or permissions required to read the results of the resource discovery are broken. This may happen if the owner of the resource discovery stopped sharing it or deleted the resource discovery. Verify the resource discovery still exists and the Amazon Web Services RAM resource share is still intact.  
    */
  var ResourceDiscoveryStatus: js.UndefOr[IpamAssociatedResourceDiscoveryStatus] = js.undefined
  
  /**
    * The lifecycle state of the association when you associate or disassociate a resource discovery.    associate-in-progress - Resource discovery is being associated.    associate-complete - Resource discovery association is complete.    associate-failed - Resource discovery association has failed.    disassociate-in-progress - Resource discovery is being disassociated.    disassociate-complete - Resource discovery disassociation is complete.    disassociate-failed  - Resource discovery disassociation has failed.    isolate-in-progress - Amazon Web Services account that created the resource discovery association has been removed and the resource discovery associatation is being isolated.    isolate-complete - Resource discovery isolation is complete..    restore-in-progress - Resource discovery is being restored.  
    */
  var State: js.UndefOr[IpamResourceDiscoveryAssociationState] = js.undefined
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object IpamResourceDiscoveryAssociation {
  
  inline def apply(): IpamResourceDiscoveryAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamResourceDiscoveryAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamResourceDiscoveryAssociation] (val x: Self) extends AnyVal {
    
    inline def setIpamArn(value: ResourceArn): Self = StObject.set(x, "IpamArn", value.asInstanceOf[js.Any])
    
    inline def setIpamArnUndefined: Self = StObject.set(x, "IpamArn", js.undefined)
    
    inline def setIpamId(value: IpamId): Self = StObject.set(x, "IpamId", value.asInstanceOf[js.Any])
    
    inline def setIpamIdUndefined: Self = StObject.set(x, "IpamId", js.undefined)
    
    inline def setIpamRegion(value: String): Self = StObject.set(x, "IpamRegion", value.asInstanceOf[js.Any])
    
    inline def setIpamRegionUndefined: Self = StObject.set(x, "IpamRegion", js.undefined)
    
    inline def setIpamResourceDiscoveryAssociationArn(value: String): Self = StObject.set(x, "IpamResourceDiscoveryAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryAssociationArnUndefined: Self = StObject.set(x, "IpamResourceDiscoveryAssociationArn", js.undefined)
    
    inline def setIpamResourceDiscoveryAssociationId(value: IpamResourceDiscoveryAssociationId): Self = StObject.set(x, "IpamResourceDiscoveryAssociationId", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryAssociationIdUndefined: Self = StObject.set(x, "IpamResourceDiscoveryAssociationId", js.undefined)
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryIdUndefined: Self = StObject.set(x, "IpamResourceDiscoveryId", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setResourceDiscoveryStatus(value: IpamAssociatedResourceDiscoveryStatus): Self = StObject.set(x, "ResourceDiscoveryStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceDiscoveryStatusUndefined: Self = StObject.set(x, "ResourceDiscoveryStatus", js.undefined)
    
    inline def setState(value: IpamResourceDiscoveryAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
