package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamScope extends StObject {
  
  /**
    * The description of the scope.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IPAM.
    */
  var IpamArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The Amazon Web Services Region of the IPAM scope.
    */
  var IpamRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the scope.
    */
  var IpamScopeArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The ID of the scope.
    */
  var IpamScopeId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamScopeId] = js.undefined
  
  /**
    * The type of the scope.
    */
  var IpamScopeType: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamScopeType] = js.undefined
  
  /**
    * Defines if the scope is the default scope or not.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the scope.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of pools in the scope.
    */
  var PoolCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The state of the IPAM scope.
    */
  var State: js.UndefOr[IpamScopeState] = js.undefined
  
  /**
    * The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object IpamScope {
  
  inline def apply(): IpamScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpamScope] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIpamArn(value: ResourceArn): Self = StObject.set(x, "IpamArn", value.asInstanceOf[js.Any])
    
    inline def setIpamArnUndefined: Self = StObject.set(x, "IpamArn", js.undefined)
    
    inline def setIpamRegion(value: String): Self = StObject.set(x, "IpamRegion", value.asInstanceOf[js.Any])
    
    inline def setIpamRegionUndefined: Self = StObject.set(x, "IpamRegion", js.undefined)
    
    inline def setIpamScopeArn(value: ResourceArn): Self = StObject.set(x, "IpamScopeArn", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeArnUndefined: Self = StObject.set(x, "IpamScopeArn", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeIdUndefined: Self = StObject.set(x, "IpamScopeId", js.undefined)
    
    inline def setIpamScopeType(value: IpamScopeType): Self = StObject.set(x, "IpamScopeType", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeTypeUndefined: Self = StObject.set(x, "IpamScopeType", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setPoolCount(value: Integer): Self = StObject.set(x, "PoolCount", value.asInstanceOf[js.Any])
    
    inline def setPoolCountUndefined: Self = StObject.set(x, "PoolCount", js.undefined)
    
    inline def setState(value: IpamScopeState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
