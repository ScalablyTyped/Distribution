package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGraphqlApiResponse extends js.Object {
  /**
    * The GraphqlApi.
    */
  var graphqlApi: js.UndefOr[GraphqlApi] = js.native
}

object CreateGraphqlApiResponse {
  @scala.inline
  def apply(): CreateGraphqlApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGraphqlApiResponse]
  }
  @scala.inline
  implicit class CreateGraphqlApiResponseOps[Self <: CreateGraphqlApiResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGraphqlApi(value: GraphqlApi): Self = this.set("graphqlApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphqlApi: Self = this.set("graphqlApi", js.undefined)
  }
  
}

