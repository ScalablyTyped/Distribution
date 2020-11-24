package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISequentialStream extends js.Object {
  
  @JSName("MSXML2.ISequentialStream_typekey")
  var MSXML2DotISequentialStream_typekey: ISequentialStream = js.native
  
  def RemoteRead(pv: Double, cb: Double, pcbRead: Double): Unit = js.native
  
  def RemoteWrite(pv: Double, cb: Double, pcbWritten: Double): Unit = js.native
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
  
  @scala.inline
  implicit class ISequentialStreamOps[Self <: ISequentialStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSXML2DotISequentialStream_typekey(value: ISequentialStream): Self = this.set("MSXML2.ISequentialStream_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteRead(value: (Double, Double, Double) => Unit): Self = this.set("RemoteRead", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoteWrite(value: (Double, Double, Double) => Unit): Self = this.set("RemoteWrite", js.Any.fromFunction3(value))
  }
}
