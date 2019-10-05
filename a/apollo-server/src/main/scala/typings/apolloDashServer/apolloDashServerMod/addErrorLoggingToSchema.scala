package typings.apolloDashServer.apolloDashServerMod

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distInterfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "addErrorLoggingToSchema")
@js.native
object addErrorLoggingToSchema extends js.Object {
  def apply(schema: GraphQLSchema, logger: ILogger): Unit = js.native
}

