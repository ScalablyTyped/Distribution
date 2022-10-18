package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscDiagnosticsSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/diagnostics/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngErrorCode(code: ErrorCode): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ngErrorCode")(code.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def replaceTsWithNgInErrors(errors: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceTsWithNgInErrors")(errors.asInstanceOf[js.Any]).asInstanceOf[String]
}
