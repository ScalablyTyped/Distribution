package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtensionVersionResult extends StObject {
  
  /**
    * The version of the extension.
    */
  var ExtensionVersion: js.UndefOr[ExtensionVersionDetails] = js.undefined
}
object GetExtensionVersionResult {
  
  inline def apply(): GetExtensionVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtensionVersionResult]
  }
  
  extension [Self <: GetExtensionVersionResult](x: Self) {
    
    inline def setExtensionVersion(value: ExtensionVersionDetails): Self = StObject.set(x, "ExtensionVersion", value.asInstanceOf[js.Any])
    
    inline def setExtensionVersionUndefined: Self = StObject.set(x, "ExtensionVersion", js.undefined)
  }
}
