package typings.algoliaClientCommon.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods[TMethods /* <: StringDictionary[js.Function1[/* base */ TClient, js.Function1[/* args */ _, _]]] */, TClient] extends js.Object {
  val methods: js.UndefOr[TMethods] = js.native
}

object Methods {
  @scala.inline
  def apply[/* <: org.scalablytyped.runtime.StringDictionary[js.Function1[/ * base * / TClient, js.Function1[/ * args * / _, _]]] */ TMethods, TClient](): Methods[TMethods, TClient] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods[TMethods, TClient]]
  }
  @scala.inline
  implicit class MethodsOps[Self <: Methods[_, _], /* <: org.scalablytyped.runtime.StringDictionary[js.Function1[/ * base * / TClient, js.Function1[/ * args * / _, _]]] */ TMethods, TClient] (val x: Self with (Methods[TMethods, TClient])) extends AnyVal {
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

