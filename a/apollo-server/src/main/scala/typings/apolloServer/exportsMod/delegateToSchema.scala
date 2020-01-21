package typings.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.interfacesMod.IDelegateToSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "delegateToSchema")
@js.native
object delegateToSchema extends js.Object {
  def apply(options: GraphQLSchema, args: js.Any*): js.Promise[_] = js.native
  def apply(options: IDelegateToSchemaOptions[StringDictionary[_]], args: js.Any*): js.Promise[_] = js.native
}

