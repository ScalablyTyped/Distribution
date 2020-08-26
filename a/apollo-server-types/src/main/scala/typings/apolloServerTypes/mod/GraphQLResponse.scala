package typings.apolloServerTypes.mod

import typings.apolloServerTypes.anon.PickResponseheadersPartia
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLResponse extends js.Object {
  var data: js.UndefOr[(Record[String, _]) | Null] = js.native
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.native
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var http: js.UndefOr[PickResponseheadersPartia] = js.native
}

object GraphQLResponse {
  @scala.inline
  def apply(): GraphQLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLResponse]
  }
  @scala.inline
  implicit class GraphQLResponseOps[Self <: GraphQLResponse] (val x: Self) extends AnyVal {
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
    def setData(value: Record[String, _]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setErrorsVarargs(value: (GraphQLFormattedError[Record[String, js.Any]])*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLFormattedError[Record[String, _]]]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setHttp(value: PickResponseheadersPartia): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
  }
  
}

