package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSessionResponse extends StObject {
  
  /**
    * Returns the Id of the stopped session.
    */
  var Id: js.UndefOr[NameString] = js.undefined
}
object StopSessionResponse {
  
  inline def apply(): StopSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopSessionResponse]
  }
  
  extension [Self <: StopSessionResponse](x: Self) {
    
    inline def setId(value: NameString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
