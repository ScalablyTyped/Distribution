package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSyncConfigOutput extends StObject {
  
  /**
    * The detailed data of the Proton Ops file.
    */
  var serviceSyncConfig: js.UndefOr[ServiceSyncConfig] = js.undefined
}
object UpdateServiceSyncConfigOutput {
  
  inline def apply(): UpdateServiceSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceSyncConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceSyncConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceSyncConfig(value: ServiceSyncConfig): Self = StObject.set(x, "serviceSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceSyncConfigUndefined: Self = StObject.set(x, "serviceSyncConfig", js.undefined)
  }
}
