package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileStylesheetMetadata
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.urlResolverMod.UrlResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleCompilerMod {
  
  @JSImport("@angular/compiler/src/style_compiler", "CONTENT_ATTR")
  @js.native
  val CONTENT_ATTR: String = js.native
  
  @JSImport("@angular/compiler/src/style_compiler", "CompiledStylesheet")
  @js.native
  class CompiledStylesheet protected () extends StObject {
    def this(
      outputCtx: OutputContext,
      stylesVar: String,
      dependencies: js.Array[StylesCompileDependency],
      isShimmed: Boolean,
      meta: CompileStylesheetMetadata
    ) = this()
    
    var dependencies: js.Array[StylesCompileDependency] = js.native
    
    var isShimmed: Boolean = js.native
    
    var meta: CompileStylesheetMetadata = js.native
    
    var outputCtx: OutputContext = js.native
    
    var stylesVar: String = js.native
  }
  
  @JSImport("@angular/compiler/src/style_compiler", "HOST_ATTR")
  @js.native
  val HOST_ATTR: String = js.native
  
  @JSImport("@angular/compiler/src/style_compiler", "StyleCompiler")
  @js.native
  class StyleCompiler protected () extends StObject {
    def this(_urlResolver: UrlResolver) = this()
    
    var _compileStyles: js.Any = js.native
    
    var _shadowCss: js.Any = js.native
    
    var _shimIfNeeded: js.Any = js.native
    
    var _urlResolver: js.Any = js.native
    
    def compileComponent(outputCtx: OutputContext, comp: CompileDirectiveMetadata): CompiledStylesheet = js.native
    
    def compileStyles(outputCtx: OutputContext, comp: CompileDirectiveMetadata, stylesheet: CompileStylesheetMetadata): CompiledStylesheet = js.native
    def compileStyles(
      outputCtx: OutputContext,
      comp: CompileDirectiveMetadata,
      stylesheet: CompileStylesheetMetadata,
      shim: Boolean
    ): CompiledStylesheet = js.native
    
    def needsStyleShim(comp: CompileDirectiveMetadata): Boolean = js.native
  }
  
  @JSImport("@angular/compiler/src/style_compiler", "StylesCompileDependency")
  @js.native
  class StylesCompileDependency protected () extends StObject {
    def this(name: String, moduleUrl: String, setValue: js.Function1[/* value */ js.Any, Unit]) = this()
    
    var moduleUrl: String = js.native
    
    var name: String = js.native
    
    def setValue(value: js.Any): Unit = js.native
  }
}
