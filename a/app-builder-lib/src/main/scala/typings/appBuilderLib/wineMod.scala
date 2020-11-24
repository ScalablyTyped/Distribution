package typings.appBuilderLib

import typings.node.childProcessMod.ExecFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/wine", JSImport.Namespace)
@js.native
object wineMod extends js.Object {
  
  def execWine(file: String): js.Promise[String] = js.native
  def execWine(
    file: String,
    file64: js.UndefOr[scala.Nothing],
    appArgs: js.UndefOr[scala.Nothing],
    options: ExecFileOptions
  ): js.Promise[String] = js.native
  def execWine(file: String, file64: js.UndefOr[scala.Nothing], appArgs: js.Array[String]): js.Promise[String] = js.native
  def execWine(
    file: String,
    file64: js.UndefOr[scala.Nothing],
    appArgs: js.Array[String],
    options: ExecFileOptions
  ): js.Promise[String] = js.native
  def execWine(file: String, file64: String): js.Promise[String] = js.native
  def execWine(file: String, file64: String, appArgs: js.UndefOr[scala.Nothing], options: ExecFileOptions): js.Promise[String] = js.native
  def execWine(file: String, file64: String, appArgs: js.Array[String]): js.Promise[String] = js.native
  def execWine(file: String, file64: String, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  def execWine(file: String, file64: Null, appArgs: js.UndefOr[scala.Nothing], options: ExecFileOptions): js.Promise[String] = js.native
  def execWine(file: String, file64: Null, appArgs: js.Array[String]): js.Promise[String] = js.native
  def execWine(file: String, file64: Null, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = js.native
  
  def prepareWindowsExecutableArgs(args: js.Array[String], exePath: String): js.Array[String] = js.native
}
