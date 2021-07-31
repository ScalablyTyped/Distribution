package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaClientSearch.mod.SearchIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ js.Any, js.Any]]] */] extends StObject {
  
  val methods: js.UndefOr[TMethods] = js.undefined
}
object Methods {
  
  @scala.inline
  def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ js.Any, js.Any]]] */](): Methods[TMethods] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods[TMethods]]
  }
  
  @scala.inline
  implicit class MethodsMutableBuilder[Self <: Methods[?], TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ js.Any, js.Any]]] */] (val x: Self & Methods[TMethods]) extends AnyVal {
    
    @scala.inline
    def setMethods(value: TMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
  }
}
