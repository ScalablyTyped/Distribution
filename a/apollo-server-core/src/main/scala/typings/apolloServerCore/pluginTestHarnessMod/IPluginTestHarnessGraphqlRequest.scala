package typings.apolloServerCore.pluginTestHarnessMod

import typings.apolloServerTypes.anon.PickRequesturlmethodheade
import typings.apolloServerTypes.mod.VariableValues
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-types.apollo-server-types.WithRequired<apollo-server-types.apollo-server-types.GraphQLRequest, 'query'> */
@js.native
trait IPluginTestHarnessGraphqlRequest extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.native
  var http: js.UndefOr[PickRequesturlmethodheade] = js.native
  var operationName: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] with String = js.native
  var variables: js.UndefOr[VariableValues] = js.native
}

object IPluginTestHarnessGraphqlRequest {
  @scala.inline
  def apply(query: js.UndefOr[String] with String): IPluginTestHarnessGraphqlRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginTestHarnessGraphqlRequest]
  }
  @scala.inline
  implicit class IPluginTestHarnessGraphqlRequestOps[Self <: IPluginTestHarnessGraphqlRequest] (val x: Self) extends AnyVal {
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
    def setQuery(value: js.UndefOr[String] with String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: Record[String, _]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setHttp(value: PickRequesturlmethodheade): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setVariables(value: VariableValues): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

