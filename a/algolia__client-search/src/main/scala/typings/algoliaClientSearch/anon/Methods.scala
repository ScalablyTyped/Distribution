package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaClientSearch.mod.SearchIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ SearchIndex, js.Function1[/* args */ _, _]]] */] extends js.Object {
  val methods: js.UndefOr[TMethods] = js.undefined
}

object Methods {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[
  js.Function1[
    / * base * / typings.algoliaClientSearch.mod.SearchIndex, 
    js.Function1[/ * args * / _, _]
  ]] */ TMethods](methods: TMethods = null): Methods[TMethods] = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Methods[TMethods]]
  }
}

