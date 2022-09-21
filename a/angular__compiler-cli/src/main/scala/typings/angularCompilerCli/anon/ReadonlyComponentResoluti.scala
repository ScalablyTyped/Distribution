package typings.angularCompilerCli.anon

import typings.angularCompiler.mod.DeclarationListEmitMode
import typings.angularCompiler.mod.R3TemplateDependencyMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/annotations/component/src/metadata.ComponentResolutionData> */
trait ReadonlyComponentResoluti extends StObject {
  
  val declarationListEmitMode: DeclarationListEmitMode
  
  val declarations: js.Array[R3TemplateDependencyMetadata]
}
object ReadonlyComponentResoluti {
  
  inline def apply(
    declarationListEmitMode: DeclarationListEmitMode,
    declarations: js.Array[R3TemplateDependencyMetadata]
  ): ReadonlyComponentResoluti = {
    val __obj = js.Dynamic.literal(declarationListEmitMode = declarationListEmitMode.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyComponentResoluti]
  }
  
  extension [Self <: ReadonlyComponentResoluti](x: Self) {
    
    inline def setDeclarationListEmitMode(value: DeclarationListEmitMode): Self = StObject.set(x, "declarationListEmitMode", value.asInstanceOf[js.Any])
    
    inline def setDeclarations(value: js.Array[R3TemplateDependencyMetadata]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: R3TemplateDependencyMetadata*): Self = StObject.set(x, "declarations", js.Array(value*))
  }
}
