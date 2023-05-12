package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionsOptions
  extends StObject
     with PagingOptions {
  
  /** List of fields to include or exclude */
  var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** true if the fields specified are to be included in the result, false otherwise. Default true */
  var include_fields: js.UndefOr[Boolean] = js.undefined
  
  /** true if a query summary must be included in the result, false otherwise. Default false */
  var include_totals: js.UndefOr[Boolean] = js.undefined
  
  /** Provide the name of the connection to retrieve */
  var name: js.UndefOr[String] = js.undefined
  
  /** Provide strategies to only retrieve connections with such strategies */
  var strategy: js.UndefOr[Strategy] = js.undefined
}
object GetConnectionsOptions {
  
  inline def apply(): GetConnectionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectionsOptions] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setInclude_fields(value: Boolean): Self = StObject.set(x, "include_fields", value.asInstanceOf[js.Any])
    
    inline def setInclude_fieldsUndefined: Self = StObject.set(x, "include_fields", js.undefined)
    
    inline def setInclude_totals(value: Boolean): Self = StObject.set(x, "include_totals", value.asInstanceOf[js.Any])
    
    inline def setInclude_totalsUndefined: Self = StObject.set(x, "include_totals", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
