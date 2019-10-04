package typings.anyproxy.anyproxyMod

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anyproxy", "ProxyRecorder")
@js.native
// TypeScript Version: 2.2
class ProxyRecorder () extends EventEmitter {
  def this(config: js.Object) = this()
  def appendRecord(info: RecorderInfo): Double = js.native
  def clear(): Unit = js.native
  def emitUpdate(id: Double): Unit = js.native
  def emitUpdate(id: Double, info: RecorderInfo): Unit = js.native
  def emitUpdateLatestWsMessage(id: Double, message: js.Any): Unit = js.native
  def getBody(id: Double): Unit = js.native
  def getBody(id: Double, cb: js.Function2[/* err */ Error, /* body */ Buffer, Unit]): Unit = js.native
  def getCacheFile(fileName: String, cb: js.Function2[/* err */ Error, /* filePath */ String, Unit]): Unit = js.native
  def getDecodedBody(id: Double): Unit = js.native
  def getDecodedBody(id: Double, cb: js.Function2[/* err */ Error, /* content */ js.Any, Unit]): Unit = js.native
  def getDecodedWsMessage(id: Double): Unit = js.native
  def getDecodedWsMessage(id: Double, cb: js.Function2[/* err */ Error, /* content */ js.Any, Unit]): Unit = js.native
  def getRecords(
    idStart: Double,
    limit: Double,
    cb: js.Function2[/* err */ Error, /* records */ js.Array[RecorderInfo], Unit]
  ): Unit = js.native
  def getSingleRecord(id: Double, cb: js.Function2[/* err */ Error, /* record */ RecorderInfo, Unit]): Unit = js.native
  def getSummaryList(cb: js.Function2[/* err */ Error, /* records */ js.Array[RecorderInfo], Unit]): Unit = js.native
  // TypeScript Version: 2.2
  def updateExtInfo(id: Double, extInfo: js.Object): Unit = js.native
  def updateRecord(id: Double, info: RecorderInfo): Unit = js.native
  def updateRecordBody(id: Double, info: RecorderInfo): Unit = js.native
  def updateRecordWsMessage(id: Double, message: js.Any): Unit = js.native
}

