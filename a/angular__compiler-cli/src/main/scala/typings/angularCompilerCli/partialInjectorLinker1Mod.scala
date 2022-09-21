package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompiler.mod.R3DeclareInjectorMetadata
import typings.angularCompiler.mod.R3InjectorMetadata
import typings.angularCompiler.mod.R3PartialDeclaration
import typings.angularCompilerCli.astValueMod.AstObject
import typings.angularCompilerCli.partialLinkerMod.LinkedDefinition
import typings.angularCompilerCli.partialLinkerMod.PartialLinker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialInjectorLinker1Mod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_injector_linker_1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_injector_linker_1", "PartialInjectorLinkerVersion1")
  @js.native
  open class PartialInjectorLinkerVersion1[TExpression] ()
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
  
  inline def toR3InjectorMeta[TExpression](metaObj: AstObject[R3DeclareInjectorMetadata, TExpression]): R3InjectorMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("toR3InjectorMeta")(metaObj.asInstanceOf[js.Any]).asInstanceOf[R3InjectorMetadata]
}
