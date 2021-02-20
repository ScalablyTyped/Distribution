package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaClientSearch.mod.SearchIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */] extends StObject {
  
  val methods: js.UndefOr[TMethods] = js.native
}
object Methods {
  
  @scala.inline
  def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */](): Methods[TMethods] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods[TMethods]]
  }
  
  @scala.inline
  implicit class MethodsMutableBuilder[Self <: Methods[_], TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */] (val x: Self with Methods[TMethods]) extends AnyVal {
    
    @scala.inline
    def setMethods(value: TMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
  }
}
