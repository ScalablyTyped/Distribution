package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSuggesterResponse extends StObject {
  
  /**
    * The status of the suggester being deleted.
    */
  var Suggester: SuggesterStatus
}
object DeleteSuggesterResponse {
  
  inline def apply(Suggester: SuggesterStatus): DeleteSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuggesterResponse]
  }
  
  extension [Self <: DeleteSuggesterResponse](x: Self) {
    
    inline def setSuggester(value: SuggesterStatus): Self = StObject.set(x, "Suggester", value.asInstanceOf[js.Any])
  }
}
