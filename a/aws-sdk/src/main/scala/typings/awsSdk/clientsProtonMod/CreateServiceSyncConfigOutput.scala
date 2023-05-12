package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceSyncConfigOutput extends StObject {
  
  /**
    * The detailed data of the Proton Ops file.
    */
  var serviceSyncConfig: js.UndefOr[ServiceSyncConfig] = js.undefined
}
object CreateServiceSyncConfigOutput {
  
  inline def apply(): CreateServiceSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceSyncConfigOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceSyncConfigOutput] (val x: Self) extends AnyVal {
    
    inline def setServiceSyncConfig(value: ServiceSyncConfig): Self = StObject.set(x, "serviceSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setServiceSyncConfigUndefined: Self = StObject.set(x, "serviceSyncConfig", js.undefined)
  }
}
