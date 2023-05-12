package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.anon.DirectiveSymbolBaseisHost
  - typings.angularCompilerCli.anon.DirectiveSymbolBaseisHostExposedInputs
*/
trait DirectiveSymbol
  extends StObject
     with Symbol
object DirectiveSymbol {
  
  inline def DirectiveSymbolBaseisHost(
    isComponent: Boolean,
    isInScope: Boolean,
    isStructural: Boolean,
    kind: Directive,
    ref: Reference[ClassDeclarationDeclarati],
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): typings.angularCompilerCli.anon.DirectiveSymbolBaseisHost = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isHostDirective = false, isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], ngModule = null, selector = null)
    __obj.asInstanceOf[typings.angularCompilerCli.anon.DirectiveSymbolBaseisHost]
  }
  
  inline def DirectiveSymbolBaseisHostExposedInputs(
    isComponent: Boolean,
    isInScope: Boolean,
    isStructural: Boolean,
    kind: Directive,
    ref: Reference[ClassDeclarationDeclarati],
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): typings.angularCompilerCli.anon.DirectiveSymbolBaseisHostExposedInputs = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isHostDirective = true, isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], exposedInputs = null, exposedOutputs = null, ngModule = null, selector = null)
    __obj.asInstanceOf[typings.angularCompilerCli.anon.DirectiveSymbolBaseisHostExposedInputs]
  }
}
