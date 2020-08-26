package typings.apolloServer.mod

import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.graphqlToolsLinks.anon.Context
import typings.std.AsyncIterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "linkToSubscriber")
@js.native
object linkToSubscriber extends js.Object {
  def apply(link: ApolloLink): js.Function1[
    /* hasDocumentVariablesContextInfo */ Context[_, _], 
    js.Promise[
      (AsyncIterator[FetchResult[_, Record[String, _], Record[String, _]], _, js.UndefOr[scala.Nothing]]) with typings.graphqlToolsLinks.anon.AsyncIterator[_]
    ]
  ] = js.native
}

