package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackagingConfigurationRequest extends StObject {
  
  var CmafPackage: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.CmafPackage] = js.undefined
  
  var DashPackage: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.DashPackage] = js.undefined
  
  var HlsPackage: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.HlsPackage] = js.undefined
  
  /**
    * The ID of the PackagingConfiguration.
    */
  var Id: string
  
  var MssPackage: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.MssPackage] = js.undefined
  
  /**
    * The ID of a PackagingGroup.
    */
  var PackagingGroupId: string
  
  var Tags: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.Tags] = js.undefined
}
object CreatePackagingConfigurationRequest {
  
  inline def apply(Id: string, PackagingGroupId: string): CreatePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PackagingGroupId = PackagingGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingConfigurationRequest]
  }
  
  extension [Self <: CreatePackagingConfigurationRequest](x: Self) {
    
    inline def setCmafPackage(value: CmafPackage): Self = StObject.set(x, "CmafPackage", value.asInstanceOf[js.Any])
    
    inline def setCmafPackageUndefined: Self = StObject.set(x, "CmafPackage", js.undefined)
    
    inline def setDashPackage(value: DashPackage): Self = StObject.set(x, "DashPackage", value.asInstanceOf[js.Any])
    
    inline def setDashPackageUndefined: Self = StObject.set(x, "DashPackage", js.undefined)
    
    inline def setHlsPackage(value: HlsPackage): Self = StObject.set(x, "HlsPackage", value.asInstanceOf[js.Any])
    
    inline def setHlsPackageUndefined: Self = StObject.set(x, "HlsPackage", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMssPackage(value: MssPackage): Self = StObject.set(x, "MssPackage", value.asInstanceOf[js.Any])
    
    inline def setMssPackageUndefined: Self = StObject.set(x, "MssPackage", js.undefined)
    
    inline def setPackagingGroupId(value: string): Self = StObject.set(x, "PackagingGroupId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
