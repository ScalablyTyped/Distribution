package typings.angularCompilerCli

import typings.angularCompilerCli.directiveMod.DirectiveSymbol
import typings.angularCompilerCli.metadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.ngtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.semanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.semanticGraphSrcApiMod.SemanticReference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.typeParametersMod.SemanticTypeParameter
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbolMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/symbol", "ComponentSymbol")
  @js.native
  open class ComponentSymbol protected () extends DirectiveSymbol {
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: String,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclaration[DeclarationNode],
      selector: Null,
      inputs: ClassPropertyMapping,
      outputs: ClassPropertyMapping,
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    
    @JSName("isEmitAffected")
    def isEmitAffected_MComponentSymbol(previousSymbol: SemanticSymbol, publicApiAffected: Set[SemanticSymbol]): Boolean = js.native
    
    var isRemotelyScoped: Boolean = js.native
    
    @JSName("isTypeCheckBlockAffected")
    def isTypeCheckBlockAffected_MComponentSymbol(previousSymbol: SemanticSymbol, typeCheckApiAffected: Set[SemanticSymbol]): Boolean = js.native
    
    var usedDirectives: js.Array[SemanticReference] = js.native
    
    var usedPipes: js.Array[SemanticReference] = js.native
  }
}
