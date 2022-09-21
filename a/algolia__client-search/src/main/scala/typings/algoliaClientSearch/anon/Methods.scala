package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaClientSearch.mod.SearchIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ Any, Any]]] */] extends StObject {
  
  val methods: js.UndefOr[TMethods] = js.undefined
}
object Methods {
  
  inline def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ Any, Any]]] */](): Methods[TMethods] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods[TMethods]]
  }
  
  extension [Self <: Methods[?], TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ Any, Any]]] */](x: Self & Methods[TMethods]) {
    
    inline def setMethods(value: TMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
  }
}
