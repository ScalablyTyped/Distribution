package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitiveDataOccurrencesAvailabilityRequest extends StObject {
  
  /**
    * The unique identifier for the finding.
    */
  var findingId: string
}
object GetSensitiveDataOccurrencesAvailabilityRequest {
  
  inline def apply(findingId: string): GetSensitiveDataOccurrencesAvailabilityRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSensitiveDataOccurrencesAvailabilityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSensitiveDataOccurrencesAvailabilityRequest] (val x: Self) extends AnyVal {
    
    inline def setFindingId(value: string): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
  }
}
