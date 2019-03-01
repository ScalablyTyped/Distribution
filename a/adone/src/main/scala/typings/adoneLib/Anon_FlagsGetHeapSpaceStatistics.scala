package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlagsGetHeapSpaceStatistics extends js.Object {
  def getHeapSpaceStatistics(): js.Array[nodeLib.v8Mod.HeapSpaceInfo]
  def getHeapStatistics(): nodeLib.v8Mod.HeapInfo
  def setFlagsFromString(flags: java.lang.String): scala.Unit
}

object Anon_FlagsGetHeapSpaceStatistics {
  @scala.inline
  def apply(
    getHeapSpaceStatistics: js.Function0[js.Array[nodeLib.v8Mod.HeapSpaceInfo]],
    getHeapStatistics: js.Function0[nodeLib.v8Mod.HeapInfo],
    setFlagsFromString: js.Function1[java.lang.String, scala.Unit]
  ): Anon_FlagsGetHeapSpaceStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHeapSpaceStatistics")(getHeapSpaceStatistics)
    __obj.updateDynamic("getHeapStatistics")(getHeapStatistics)
    __obj.updateDynamic("setFlagsFromString")(setFlagsFromString)
    __obj.asInstanceOf[Anon_FlagsGetHeapSpaceStatistics]
  }
}

