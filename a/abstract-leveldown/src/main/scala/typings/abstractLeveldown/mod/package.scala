package typings.abstractLeveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbstractOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  
  type ErrorKeyValueCallback[K, V] = js.Function3[/* err */ js.UndefOr[typings.std.Error], /* key */ K, /* value */ V, scala.Unit]
  
  type ErrorValueCallback[V] = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* value */ V, scala.Unit]
}
