package typings.apolloServer.exportsMod

import typings.graphql.definitionMod.GraphQLInputType
import typings.graphqlToolsUtils.transformInputValueMod.InputValueTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "transformInputValue")
@js.native
object transformInputValue extends js.Object {
  def apply(`type`: GraphQLInputType, value: js.Any, transformer: InputValueTransformer): js.Any = js.native
}

