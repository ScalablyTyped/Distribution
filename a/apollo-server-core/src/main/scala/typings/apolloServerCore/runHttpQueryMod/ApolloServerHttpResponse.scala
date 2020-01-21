package typings.apolloServerCore.runHttpQueryMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerHttpResponse extends js.Object {
  var headers: js.UndefOr[Record[String, String]] = js.undefined
}

object ApolloServerHttpResponse {
  @scala.inline
  def apply(headers: Record[String, String] = null): ApolloServerHttpResponse = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloServerHttpResponse]
  }
}

