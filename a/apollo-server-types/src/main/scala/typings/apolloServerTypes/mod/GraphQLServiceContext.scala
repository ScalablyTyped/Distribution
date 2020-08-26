package typings.apolloServerTypes.mod

import typings.apolloServerTypes.anon.ApiKeyHash
import typings.apolloServerTypes.anon.Cache
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceContext extends js.Object {
  var engine: ApiKeyHash = js.native
  var logger: Logger = js.native
  var persistedQueries: js.UndefOr[Cache] = js.native
  var schema: GraphQLSchema = js.native
  var schemaHash: SchemaHash = js.native
}

object GraphQLServiceContext {
  @scala.inline
  def apply(engine: ApiKeyHash, logger: Logger, schema: GraphQLSchema, schemaHash: SchemaHash): GraphQLServiceContext = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLServiceContext]
  }
  @scala.inline
  implicit class GraphQLServiceContextOps[Self <: GraphQLServiceContext] (val x: Self) extends AnyVal {
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
    def setEngine(value: ApiKeyHash): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaHash(value: SchemaHash): Self = this.set("schemaHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistedQueries(value: Cache): Self = this.set("persistedQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueries: Self = this.set("persistedQueries", js.undefined)
  }
  
}

