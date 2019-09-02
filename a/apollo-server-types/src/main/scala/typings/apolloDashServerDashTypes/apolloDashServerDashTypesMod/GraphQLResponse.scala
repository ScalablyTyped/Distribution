package typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod

import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Response
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.headers
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesStrings.status
import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponse extends js.Object {
  var data: js.UndefOr[(Record[String, _]) | Null] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var http: js.UndefOr[(Pick[Response, headers]) with (Partial[Pick[Mutable[Response], status]])] = js.undefined
}

object GraphQLResponse {
  @scala.inline
  def apply(
    data: Record[String, _] = null,
    errors: js.Array[GraphQLFormattedError[Record[String, _]]] = null,
    extensions: Record[String, _] = null,
    http: (Pick[Response, headers]) with (Partial[Pick[Mutable[Response], status]]) = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (http != null) __obj.updateDynamic("http")(http)
    __obj.asInstanceOf[GraphQLResponse]
  }
}

