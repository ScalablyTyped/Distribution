package typings.abstractDashLeveldown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object abstractDashLeveldownMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type AbstractOptions = StringDictionary[js.Any]
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type ErrorKeyValueCallback[K, V] = js.Function3[/* err */ js.UndefOr[Error], /* key */ K, /* value */ V, Unit]
  type ErrorValueCallback[V] = js.Function2[/* err */ js.UndefOr[Error], /* value */ V, Unit]
}
