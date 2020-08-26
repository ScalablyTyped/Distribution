package typings.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "addSchemaLevelResolver")
@js.native
object addSchemaLevelResolver extends js.Object {
  def apply(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): GraphQLSchema = js.native
}

