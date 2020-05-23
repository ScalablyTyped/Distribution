package typings.apolloServerTypes.mod

import typings.apolloServerTypes.anon.PickResponseheadersPartia
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResponse extends js.Object {
  var data: js.UndefOr[(Record[String, _]) | Null] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var extensions: js.UndefOr[Record[String, _]] = js.undefined
  var http: js.UndefOr[PickResponseheadersPartia] = js.undefined
}

object GraphQLResponse {
  @scala.inline
  def apply(
    data: js.UndefOr[Null | (Record[String, _])] = js.undefined,
    errors: js.Array[GraphQLFormattedError[Record[String, _]]] = null,
    extensions: Record[String, _] = null,
    http: PickResponseheadersPartia = null
  ): GraphQLResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResponse]
  }
}

