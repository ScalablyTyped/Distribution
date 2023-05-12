package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSyncConfigOutput extends StObject {
  
  /**
    * The detailed data of the requested service sync configuration.
    */
  var serviceSyncConfig: js.UndefOr[ServiceSyncConfig] = js.undefined
}
object GetServiceSyncConfigOutput {
  
  inline def apply(): GetServiceSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSyncConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSyncConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceSyncConfig(value: ServiceSyncConfig): Self = StObject.set(x, "serviceSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceSyncConfigUndefined: Self = StObject.set(x, "serviceSyncConfig", js.undefined)
  }
}
