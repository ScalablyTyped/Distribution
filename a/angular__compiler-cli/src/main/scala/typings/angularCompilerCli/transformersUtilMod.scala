package typings.angularCompilerCli

import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformersUtilMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/transformers/util", "GENERATED_FILES")
  @js.native
  val GENERATED_FILES: js.RegExp = js.native
  
  inline def createMessageDiagnostic(messageText: String): Diagnostic = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessageDiagnostic")(messageText.asInstanceOf[js.Any]).asInstanceOf[Diagnostic]
  
  inline def error(msg: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def stripComment(commentText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripComment")(commentText.asInstanceOf[js.Any]).asInstanceOf[String]
}
