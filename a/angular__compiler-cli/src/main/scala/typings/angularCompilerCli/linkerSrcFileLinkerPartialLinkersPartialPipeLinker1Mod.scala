package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.R3DeclarePipeMetadata
import typings.angularCompiler.mod.R3PartialDeclaration
import typings.angularCompiler.mod.R3PipeMetadata
import typings.angularCompilerCli.linkerSrcAstAstValueMod.AstObject
import typings.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.LinkedDefinition
import typings.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialPipeLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_pipe_linker_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_pipe_linker_1", "PartialPipeLinkerVersion1")
  @js.native
  open class PartialPipeLinkerVersion1[TExpression] ()
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
  
  inline def toR3PipeMeta[TExpression](metaObj: AstObject[R3DeclarePipeMetadata, TExpression]): R3PipeMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("toR3PipeMeta")(metaObj.asInstanceOf[js.Any]).asInstanceOf[R3PipeMetadata]
}
