package typings.apolloServerCore.runHttpQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpQueryResponse extends js.Object {
  var graphqlResponse: String = js.native
  var responseInit: ApolloServerHttpResponse = js.native
}

object HttpQueryResponse {
  @scala.inline
  def apply(graphqlResponse: String, responseInit: ApolloServerHttpResponse): HttpQueryResponse = {
    val __obj = js.Dynamic.literal(graphqlResponse = graphqlResponse.asInstanceOf[js.Any], responseInit = responseInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpQueryResponse]
  }
  @scala.inline
  implicit class HttpQueryResponseOps[Self <: HttpQueryResponse] (val x: Self) extends AnyVal {
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
    def setGraphqlResponse(value: String): Self = this.set("graphqlResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseInit(value: ApolloServerHttpResponse): Self = this.set("responseInit", value.asInstanceOf[js.Any])
  }
  
}

