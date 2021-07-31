package typings.activexMsxml2.MSXML2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISequentialStream extends StObject {
  
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
  
  @scala.inline
  implicit class ISequentialStreamMutableBuilder[Self <: ISequentialStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSXML2DotISequentialStream_typekey(value: ISequentialStream): Self = StObject.set(x, "MSXML2.ISequentialStream_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteRead(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "RemoteRead", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoteWrite(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "RemoteWrite", js.Any.fromFunction3(value))
  }
}
