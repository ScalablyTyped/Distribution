package typings.apolloDashServerDashCore.distRunHttpQueryMod

import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.headers
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.method
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.url
import typings.apolloDashServerDashCore.distGraphqlOptionsMod.GraphQLServerOptions
import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typings.apolloDashServerDashEnv.distTypescriptDashUtilityDashTypesMod.ValueOrPromise
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryRequest extends js.Object {
  var method: String
  var options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]])
  var query: (Record[String, _]) | (js.Array[Record[String, _]])
  var request: Pick[Request, url | method | headers]
}

object HttpQueryRequest {
  @scala.inline
  def apply(
    method: String,
    options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]]),
    query: (Record[String, _]) | (js.Array[Record[String, _]]),
    request: Pick[Request, url | method | headers]
  ): HttpQueryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpQueryRequest]
  }
}

