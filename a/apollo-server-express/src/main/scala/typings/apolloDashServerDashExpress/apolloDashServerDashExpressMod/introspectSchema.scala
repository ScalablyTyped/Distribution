package typings.apolloDashServerDashExpress.apolloDashServerDashExpressMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphqlDashTools.distStitchingMakeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "introspectSchema")
@js.native
object introspectSchema extends js.Object {
  def apply(fetcher: ApolloLink): js.Promise[GraphQLSchema] = js.native
  def apply(fetcher: ApolloLink, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
  def apply(fetcher: Fetcher): js.Promise[GraphQLSchema] = js.native
  def apply(fetcher: Fetcher, linkContext: StringDictionary[js.Any]): js.Promise[GraphQLSchema] = js.native
}

