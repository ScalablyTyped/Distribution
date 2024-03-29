package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionQuery extends StObject {
  
  /**
    * Defines a property name hint. Only property names that begin with the specified hint are included in the response.
    */
  var PropertyNameQuery: js.UndefOr[typings.awsSdk.clientsSagemakerMod.PropertyNameQuery] = js.undefined
}
object SuggestionQuery {
  
  inline def apply(): SuggestionQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionQuery] (val x: Self) extends AnyVal {
    
    inline def setPropertyNameQuery(value: PropertyNameQuery): Self = StObject.set(x, "PropertyNameQuery", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameQueryUndefined: Self = StObject.set(x, "PropertyNameQuery", js.undefined)
  }
}
