package typings.apolloServer.exportsMod

import typings.graphql.definitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "FilterTypes")
@js.native
class FilterTypes protected ()
  extends typings.graphqlTools.mod.FilterTypes {
  def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
}

