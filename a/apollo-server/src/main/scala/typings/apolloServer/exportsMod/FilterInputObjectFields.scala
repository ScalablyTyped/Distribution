package typings.apolloServer.exportsMod

import typings.graphqlToolsUtils.interfacesMod.InputFieldFilter
import typings.graphqlToolsWrap.typesMod.InputObjectNodeTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "FilterInputObjectFields")
@js.native
class FilterInputObjectFields protected ()
  extends typings.graphqlTools.mod.FilterInputObjectFields {
  def this(filter: InputFieldFilter) = this()
  def this(filter: InputFieldFilter, inputObjectNodeTransformer: InputObjectNodeTransformer) = this()
}

