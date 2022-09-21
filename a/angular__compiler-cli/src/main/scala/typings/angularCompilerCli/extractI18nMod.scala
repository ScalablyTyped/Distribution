package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractI18nMod {
  
  @JSImport("@angular/compiler-cli/src/extract_i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mainXi18n(args: js.Array[String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mainXi18n")(args.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def mainXi18n(args: js.Array[String], consoleError: js.Function1[/* msg */ String, Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mainXi18n")(args.asInstanceOf[js.Any], consoleError.asInstanceOf[js.Any])).asInstanceOf[Double]
}
