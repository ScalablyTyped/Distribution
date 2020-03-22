package typings.apolloServerCore

import typings.apolloServerEnv.fetchMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-env.apollo-server-env.Request, 'url' | 'method' | 'headers'> */
trait PickRequesturlmethodheade extends js.Object {
  var headers: Headers
  var method: String
  var url: String
}

object PickRequesturlmethodheade {
  @scala.inline
  def apply(headers: Headers, method: String, url: String): PickRequesturlmethodheade = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickRequesturlmethodheade]
  }
}

