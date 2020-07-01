package typings.apolloServerTypes.mod

import typings.apolloServerTypes.anon.ApiKeyHash
import typings.apolloServerTypes.anon.Cache
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLServiceContext extends js.Object {
  var engine: ApiKeyHash
  var logger: Logger
  var persistedQueries: js.UndefOr[Cache] = js.undefined
  var schema: GraphQLSchema
  var schemaHash: SchemaHash
}

object GraphQLServiceContext {
  @scala.inline
  def apply(
    engine: ApiKeyHash,
    logger: Logger,
    schema: GraphQLSchema,
    schemaHash: SchemaHash,
    persistedQueries: Cache = null
  ): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any])
    if (persistedQueries != null) __obj.updateDynamic("persistedQueries")(persistedQueries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceContext]
  }
}

