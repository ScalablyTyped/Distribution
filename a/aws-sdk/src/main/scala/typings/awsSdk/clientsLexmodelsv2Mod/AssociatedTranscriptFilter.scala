package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedTranscriptFilter extends StObject {
  
  /**
    * The name of the field to use for filtering. The allowed names are IntentId and SlotTypeId.
    */
  var name: AssociatedTranscriptFilterName
  
  /**
    * The values to use to filter the transcript.
    */
  var values: FilterValues
}
object AssociatedTranscriptFilter {
  
  inline def apply(name: AssociatedTranscriptFilterName, values: FilterValues): AssociatedTranscriptFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedTranscriptFilter]
  }
  
  extension [Self <: AssociatedTranscriptFilter](x: Self) {
    
    inline def setName(value: AssociatedTranscriptFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
