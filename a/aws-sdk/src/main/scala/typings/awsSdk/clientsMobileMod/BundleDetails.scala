package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleDetails extends StObject {
  
  var availablePlatforms: js.UndefOr[Platforms] = js.undefined
  
  var bundleId: js.UndefOr[BundleId] = js.undefined
  
  var description: js.UndefOr[BundleDescription] = js.undefined
  
  var iconUrl: js.UndefOr[IconUrl] = js.undefined
  
  var title: js.UndefOr[BundleTitle] = js.undefined
  
  var version: js.UndefOr[BundleVersion] = js.undefined
}
object BundleDetails {
  
  inline def apply(): BundleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleDetails]
  }
  
  extension [Self <: BundleDetails](x: Self) {
    
    inline def setAvailablePlatforms(value: Platforms): Self = StObject.set(x, "availablePlatforms", value.asInstanceOf[js.Any])
    
    inline def setAvailablePlatformsUndefined: Self = StObject.set(x, "availablePlatforms", js.undefined)
    
    inline def setAvailablePlatformsVarargs(value: Platform*): Self = StObject.set(x, "availablePlatforms", js.Array(value*))
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    inline def setDescription(value: BundleDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIconUrl(value: IconUrl): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setTitle(value: BundleTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: BundleVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
