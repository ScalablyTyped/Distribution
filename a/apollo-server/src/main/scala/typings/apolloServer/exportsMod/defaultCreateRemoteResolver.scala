package typings.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "defaultCreateRemoteResolver")
@js.native
object defaultCreateRemoteResolver extends js.Object {
  def apply(fetcher: Fetcher): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

