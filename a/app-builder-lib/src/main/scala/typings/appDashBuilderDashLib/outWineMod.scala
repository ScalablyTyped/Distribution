package typings.appDashBuilderDashLib

import typings.node.childUnderscoreProcessMod.ExecFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/wine", JSImport.Namespace)
@js.native
object outWineMod extends js.Object {
  def execWine(file: String): js.Promise[String] = js.native
  def execWine(file: String, file64: String): js.Promise[String] = js.native
  def execWine(file: String, file64: String, appArgs: js.Array[String]): js.Promise[String] = js.native
  def execWine(file: String, file64: String, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  def execWine(file: String, file64: Null, appArgs: js.Array[String]): js.Promise[String] = js.native
  def execWine(file: String, file64: Null, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  def prepareWindowsExecutableArgs(args: js.Array[String], exePath: String): js.Array[String] = js.native
}

