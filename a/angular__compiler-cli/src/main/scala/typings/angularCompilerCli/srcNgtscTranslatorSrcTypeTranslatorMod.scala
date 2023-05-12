package typings.angularCompilerCli

import typings.angularCompiler.mod.Type
import typings.angularCompilerCli.srcNgtscImportsMod.ReferenceEmitter
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.ImportManager
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcTypeTranslatorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/type_translator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def translateType(
    `type`: Type,
    contextFile: SourceFile,
    reflector: ReflectionHost,
    refEmitter: ReferenceEmitter,
    imports: ImportManager
  ): TypeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("translateType")(`type`.asInstanceOf[js.Any], contextFile.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any], refEmitter.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[TypeNode]
}
