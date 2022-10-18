package typings.angularCompilerCli

import typings.angularCompiler.mod.R3ClassMetadata
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcMetadataMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractClassMetadata(clazz: DeclarationNode, reflection: ReflectionHost, isCore: Boolean): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  inline def extractClassMetadata(
    clazz: DeclarationNode,
    reflection: ReflectionHost,
    isCore: Boolean,
    annotateForClosureCompiler: Boolean
  ): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  inline def extractClassMetadata(
    clazz: DeclarationNode,
    reflection: ReflectionHost,
    isCore: Boolean,
    annotateForClosureCompiler: Boolean,
    angularDecoratorTransform: js.Function1[/* dec */ Decorator, Decorator]
  ): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], angularDecoratorTransform.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
  inline def extractClassMetadata(
    clazz: DeclarationNode,
    reflection: ReflectionHost,
    isCore: Boolean,
    annotateForClosureCompiler: Unit,
    angularDecoratorTransform: js.Function1[/* dec */ Decorator, Decorator]
  ): R3ClassMetadata | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extractClassMetadata")(clazz.asInstanceOf[js.Any], reflection.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], annotateForClosureCompiler.asInstanceOf[js.Any], angularDecoratorTransform.asInstanceOf[js.Any])).asInstanceOf[R3ClassMetadata | Null]
}
