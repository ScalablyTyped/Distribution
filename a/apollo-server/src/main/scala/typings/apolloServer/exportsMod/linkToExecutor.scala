package typings.apolloServer.exportsMod

import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.graphqlToolsLinks.anon.Context
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "linkToExecutor")
@js.native
object linkToExecutor extends js.Object {
  def apply(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[FetchResult[_, Record[String, _], Record[String, _]]]
  ] = js.native
}

