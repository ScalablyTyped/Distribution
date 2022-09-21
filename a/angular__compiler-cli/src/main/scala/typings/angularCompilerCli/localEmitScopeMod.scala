package typings.angularCompilerCli

import typings.angularCompilerCli.astFactoryMod.AstFactory
import typings.angularCompilerCli.emitScopeMod.EmitScope
import typings.angularCompilerCli.translatorMod.Translator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localEmitScopeMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/emit_scopes/local_emit_scope", "LocalEmitScope")
  @js.native
  open class LocalEmitScope[TStatement, TExpression] protected () extends EmitScope[TStatement, TExpression] {
    def this(
      ngImport: TExpression,
      translator: Translator[TStatement, TExpression],
      factory: AstFactory[TStatement, TExpression]
    ) = this()
  }
}
