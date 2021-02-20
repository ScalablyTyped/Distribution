package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.srcUtilMod.OutputContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngModuleCompilerMod {
  
  @JSImport("@angular/compiler/src/ng_module_compiler", "NgModuleCompileResult")
  @js.native
  class NgModuleCompileResult protected () extends StObject {
    def this(ngModuleFactoryVar: String) = this()
    
    var ngModuleFactoryVar: String = js.native
  }
  
  @JSImport("@angular/compiler/src/ng_module_compiler", "NgModuleCompiler")
  @js.native
  class NgModuleCompiler protected () extends StObject {
    def this(reflector: CompileReflector) = this()
    
    var _createNgModuleFactory: js.Any = js.native
    
    def compile(
      ctx: OutputContext,
      ngModuleMeta: CompileNgModuleMetadata,
      extraProviders: js.Array[CompileProviderMetadata]
    ): NgModuleCompileResult = js.native
    
    def createStub(ctx: OutputContext, ngModuleReference: js.Any): Unit = js.native
    
    var reflector: js.Any = js.native
  }
}
