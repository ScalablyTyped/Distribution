package typings.apolloServerCore.runHttpQueryMod

import typings.apolloServerCore.anon.PickRequesturlmethodheade
import typings.apolloServerCore.graphqlOptionsMod.GraphQLServerOptions
import typings.apolloServerEnv.typescriptUtilityTypesMod.ValueOrPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpQueryRequest extends js.Object {
  var method: String = js.native
  var options: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]]) = js.native
  var query: (Record[String, _]) | (js.Array[Record[String, _]]) = js.native
  var request: PickRequesturlmethodheade = js.native
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
  @scala.inline
  implicit class HttpQueryRequestOps[Self <: HttpQueryRequest] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsFunction1(value: /* repeated */ js.Any => ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(
      value: (GraphQLServerOptions[Record[String, _], _]) | (js.Function1[/* repeated */ js.Any, ValueOrPromise[GraphQLServerOptions[Record[String, _], _]]])
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryVarargs(value: (Record[String, js.Any])*): Self = this.set("query", js.Array(value :_*))
    @scala.inline
    def setQuery(value: (Record[String, _]) | (js.Array[Record[String, _]])): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PickRequesturlmethodheade): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

