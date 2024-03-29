package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineSuggesterResponse extends StObject {
  
  var Suggester: SuggesterStatus
}
object DefineSuggesterResponse {
  
  inline def apply(Suggester: SuggesterStatus): DefineSuggesterResponse = {
    val __obj = js.Dynamic.literal(Suggester = Suggester.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineSuggesterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefineSuggesterResponse] (val x: Self) extends AnyVal {
    
    inline def setSuggester(value: SuggesterStatus): Self = StObject.set(x, "Suggester", value.asInstanceOf[js.Any])
  }
}
