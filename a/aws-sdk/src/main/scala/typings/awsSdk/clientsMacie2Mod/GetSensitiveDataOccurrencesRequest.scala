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
  
  extension [Self <: GetSensitiveDataOccurrencesRequest](x: Self) {
    
    inline def setFindingId(value: string): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
  }
}
