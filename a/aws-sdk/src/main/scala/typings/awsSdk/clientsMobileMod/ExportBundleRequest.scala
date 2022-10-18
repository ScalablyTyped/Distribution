package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportBundleRequest extends StObject {
  
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId
  
  /**
    *  Developer desktop or target application platform. 
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.undefined
}
object ExportBundleRequest {
  
  inline def apply(bundleId: BundleId): ExportBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBundleRequest]
  }
  
  extension [Self <: ExportBundleRequest](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
