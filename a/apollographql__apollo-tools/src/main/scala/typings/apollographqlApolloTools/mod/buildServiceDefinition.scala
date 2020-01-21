package typings.apollographqlApolloTools.mod

import typings.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLSchemaModule
import typings.apollographqlApolloTools.buildServiceDefinitionMod.GraphQLServiceDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollographql/apollo-tools", "buildServiceDefinition")
@js.native
object buildServiceDefinition extends js.Object {
  def apply(modules: js.Array[GraphQLSchemaModule]): GraphQLServiceDefinition = js.native
}

