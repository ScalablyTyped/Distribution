package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInstanceResponse extends StObject {
  
  /**
    * An object that describes the system instance.
    */
  var description: js.UndefOr[SystemInstanceDescription] = js.undefined
}
object GetSystemInstanceResponse {
  
  inline def apply(): GetSystemInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInstanceResponse]
  }
  
  extension [Self <: GetSystemInstanceResponse](x: Self) {
    
    inline def setDescription(value: SystemInstanceDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
