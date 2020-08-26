package typings.apolloServerCore.runHttpQueryMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloServerHttpResponse extends js.Object {
  var headers: js.UndefOr[Record[String, String]] = js.native
}

object ApolloServerHttpResponse {
  @scala.inline
  def apply(): ApolloServerHttpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApolloServerHttpResponse]
  }
  @scala.inline
  implicit class ApolloServerHttpResponseOps[Self <: ApolloServerHttpResponse] (val x: Self) extends AnyVal {
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
    def setHeaders(value: Record[String, String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

