package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// AQL
trait Query extends StObject {
  
  var bindVars: js.UndefOr[js.Object] = js.undefined
  
  var options: js.UndefOr[QueryOptions] = js.undefined
  
  var query: String
}
object Query {
  
  @scala.inline
  def apply(query: String): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindVars(value: js.Object): Self = StObject.set(x, "bindVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindVarsUndefined: Self = StObject.set(x, "bindVars", js.undefined)
    
    @scala.inline
    def setOptions(value: QueryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
