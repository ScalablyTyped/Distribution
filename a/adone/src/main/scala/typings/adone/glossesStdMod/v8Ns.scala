package typings.adone.glossesStdMod

import typings.node.streamMod.Readable
import typings.node.v8Mod.HeapInfo
import typings.node.v8Mod.HeapSpaceInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "v8")
@js.native
object v8Ns extends js.Object {
  /**
    * Generates a snapshot of the current V8 heap and returns a Readable
    * Stream that may be used to read the JSON serialized representation.
    * This conversation was marked as resolved by joyeecheung
    * This JSON stream format is intended to be used with tools such as
    * Chrome DevTools. The JSON schema is undocumented and specific to the
    * V8 engine, and may change from one version of V8 to the next.
    */
  def getHeapSnapshot(): Readable = js.native
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = js.native
  def getHeapStatistics(): HeapInfo = js.native
  def setFlagsFromString(flags: String): Unit = js.native
  /**
    *
    * @param fileName The file path where the V8 heap snapshot is to be
    * saved. If not specified, a file name with the pattern
    * `'Heap-${yyyymmdd}-${hhmmss}-${pid}-${thread_id}.heapsnapshot'` will be
    * generated, where `{pid}` will be the PID of the Node.js process,
    * `{thread_id}` will be `0` when `writeHeapSnapshot()` is called from
    * the main Node.js thread or the id of a worker thread.
    */
  def writeHeapSnapshot(): String = js.native
  def writeHeapSnapshot(fileName: String): String = js.native
}

