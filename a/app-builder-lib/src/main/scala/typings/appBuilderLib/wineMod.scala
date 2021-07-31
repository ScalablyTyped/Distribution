package typings.appBuilderLib

import typings.node.childProcessMod.ExecFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wineMod {
  
  @JSImport("app-builder-lib/out/wine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def execWine(file: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: String, appArgs: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: String, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: String, appArgs: Unit, options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: Null, appArgs: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: Null, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: Null, appArgs: Unit, options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: Unit, appArgs: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: Unit, appArgs: js.Array[String], options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def execWine(file: String, file64: Unit, appArgs: Unit, options: ExecFileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execWine")(file.asInstanceOf[js.Any], file64.asInstanceOf[js.Any], appArgs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def prepareWindowsExecutableArgs(args: js.Array[String], exePath: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareWindowsExecutableArgs")(args.asInstanceOf[js.Any], exePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
