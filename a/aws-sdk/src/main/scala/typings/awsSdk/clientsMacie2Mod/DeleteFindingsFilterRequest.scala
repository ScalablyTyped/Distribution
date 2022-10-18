package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFindingsFilterRequest extends StObject {
  
  /**
    * The unique identifier for the Amazon Macie resource that the request applies to.
    */
  var id: string
}
object DeleteFindingsFilterRequest {
  
  inline def apply(id: string): DeleteFindingsFilterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFindingsFilterRequest]
  }
  
  extension [Self <: DeleteFindingsFilterRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
