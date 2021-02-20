package typings.appBuilderLib

import typings.builderUtil.mod.DebugLogger
import typings.builderUtil.mod.ExtraSpawnOptions
import typings.node.childProcessMod.ExecFileOptions
import typings.node.childProcessMod.SpawnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vmMod {
  
  @JSImport("app-builder-lib/out/vm/vm", "VmManager")
  @js.native
  class VmManager () extends StObject {
    
    def exec(file: String, args: js.Array[String]): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: js.UndefOr[scala.Nothing], isLogOutIfDebug: Boolean): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
    def exec(file: String, args: js.Array[String], options: ExecFileOptions, isLogOutIfDebug: Boolean): js.Promise[String] = js.native
    
    def pathSep: String = js.native
    
    def spawn(file: String, args: js.Array[String]): js.Promise[_] = js.native
    def spawn(
      file: String,
      args: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      extraOptions: ExtraSpawnOptions
    ): js.Promise[_] = js.native
    def spawn(file: String, args: js.Array[String], options: SpawnOptions): js.Promise[_] = js.native
    def spawn(file: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
    
    def toVmFile(file: String): String = js.native
  }
  
  @JSImport("app-builder-lib/out/vm/vm", "getWindowsVm")
  @js.native
  def getWindowsVm(debugLogger: DebugLogger): js.Promise[VmManager] = js.native
}
