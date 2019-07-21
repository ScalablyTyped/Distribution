package typings
package apolloDashServerDashTypesLib.apolloDashServerDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceContext extends js.Object {
  var engine: apolloDashServerDashTypesLib.Anon_ApiKeyHash
  var persistedQueries: js.UndefOr[apolloDashServerDashTypesLib.Anon_Cache] = js.undefined
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  var schemaHash: java.lang.String
}

object GraphQLServiceContext {
  @scala.inline
  def apply(
    engine: apolloDashServerDashTypesLib.Anon_ApiKeyHash,
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    schemaHash: java.lang.String,
    persistedQueries: apolloDashServerDashTypesLib.Anon_Cache = null
  ): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal(engine = engine, schema = schema, schemaHash = schemaHash)
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries)
    __obj.asInstanceOf[GraphQLServiceContext]
  }
}

