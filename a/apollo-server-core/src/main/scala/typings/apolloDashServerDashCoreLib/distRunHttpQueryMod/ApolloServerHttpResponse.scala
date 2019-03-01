package typings
package apolloDashServerDashCoreLib.distRunHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerHttpResponse extends js.Object {
  var headers: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

object ApolloServerHttpResponse {
  @scala.inline
  def apply(headers: stdLib.Record[java.lang.String, java.lang.String] = null): ApolloServerHttpResponse = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[ApolloServerHttpResponse]
  }
}

