package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "v8")
@js.native
object v8Ns extends js.Object {
  def getHeapSpaceStatistics(): js.Array[nodeLib.v8Mod.HeapSpaceInfo] = js.native
  def getHeapStatistics(): nodeLib.v8Mod.HeapInfo = js.native
  def setFlagsFromString(flags: java.lang.String): scala.Unit = js.native
}

