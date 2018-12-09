package typings
package appDashBuilderDashLibLib.outVmVmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/vm/vm", "VmManager")
@js.native
class VmManager () extends js.Object {
  val pathSep: java.lang.String = js.native
  def exec(file: java.lang.String, args: js.Array[java.lang.String]): js.Promise[java.lang.String] = js.native
  def exec(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): js.Promise[java.lang.String] = js.native
  def exec(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    isLogOutIfDebug: scala.Boolean
  ): js.Promise[java.lang.String] = js.native
  def spawn(file: java.lang.String, args: js.Array[java.lang.String]): js.Promise[_] = js.native
  def spawn(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): js.Promise[_] = js.native
  def spawn(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions,
    extraOptions: builderDashUtilLib.builderDashUtilMod.ExtraSpawnOptions
  ): js.Promise[_] = js.native
  def toVmFile(file: java.lang.String): java.lang.String = js.native
}

