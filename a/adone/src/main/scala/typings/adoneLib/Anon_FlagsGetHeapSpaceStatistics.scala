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

