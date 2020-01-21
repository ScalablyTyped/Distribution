package typings.apolloServer.mod

import typings.graphqlSubscriptions.withFilterMod.FilterFn
import typings.graphqlSubscriptions.withFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "withFilter")
@js.native
object withFilter extends js.Object {
  def apply(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

