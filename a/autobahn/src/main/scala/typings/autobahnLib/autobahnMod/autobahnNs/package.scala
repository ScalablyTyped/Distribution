package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object autobahnNs {
  // Workaround to get intellisense on type unions of 'literals' | string. 
  // See https://github.com/Microsoft/TypeScript/issues/29729
  type CustomTransportType = java.lang.String with autobahnLib.Anon_ZzIGNOREME
  type DeferFactory = js.Function0[whenLib.WhenNs.Promise[js.Any]]
  type OnChallengeHandler = js.Function3[
    /* session */ Session, 
    /* method */ java.lang.String, 
    /* extra */ js.Any, 
    java.lang.String | whenLib.WhenNs.Promise[java.lang.String]
  ]
  type RegisterEndpoint = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[IInvocation], 
    scala.Unit
  ]
  type SubscribeHandler = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[IEvent], 
    scala.Unit
  ]
  type TransportType = DefaultTransportType | CustomTransportType
}
