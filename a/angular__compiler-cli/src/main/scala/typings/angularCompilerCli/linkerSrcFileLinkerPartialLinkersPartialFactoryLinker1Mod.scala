package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.R3DeclareFactoryMetadata
import typings.angularCompiler.mod.R3FactoryMetadata
import typings.angularCompiler.mod.R3PartialDeclaration
import typings.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typings.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typings.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialFactoryLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_factory_linker_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_factory_linker_1", "PartialFactoryLinkerVersion1")
  @js.native
  open class PartialFactoryLinkerVersion1[TExpression] ()
    extends StObject
       with PartialLinker[TExpression] {
    
    /**
      * Link the partial declaration `metaObj` information to generate a full definition expression.
      *
      * @param metaObj An object that fits one of the `R3DeclareDirectiveMetadata` or
      *     `R3DeclareComponentMetadata` interfaces.
      */
    /* CompleteClass */
    override def linkPartialDeclaration(constantPool: ConstantPool, metaObj: AstObject[R3PartialDeclaration, TExpression]): LinkedDefinition = js.native
  }
  
  inline def toR3FactoryMeta[TExpression](metaObj: AstObject[R3DeclareFactoryMetadata, TExpression]): R3FactoryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("toR3FactoryMeta")(metaObj.asInstanceOf[js.Any]).asInstanceOf[R3FactoryMetadata]
}
