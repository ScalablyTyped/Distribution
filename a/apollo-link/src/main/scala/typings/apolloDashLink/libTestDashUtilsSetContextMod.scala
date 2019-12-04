package typings.apolloDashLink

import typings.apolloDashLink.libLinkMod.ApolloLink
import typings.apolloDashLink.libTestDashUtilsSetContextMod.SetContextLink
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils/setContext", JSImport.Namespace)
@js.native
object libTestDashUtilsSetContextMod extends js.Object {
  @js.native
  trait SetContextLink extends ApolloLink {
    var setContext: js.Any = js.native
  }
  
  @js.native
  class default () extends SetContextLink {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
  
}

