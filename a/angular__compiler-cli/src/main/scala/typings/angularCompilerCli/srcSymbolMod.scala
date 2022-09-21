package typings.angularCompilerCli

import typings.angularCompilerCli.metadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.ngtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.semanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.typeParametersMod.SemanticTypeParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSymbolMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive/src/symbol", "DirectiveSymbol")
  @js.native
  open class DirectiveSymbol protected () extends SemanticSymbol {
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
    
    var baseClass: SemanticSymbol | Null = js.native
    
    val exportAs: js.Array[String] | Null = js.native
    
    val inputs: ClassPropertyMapping = js.native
    
    def isPublicApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    def isTypeCheckApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    val outputs: ClassPropertyMapping = js.native
    
    val selector: String | Null = js.native
    
    val typeCheckMeta: DirectiveTypeCheckMeta = js.native
    
    val typeParameters: js.Array[SemanticTypeParameter] | Null = js.native
  }
}
