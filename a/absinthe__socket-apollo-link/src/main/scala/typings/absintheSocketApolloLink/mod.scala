package typings.absintheSocketApolloLink

import org.scalablytyped.runtime.StringDictionary
import typings.absintheSocket.mod.AbsintheSocket
import typings.absintheSocket.mod.Notifier
import typings.apolloLink.typesMod.FetchResult
import typings.apolloLink.typesMod.NextLink
import typings.apolloLink.typesMod.Operation
import typings.std.Error
import typings.std.Record
import typings.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@absinthe/socket-apollo-link", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait AbsintheSocketLink extends js.Object {
    def request(operation: Operation): (Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]) | Null = js.native
    def request(operation: Operation, forward: NextLink): (Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]) | Null = js.native
  }
  
  def createAbsintheSocketLink(absintheSocket: AbsintheSocket[js.Object]): AbsintheSocketLink = js.native
  def createAbsintheSocketLink(
    absintheSocket: AbsintheSocket[js.Object],
    onError: js.UndefOr[scala.Nothing],
    onStart: js.Function1[/* notifier */ Notifier[js.Object, js.Object], _]
  ): AbsintheSocketLink = js.native
  def createAbsintheSocketLink(absintheSocket: AbsintheSocket[js.Object], onError: js.Function1[/* error */ Error, _]): AbsintheSocketLink = js.native
  def createAbsintheSocketLink(
    absintheSocket: AbsintheSocket[js.Object],
    onError: js.Function1[/* error */ Error, _],
    onStart: js.Function1[/* notifier */ Notifier[js.Object, js.Object], _]
  ): AbsintheSocketLink = js.native
}

