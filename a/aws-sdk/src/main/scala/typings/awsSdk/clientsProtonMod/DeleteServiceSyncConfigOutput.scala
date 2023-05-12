package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceSyncConfigOutput extends StObject {
  
  /**
    * The detailed data for the service sync config.
    */
  var serviceSyncConfig: js.UndefOr[ServiceSyncConfig] = js.undefined
}
object DeleteServiceSyncConfigOutput {
  
  inline def apply(): DeleteServiceSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteServiceSyncConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceSyncConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceSyncConfig(value: ServiceSyncConfig): Self = StObject.set(x, "serviceSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceSyncConfigUndefined: Self = StObject.set(x, "serviceSyncConfig", js.undefined)
  }
}
