package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitiveDataOccurrencesRequest extends StObject {
  
  /**
    * The unique identifier for the finding.
    */
  var findingId: string
}
object GetSensitiveDataOccurrencesRequest {
  
  inline def apply(findingId: string): GetSensitiveDataOccurrencesRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSensitiveDataOccurrencesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSensitiveDataOccurrencesRequest] (val x: Self) extends AnyVal {
    
    inline def setFindingId(value: string): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
  }
}
