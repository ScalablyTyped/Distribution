package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISequentialStream extends js.Object {
  @JSName("MSXML2.ISequentialStream_typekey")
  var MSXML2DotISequentialStream_typekey: ISequentialStream
  def RemoteRead(pv: Double, cb: Double, pcbRead: Double): Unit
  def RemoteWrite(pv: Double, cb: Double, pcbWritten: Double): Unit
}

object ISequentialStream {
  @scala.inline
  def apply(
    MSXML2DotISequentialStream_typekey: ISequentialStream,
    RemoteRead: (Double, Double, Double) => Unit,
    RemoteWrite: (Double, Double, Double) => Unit
  ): ISequentialStream = {
    val __obj = js.Dynamic.literal(RemoteRead = js.Any.fromFunction3(RemoteRead), RemoteWrite = js.Any.fromFunction3(RemoteWrite))
    __obj.updateDynamic("MSXML2.ISequentialStream_typekey")(MSXML2DotISequentialStream_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISequentialStream]
  }
}

