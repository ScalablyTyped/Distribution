package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclaratiFlags
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcNgtscIncrementalSemanticGraphSrcTypeParametersMod.SemanticTypeParameter
import typings.angularCompilerCli.srcNgtscMetadataMod.ClassPropertyMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.DirectiveTypeCheckMeta
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.InputMapping
import typings.angularCompilerCli.srcNgtscMetadataSrcPropertyMappingMod.InputOrOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsDirectiveSrcSymbolMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/directive/src/symbol", "DirectiveSymbol")
  @js.native
  open class DirectiveSymbol protected () extends SemanticSymbol {
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: String,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: js.Array[String],
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    def this(
      decl: ClassDeclarationDeclaratiFlags,
      selector: Null,
      inputs: ClassPropertyMapping[InputMapping],
      outputs: ClassPropertyMapping[InputOrOutput],
      exportAs: Null,
      typeCheckMeta: DirectiveTypeCheckMeta,
      typeParameters: js.Array[SemanticTypeParameter]
    ) = this()
    
    var baseClass: SemanticSymbol | Null = js.native
    
    val exportAs: js.Array[String] | Null = js.native
    
    val inputs: ClassPropertyMapping[InputMapping] = js.native
    
    def isPublicApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    def isTypeCheckApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    val outputs: ClassPropertyMapping[InputOrOutput] = js.native
    
    val selector: String | Null = js.native
    
    val typeCheckMeta: DirectiveTypeCheckMeta = js.native
    
    val typeParameters: js.Array[SemanticTypeParameter] | Null = js.native
  }
}
