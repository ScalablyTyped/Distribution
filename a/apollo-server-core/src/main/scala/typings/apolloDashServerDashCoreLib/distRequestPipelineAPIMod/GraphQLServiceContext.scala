package typings
package apolloDashServerDashCoreLib.distRequestPipelineAPIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceContext extends js.Object {
  var engine: apolloDashServerDashCoreLib.Anon_ServiceID
  var persistedQueries: js.UndefOr[apolloDashServerDashCoreLib.Anon_Cache] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var schemaHash: java.lang.String
}

object GraphQLServiceContext {
  @scala.inline
  def apply(
    engine: apolloDashServerDashCoreLib.Anon_ServiceID,
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    schemaHash: java.lang.String,
    persistedQueries: apolloDashServerDashCoreLib.Anon_Cache = null
  ): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("schema")(schema)
    __obj.updateDynamic("schemaHash")(schemaHash)
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries)
    __obj.asInstanceOf[GraphQLServiceContext]
  }
}

