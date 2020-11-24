package typings.autobahn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Workaround to get intellisense on type unions of 'literals' | string. 
  // See https://github.com/Microsoft/TypeScript/issues/29729
  type CustomTransportType = java.lang.String with typings.autobahn.anon.ZzIGNOREME
  
  type DeferFactory = js.Function0[typings.when.When.Promise[js.Any]]
  
  type OnChallengeHandler = js.Function3[
    /* session */ typings.autobahn.mod.Session, 
    /* method */ java.lang.String, 
    /* extra */ js.Any, 
    java.lang.String | typings.when.When.Promise[java.lang.String]
  ]
  
  type RegisterEndpoint = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any]], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typings.autobahn.mod.IInvocation], 
    scala.Unit
  ]
  
  type SubscribeHandler = js.Function3[
    /* args */ js.UndefOr[js.Array[js.Any] | js.Any], 
    /* kwargs */ js.UndefOr[js.Any], 
    /* details */ js.UndefOr[typings.autobahn.mod.IEvent], 
    scala.Unit
  ]
  
  type TransportType = typings.autobahn.mod.DefaultTransportType | typings.autobahn.mod.CustomTransportType
}
