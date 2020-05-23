package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WSHExec object */
trait WshExec extends js.Object {
  val ExitCode: Double
  @JSName("IWshRuntimeLibrary.WshExec_typekey")
  var IWshRuntimeLibraryDotWshExec_typekey: WshExec
  val ProcessID: Double
  val Status: WshExecStatus
  val StdErr: TextStreamWriter
  val StdIn: TextStreamReader
  val StdOut: TextStreamWriter
  def Terminate(): Unit
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
}

