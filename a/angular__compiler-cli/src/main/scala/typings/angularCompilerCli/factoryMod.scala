package typings.angularCompilerCli

import typings.angularCompiler.mod.R3FactoryMetadata
import typings.angularCompilerCli.transformSrcApiMod.CompileResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileDeclareFactory(metadata: R3FactoryMetadata): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileDeclareFactory")(metadata.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  inline def compileNgFactoryDefField(metadata: R3FactoryMetadata): CompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileNgFactoryDefField")(metadata.asInstanceOf[js.Any]).asInstanceOf[CompileResult]
  
  type CompileFactoryFn = js.Function1[/* metadata */ R3FactoryMetadata, CompileResult]
}
