package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<app-builder-lib.app-builder-lib/out/electron/ElectronFramework.ElectronBrandingOptions> */
trait RequiredElectronBrandingO extends StObject {
  
  var productName: String
  
  var projectName: String
}
object RequiredElectronBrandingO {
  
  inline def apply(productName: String, projectName: String): RequiredElectronBrandingO = {
    val __obj = js.Dynamic.literal(productName = productName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredElectronBrandingO]
  }
  
  extension [Self <: RequiredElectronBrandingO](x: Self) {
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
  }
}
