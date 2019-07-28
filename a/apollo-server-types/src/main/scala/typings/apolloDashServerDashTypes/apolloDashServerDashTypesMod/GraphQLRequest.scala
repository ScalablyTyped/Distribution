package typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod

import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.headers
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.method
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.url
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequest extends js.Object {
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var http: js.UndefOr[Pick[Request, url | method | headers]] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[VariableValues] = js.undefined
}

object GraphQLRequest {
  @scala.inline
  def apply(
    extensions: Record[String, _] = null,
    http: Pick[Request, url | method | headers] = null,
    operationName: String = null,
    query: String = null,
    variables: VariableValues = null
  ): GraphQLRequest = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (http != null) __obj.updateDynamic("http")(http)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLRequest]
  }
}

