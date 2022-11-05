package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobTemplateResponse extends StObject {
  
  /**
    * This output contains the ID of the job template that was deleted.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
}
object DeleteJobTemplateResponse {
  
  inline def apply(): DeleteJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteJobTemplateResponse]
  }
  
  extension [Self <: DeleteJobTemplateResponse](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
