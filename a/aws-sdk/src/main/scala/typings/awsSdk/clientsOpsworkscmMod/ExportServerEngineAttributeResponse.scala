package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportServerEngineAttributeResponse extends StObject {
  
  /**
    * The requested engine attribute pair with attribute name and value.
    */
  var EngineAttribute: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.EngineAttribute] = js.undefined
  
  /**
    * The server name used in the request.
    */
  var ServerName: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.ServerName] = js.undefined
}
object ExportServerEngineAttributeResponse {
  
  inline def apply(): ExportServerEngineAttributeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportServerEngineAttributeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportServerEngineAttributeResponse] (val x: Self) extends AnyVal {
    
    inline def setEngineAttribute(value: EngineAttribute): Self = StObject.set(x, "EngineAttribute", value.asInstanceOf[js.Any])
    
    inline def setEngineAttributeUndefined: Self = StObject.set(x, "EngineAttribute", js.undefined)
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
  }
}
