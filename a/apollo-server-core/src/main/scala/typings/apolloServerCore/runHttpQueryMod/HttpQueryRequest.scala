package typings.apolloServerCore.runHttpQueryMod

import typings.apolloServerCore.PickRequesturlmethodheade
import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerEnv.typescriptUtilityTypesMod.ValueOrPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryRequest extends js.Object {
  var method: String
  var options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]])
  var query: (Record[String, _]) | (js.Array[Record[String, _]])
  var request: PickRequesturlmethodheade
}

object HttpQueryRequest {
  @scala.inline
  def apply(
    method: String,
    options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]]),
    query: (Record[String, _]) | (js.Array[Record[String, _]]),
    request: PickRequesturlmethodheade
  ): HttpQueryRequest = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpQueryRequest]
  }
}

