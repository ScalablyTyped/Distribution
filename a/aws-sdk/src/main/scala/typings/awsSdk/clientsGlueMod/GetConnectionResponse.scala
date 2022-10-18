package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionResponse extends StObject {
  
  /**
    * The requested connection definition.
    */
  var Connection: js.UndefOr[typings.awsSdk.clientsGlueMod.Connection] = js.undefined
}
object GetConnectionResponse {
  
  inline def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  
  extension [Self <: GetConnectionResponse](x: Self) {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
