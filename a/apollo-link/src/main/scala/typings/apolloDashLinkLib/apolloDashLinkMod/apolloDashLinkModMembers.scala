package typings
package apolloDashLinkLib.apolloDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", JSImport.Namespace)
@js.native
object apolloDashLinkModMembers extends js.Object {
  val Observable: zenDashObservableDashTsLib.Anon_Of = js.native
  val concat: js.Function2[
    /* first */ apolloDashLinkLib.libLinkMod.ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler, 
    /* second */ apolloDashLinkLib.libLinkMod.ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler, 
    apolloDashLinkLib.libLinkMod.ApolloLink
  ] = js.native
  val empty: js.Function0[apolloDashLinkLib.libLinkMod.ApolloLink] = js.native
  val from: js.Function1[
    /* links */ js.Array[apolloDashLinkLib.libLinkMod.ApolloLink], 
    apolloDashLinkLib.libLinkMod.ApolloLink
  ] = js.native
  val makePromise: js.Function1[
    /* observable */ zenDashObservableDashTsLib.libZenObservableMod.Observable[js.Any], 
    stdLib.Promise[js.Any]
  ] = js.native
  val split: js.Function3[
    /* test */ js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean], 
    /* left */ apolloDashLinkLib.libLinkMod.ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler, 
    /* right */ js.UndefOr[
      apolloDashLinkLib.libLinkMod.ApolloLink | apolloDashLinkLib.libTypesMod.RequestHandler
    ], 
    apolloDashLinkLib.libLinkMod.ApolloLink
  ] = js.native
  def createOperation(starting: js.Any, operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): apolloDashLinkLib.libTypesMod.Operation = js.native
  def execute(
    link: apolloDashLinkLib.libLinkMod.ApolloLink,
    operation: apolloDashLinkLib.libTypesMod.GraphQLRequest
  ): zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
  ] = js.native
  def fromError[T](errorValue: js.Any): zenDashObservableDashTsLib.libZenObservableMod.Observable[T] = js.native
  def fromPromise[T](promise: stdLib.Promise[T]): zenDashObservableDashTsLib.libZenObservableMod.Observable[T] = js.native
  def toPromise[R](observable: zenDashObservableDashTsLib.libZenObservableMod.Observable[R]): stdLib.Promise[R] = js.native
}

