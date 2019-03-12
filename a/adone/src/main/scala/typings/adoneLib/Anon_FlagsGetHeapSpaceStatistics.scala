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
    getHeapSpaceStatistics: () => js.Array[nodeLib.v8Mod.HeapSpaceInfo],
    getHeapStatistics: () => nodeLib.v8Mod.HeapInfo,
    setFlagsFromString: java.lang.String => scala.Unit
  ): Anon_FlagsGetHeapSpaceStatistics = {
    val __obj = js.Dynamic.literal(getHeapSpaceStatistics = js.Any.fromFunction0(getHeapSpaceStatistics), getHeapStatistics = js.Any.fromFunction0(getHeapStatistics), setFlagsFromString = js.Any.fromFunction1(setFlagsFromString))
  
    __obj.asInstanceOf[Anon_FlagsGetHeapSpaceStatistics]
  }
}

