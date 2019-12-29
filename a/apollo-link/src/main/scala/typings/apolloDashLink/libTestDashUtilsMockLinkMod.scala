package typings.apolloDashLink

import typings.apolloDashLink.libLinkMod.ApolloLink
import typings.apolloDashLink.libTypesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils/mockLink", JSImport.Namespace)
@js.native
object libTestDashUtilsMockLinkMod extends js.Object {
  @js.native
  trait MockLink extends ApolloLink
  
  @js.native
  class default () extends MockLink {
    def this(handleRequest: RequestHandler) = this()
  }
  
}

