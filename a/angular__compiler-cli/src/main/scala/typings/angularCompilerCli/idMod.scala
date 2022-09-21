package typings.angularCompilerCli

import typings.angularCompilerCli.apiApiMod.TemplateId
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/diagnostics/src/id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTemplateId(clazz: DeclarationNode): TemplateId = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplateId")(clazz.asInstanceOf[js.Any]).asInstanceOf[TemplateId]
}
