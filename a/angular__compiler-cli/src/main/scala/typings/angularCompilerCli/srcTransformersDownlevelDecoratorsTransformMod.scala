package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTransformersDownlevelDecoratorsTransformMod {
  
  @JSImport("@angular/compiler-cli/src/transformers/downlevel_decorators_transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDownlevelDecoratorsTransform(
    typeChecker: TypeChecker,
    host: ReflectionHost,
    diagnostics: js.Array[Diagnostic],
    isCore: Boolean,
    isClosureCompilerEnabled: Boolean,
    skipClassDecorators: Boolean
  ): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDownlevelDecoratorsTransform")(typeChecker.asInstanceOf[js.Any], host.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isClosureCompilerEnabled.asInstanceOf[js.Any], skipClassDecorators.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
}
