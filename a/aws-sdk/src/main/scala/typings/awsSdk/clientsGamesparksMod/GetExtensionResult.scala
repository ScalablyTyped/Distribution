package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExtensionResult extends StObject {
  
  /**
    * Details about the extension.
    */
  var Extension: js.UndefOr[ExtensionDetails] = js.undefined
}
object GetExtensionResult {
  
  inline def apply(): GetExtensionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtensionResult]
  }
  
  extension [Self <: GetExtensionResult](x: Self) {
    
    inline def setExtension(value: ExtensionDetails): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "Extension", js.undefined)
  }
}
