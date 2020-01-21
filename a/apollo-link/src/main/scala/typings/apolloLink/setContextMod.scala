package typings.apolloLink

import typings.apolloLink.linkMod.ApolloLink
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils/setContext", JSImport.Namespace)
@js.native
object setContextMod extends js.Object {
  @js.native
  trait SetContextLink extends ApolloLink {
    var setContext: js.Any = js.native
  }
  
  @js.native
  class default () extends SetContextLink {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
  
}

