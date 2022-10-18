package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTemplateSyncConfigOutput extends StObject {
  
  /**
    * The template sync configuration detail data that's returned by Proton.
    */
  var templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
}
object UpdateTemplateSyncConfigOutput {
  
  inline def apply(): UpdateTemplateSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTemplateSyncConfigOutput]
  }
  
  extension [Self <: UpdateTemplateSyncConfigOutput](x: Self) {
    
    inline def setTemplateSyncConfig(value: TemplateSyncConfig): Self = StObject.set(x, "templateSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setTemplateSyncConfigUndefined: Self = StObject.set(x, "templateSyncConfig", js.undefined)
  }
}
