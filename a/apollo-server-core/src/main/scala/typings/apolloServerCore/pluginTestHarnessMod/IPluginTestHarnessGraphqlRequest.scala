package typings.apolloServerCore.pluginTestHarnessMod

import typings.apolloServerTypes.anon.PickRequesturlmethodheade
import typings.apolloServerTypes.mod.VariableValues
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-types.apollo-server-types.WithRequired<apollo-server-types.apollo-server-types.GraphQLRequest, 'query'> */
trait IPluginTestHarnessGraphqlRequest extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var http: js.UndefOr[PickRequesturlmethodheade] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[VariableValues] = js.undefined
}

object IPluginTestHarnessGraphqlRequest {
  @scala.inline
  def apply(
    extensions: Record[String, _] = null,
    http: PickRequesturlmethodheade = null,
    operationName: String = null,
    query: String = null,
    variables: VariableValues = null
  ): IPluginTestHarnessGraphqlRequest = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginTestHarnessGraphqlRequest]
  }
}

