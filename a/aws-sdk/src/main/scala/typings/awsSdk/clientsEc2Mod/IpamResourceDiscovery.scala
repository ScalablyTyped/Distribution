package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamResourceDiscovery extends StObject {
  
  /**
    * The resource discovery description.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The resource discovery Amazon Resource Name (ARN).
    */
  var IpamResourceDiscoveryArn: js.UndefOr[String] = js.undefined
  
  /**
    * The resource discovery ID.
    */
  var IpamResourceDiscoveryId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId] = js.undefined
  
  /**
    * The resource discovery Region.
    */
  var IpamResourceDiscoveryRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Defines if the resource discovery is the default. The default resource discovery is the resource discovery automatically created when you create an IPAM.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The operating Regions for the resource discovery. Operating Regions are Amazon Web Services Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only discovers and monitors resources in the Amazon Web Services Regions you select as operating Regions.
    */
  var OperatingRegions: js.UndefOr[IpamOperatingRegionSet] = js.undefined
  
  /**
    * The ID of the owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The lifecycle state of the resource discovery.    create-in-progress - Resource discovery is being created.    create-complete - Resource discovery creation is complete.    create-failed - Resource discovery creation has failed.    modify-in-progress - Resource discovery is being modified.    modify-complete - Resource discovery modification is complete.    modify-failed - Resource discovery modification has failed.    delete-in-progress - Resource discovery is being deleted.    delete-complete - Resource discovery deletion is complete.    delete-failed - Resource discovery deletion has failed.    isolate-in-progress - Amazon Web Services account that created the resource discovery has been removed and the resource discovery is being isolated.    isolate-complete - Resource discovery isolation is complete.    restore-in-progress - Amazon Web Services account that created the resource discovery and was isolated has been restored.  
    */
  var State: js.UndefOr[IpamResourceDiscoveryState] = js.undefined
  
  /**
    * A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value. You can use tags to search and filter your resources or track your Amazon Web Services costs.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object IpamResourceDiscovery {
  
  inline def apply(): IpamResourceDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamResourceDiscovery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamResourceDiscovery] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIpamResourceDiscoveryArn(value: String): Self = StObject.set(x, "IpamResourceDiscoveryArn", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryArnUndefined: Self = StObject.set(x, "IpamResourceDiscoveryArn", js.undefined)
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryIdUndefined: Self = StObject.set(x, "IpamResourceDiscoveryId", js.undefined)
    
    inline def setIpamResourceDiscoveryRegion(value: String): Self = StObject.set(x, "IpamResourceDiscoveryRegion", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryRegionUndefined: Self = StObject.set(x, "IpamResourceDiscoveryRegion", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setOperatingRegions(value: IpamOperatingRegionSet): Self = StObject.set(x, "OperatingRegions", value.asInstanceOf[js.Any])
    
    inline def setOperatingRegionsUndefined: Self = StObject.set(x, "OperatingRegions", js.undefined)
    
    inline def setOperatingRegionsVarargs(value: IpamOperatingRegion*): Self = StObject.set(x, "OperatingRegions", js.Array(value*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: IpamResourceDiscoveryState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
