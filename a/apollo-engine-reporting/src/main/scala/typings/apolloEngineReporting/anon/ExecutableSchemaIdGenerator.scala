package typings.apolloEngineReporting.anon

import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutableSchemaIdGenerator extends js.Object {
  var schemaReport: Boolean = js.native
  def executableSchemaIdGenerator(schema: String): String = js.native
  def executableSchemaIdGenerator(schema: GraphQLSchema): String = js.native
  def startSchemaReporting(hasExecutableSchemaExecutableSchemaId: ExecutableSchemaId): Unit = js.native
}

