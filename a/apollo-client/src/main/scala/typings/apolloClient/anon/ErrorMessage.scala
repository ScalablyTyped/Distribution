package typings.apolloClient.anon

import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.native
  var extraInfo: js.UndefOr[js.Any] = js.native
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var networkError: js.UndefOr[Error | Null] = js.native
}

object ErrorMessage {
  @scala.inline
  def apply(): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorMessage]
  }
  @scala.inline
  implicit class ErrorMessageOps[Self <: ErrorMessage] (val x: Self) extends AnyVal {
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setExtraInfo(value: js.Any): Self = this.set("extraInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraInfo: Self = this.set("extraInfo", js.undefined)
    @scala.inline
    def setGraphQLErrorsVarargs(value: GraphQLError*): Self = this.set("graphQLErrors", js.Array(value :_*))
    @scala.inline
    def setGraphQLErrors(value: js.Array[GraphQLError]): Self = this.set("graphQLErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphQLErrors: Self = this.set("graphQLErrors", js.undefined)
    @scala.inline
    def setNetworkError(value: Error): Self = this.set("networkError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkError: Self = this.set("networkError", js.undefined)
    @scala.inline
    def setNetworkErrorNull: Self = this.set("networkError", null)
  }
  
}

