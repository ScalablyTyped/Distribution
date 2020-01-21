package typings.apolloServerTypes.mod

import typings.apolloServerTypes.AnonApiKeyHash
import typings.apolloServerTypes.AnonCache
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceContext extends js.Object {
  var engine: AnonApiKeyHash
  var persistedQueries: js.UndefOr[AnonCache] = js.undefined
  var schema: GraphQLSchema
  var schemaHash: String
}

object GraphQLServiceContext {
  @scala.inline
  def apply(
    engine: AnonApiKeyHash,
    schema: GraphQLSchema,
    schemaHash: String,
    persistedQueries: AnonCache = null
  ): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceContext]
  }
}

