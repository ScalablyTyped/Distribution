package typings.algoliaClientCommon.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */, TClient] extends js.Object {
  val methods: js.UndefOr[TMethods] = js.undefined
}

object Methods {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Function1[/ * base * / TClient, js.Function1[/ * args * / _, _]]] */ TMethods, TClient](methods: TMethods = null): Methods[TMethods, TClient] = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[Methods[TMethods, TClient]]
  }
}

