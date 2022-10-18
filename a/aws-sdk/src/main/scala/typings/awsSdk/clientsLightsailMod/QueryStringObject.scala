package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStringObject extends StObject {
  
  /**
    * Indicates whether the distribution forwards and caches based on query strings.
    */
  var option: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The specific query strings that the distribution forwards to the origin. Your distribution will cache content based on the specified query strings. If the option parameter is true, then your distribution forwards all query strings, regardless of what you specify using the queryStringsAllowList parameter.
    */
  var queryStringsAllowList: js.UndefOr[StringList] = js.undefined
}
object QueryStringObject {
  
  inline def apply(): QueryStringObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringObject]
  }
  
  extension [Self <: QueryStringObject](x: Self) {
    
    inline def setOption(value: Boolean): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setQueryStringsAllowList(value: StringList): Self = StObject.set(x, "queryStringsAllowList", value.asInstanceOf[js.Any])
    
    inline def setQueryStringsAllowListUndefined: Self = StObject.set(x, "queryStringsAllowList", js.undefined)
    
    inline def setQueryStringsAllowListVarargs(value: String*): Self = StObject.set(x, "queryStringsAllowList", js.Array(value*))
  }
}
