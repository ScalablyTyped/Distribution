package typings
package apolloDashServerDashCoreLib.distGraphqlOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/graphqlOptions", JSImport.Namespace)
@js.native
object distGraphqlOptionsModMembers extends js.Object {
  def resolveGraphqlOptions(options: GraphQLServerOptions[stdLib.Record[java.lang.String, _], _], args: js.Any*): js.Promise[GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]] = js.native
  def resolveGraphqlOptions(
    options: js.Function1[
      /* repeated */js.Any, 
      (js.Promise[GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]]) | (GraphQLServerOptions[stdLib.Record[java.lang.String, _], _])
    ],
    args: js.Any*
  ): js.Promise[GraphQLServerOptions[stdLib.Record[java.lang.String, _], _]] = js.native
}

