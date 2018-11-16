package typings
package apolloDashLinkLib.libLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/link", JSImport.Namespace)
@js.native
object libLinkModMembers extends js.Object {
  val concat: js.Function2[
    /* first */ ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler, 
    /* second */ ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler, 
    ApolloLink
  ] = js.native
  val empty: js.Function0[ApolloLink] = js.native
  val from: js.Function1[/* links */ js.Array[ApolloLink], ApolloLink] = js.native
  val split: js.Function3[
    /* test */ js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean], 
    /* left */ ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler, 
    /* right */ js.UndefOr[ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler], 
    ApolloLink
  ] = js.native
  def execute(link: ApolloLink, operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
}

