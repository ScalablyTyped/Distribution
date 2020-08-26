package typings.apolloServerTypes.anon

import typings.apolloServerEnv.fetchMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-env.apollo-server-env.Request, 'url' | 'method' | 'headers'> */
@js.native
trait PickRequesturlmethodheade extends js.Object {
  var headers: Headers = js.native
  var method: String = js.native
  var url: String = js.native
}

object PickRequesturlmethodheade {
  @scala.inline
  def apply(headers: Headers, method: String, url: String): PickRequesturlmethodheade = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickRequesturlmethodheade]
  }
  @scala.inline
  implicit class PickRequesturlmethodheadeOps[Self <: PickRequesturlmethodheade] (val x: Self) extends AnyVal {
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
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

