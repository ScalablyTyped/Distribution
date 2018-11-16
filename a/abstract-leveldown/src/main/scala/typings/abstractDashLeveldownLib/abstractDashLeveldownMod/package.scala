package typings
package abstractDashLeveldownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object abstractDashLeveldownMod {
  type AbstractBatch[K, V] = (PutBatch[K, V]) | (DelBatch[K, V])
  type ErrorCallback = js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  type ErrorKeyValueCallback[K, V] = js.Function3[/* err */ js.UndefOr[stdLib.Error], /* key */ K, /* value */ V, scala.Unit]
  type ErrorValueCallback[V] = js.Function2[/* err */ js.UndefOr[stdLib.Error], /* value */ V, scala.Unit]
}
