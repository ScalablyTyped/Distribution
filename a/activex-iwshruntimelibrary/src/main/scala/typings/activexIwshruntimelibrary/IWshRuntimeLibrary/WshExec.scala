package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** WSHExec object */
@JSGlobal("IWshRuntimeLibrary.WshExec")
@js.native
class WshExec protected () extends js.Object {
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

