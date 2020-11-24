package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaClientSearch.mod.SearchIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */] extends js.Object {
  
  val methods: js.UndefOr[TMethods] = js.native
}
object Methods {
  
  @scala.inline
  def apply[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */](): Methods[TMethods] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods[TMethods]]
  }
  
  @scala.inline
  implicit class MethodsOps[Self <: Methods[_], TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */] (val x: Self with Methods[TMethods]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethods(value: TMethods): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
  }
}
