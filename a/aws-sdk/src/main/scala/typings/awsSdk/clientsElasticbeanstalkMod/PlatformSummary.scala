package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformSummary extends StObject {
  
  /**
    * The operating system used by the platform version.
    */
  var OperatingSystemName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.OperatingSystemName] = js.undefined
  
  /**
    * The version of the operating system used by the platform version.
    */
  var OperatingSystemVersion: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.OperatingSystemVersion] = js.undefined
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The state of the platform version's branch in its lifecycle. Possible values: beta | supported | deprecated | retired 
    */
  var PlatformBranchLifecycleState: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformBranchLifecycleState] = js.undefined
  
  /**
    * The platform branch to which the platform version belongs.
    */
  var PlatformBranchName: js.UndefOr[BranchName] = js.undefined
  
  /**
    * The category of platform version.
    */
  var PlatformCategory: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformCategory] = js.undefined
  
  /**
    * The state of the platform version in its lifecycle. Possible values: recommended | empty If an empty value is returned, the platform version is supported but isn't the recommended one for its branch.
    */
  var PlatformLifecycleState: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformLifecycleState] = js.undefined
  
  /**
    * The AWS account ID of the person who created the platform version.
    */
  var PlatformOwner: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformOwner] = js.undefined
  
  /**
    * The status of the platform version. You can create an environment from the platform version once it is ready.
    */
  var PlatformStatus: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformStatus] = js.undefined
  
  /**
    * The version string of the platform version.
    */
  var PlatformVersion: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformVersion] = js.undefined
  
  /**
    * The additions associated with the platform version.
    */
  var SupportedAddonList: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.SupportedAddonList] = js.undefined
  
  /**
    * The tiers in which the platform version runs.
    */
  var SupportedTierList: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.SupportedTierList] = js.undefined
}
object PlatformSummary {
  
  inline def apply(): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformSummary]
  }
  
  extension [Self <: PlatformSummary](x: Self) {
    
    inline def setOperatingSystemName(value: OperatingSystemName): Self = StObject.set(x, "OperatingSystemName", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemNameUndefined: Self = StObject.set(x, "OperatingSystemName", js.undefined)
    
    inline def setOperatingSystemVersion(value: OperatingSystemVersion): Self = StObject.set(x, "OperatingSystemVersion", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionUndefined: Self = StObject.set(x, "OperatingSystemVersion", js.undefined)
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setPlatformBranchLifecycleState(value: PlatformBranchLifecycleState): Self = StObject.set(x, "PlatformBranchLifecycleState", value.asInstanceOf[js.Any])
    
    inline def setPlatformBranchLifecycleStateUndefined: Self = StObject.set(x, "PlatformBranchLifecycleState", js.undefined)
    
    inline def setPlatformBranchName(value: BranchName): Self = StObject.set(x, "PlatformBranchName", value.asInstanceOf[js.Any])
    
    inline def setPlatformBranchNameUndefined: Self = StObject.set(x, "PlatformBranchName", js.undefined)
    
    inline def setPlatformCategory(value: PlatformCategory): Self = StObject.set(x, "PlatformCategory", value.asInstanceOf[js.Any])
    
    inline def setPlatformCategoryUndefined: Self = StObject.set(x, "PlatformCategory", js.undefined)
    
    inline def setPlatformLifecycleState(value: PlatformLifecycleState): Self = StObject.set(x, "PlatformLifecycleState", value.asInstanceOf[js.Any])
    
    inline def setPlatformLifecycleStateUndefined: Self = StObject.set(x, "PlatformLifecycleState", js.undefined)
    
    inline def setPlatformOwner(value: PlatformOwner): Self = StObject.set(x, "PlatformOwner", value.asInstanceOf[js.Any])
    
    inline def setPlatformOwnerUndefined: Self = StObject.set(x, "PlatformOwner", js.undefined)
    
    inline def setPlatformStatus(value: PlatformStatus): Self = StObject.set(x, "PlatformStatus", value.asInstanceOf[js.Any])
    
    inline def setPlatformStatusUndefined: Self = StObject.set(x, "PlatformStatus", js.undefined)
    
    inline def setPlatformVersion(value: PlatformVersion): Self = StObject.set(x, "PlatformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "PlatformVersion", js.undefined)
    
    inline def setSupportedAddonList(value: SupportedAddonList): Self = StObject.set(x, "SupportedAddonList", value.asInstanceOf[js.Any])
    
    inline def setSupportedAddonListUndefined: Self = StObject.set(x, "SupportedAddonList", js.undefined)
    
    inline def setSupportedAddonListVarargs(value: SupportedAddon*): Self = StObject.set(x, "SupportedAddonList", js.Array(value*))
    
    inline def setSupportedTierList(value: SupportedTierList): Self = StObject.set(x, "SupportedTierList", value.asInstanceOf[js.Any])
    
    inline def setSupportedTierListUndefined: Self = StObject.set(x, "SupportedTierList", js.undefined)
    
    inline def setSupportedTierListVarargs(value: SupportedTier*): Self = StObject.set(x, "SupportedTierList", js.Array(value*))
  }
}
