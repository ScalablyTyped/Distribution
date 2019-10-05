package typings.autobahn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autobahnMod {
  import typings.when.When.Promise

  // Workaround to get intellisense on type unions of 'literals' | string. 
  // See https://github.com/Microsoft/TypeScript/issues/29729
  type CustomTransportType = String with js.Object
  type DeferFactory = js.Function0[Promise[js.Any]]
  type OnChallengeHandler = js.Function3[
    /* session */ Session, 
    /* method */ String, 
    /* extra */ js.Any, 
    String | Promise[String]
  ]
  type RegisterEndpoint = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[IInvocation], 
    Unit
  ]
  type SubscribeHandler = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[IEvent], 
    Unit
  ]
  type TransportType = DefaultTransportType | CustomTransportType
}
