package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outVmVmMod.VmManager
import typings.builderDashUtil.builderDashUtilMod.DebugLogger
import typings.builderDashUtil.builderDashUtilMod.ExtraSpawnOptions
import typings.node.childUnderscoreProcessMod.ExecFileOptions
import typings.node.childUnderscoreProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/vm/vm", JSImport.Namespace)
@js.native
object outVmVmMod extends js.Object {
  @js.native
  class VmManager () extends js.Object {
    val pathSep: String = js.native
    def exec(file: String, args: js.Array[String]): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
    def spawn(file: String, args: js.Array[String]): js.Promise[_] = js.native
    def spawn(file: String, args: js.Array[String], options: SpawnOptions): js.Promise[_] = js.native
    def spawn(file: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
    def toVmFile(file: String): String = js.native
  }
  
  def getWindowsVm(debugLogger: DebugLogger): js.Promise[VmManager] = js.native
}

