package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WSHExec object */
@js.native
trait WshExec extends js.Object {
  val ExitCode: Double = js.native
  @JSName("IWshRuntimeLibrary.WshExec_typekey")
  var IWshRuntimeLibraryDotWshExec_typekey: WshExec = js.native
  val ProcessID: Double = js.native
  val Status: WshExecStatus = js.native
  val StdErr: TextStreamWriter = js.native
  val StdIn: TextStreamReader = js.native
  val StdOut: TextStreamWriter = js.native
  def Terminate(): Unit = js.native
}

object WshExec {
  @scala.inline
  def apply(
    ExitCode: Double,
    IWshRuntimeLibraryDotWshExec_typekey: WshExec,
    ProcessID: Double,
    Status: WshExecStatus,
    StdErr: TextStreamWriter,
    StdIn: TextStreamReader,
    StdOut: TextStreamWriter,
    Terminate: () => Unit
  ): WshExec = {
    val __obj = js.Dynamic.literal(ExitCode = ExitCode.asInstanceOf[js.Any], ProcessID = ProcessID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StdErr = StdErr.asInstanceOf[js.Any], StdIn = StdIn.asInstanceOf[js.Any], StdOut = StdOut.asInstanceOf[js.Any], Terminate = js.Any.fromFunction0(Terminate))
    __obj.updateDynamic("IWshRuntimeLibrary.WshExec_typekey")(IWshRuntimeLibraryDotWshExec_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WshExec]
  }
  @scala.inline
  implicit class WshExecOps[Self <: WshExec] (val x: Self) extends AnyVal {
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
    def setExitCode(value: Double): Self = this.set("ExitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIWshRuntimeLibraryDotWshExec_typekey(value: WshExec): Self = this.set("IWshRuntimeLibrary.WshExec_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessID(value: Double): Self = this.set("ProcessID", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: WshExecStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdErr(value: TextStreamWriter): Self = this.set("StdErr", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdIn(value: TextStreamReader): Self = this.set("StdIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdOut(value: TextStreamWriter): Self = this.set("StdOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("Terminate", js.Any.fromFunction0(value))
  }
  
}

