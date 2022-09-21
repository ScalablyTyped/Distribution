package typings.angularCompilerCli

import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolingMod {
  
  @JSImport("@angular/compiler-cli/private/tooling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GLOBAL_DEFS_FOR_TERSER {
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER.ngDevMode")
    @js.native
    def ngDevMode: Boolean = js.native
    inline def ngDevMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngDevMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER.ngI18nClosureMode")
    @js.native
    def ngI18nClosureMode: Boolean = js.native
    inline def ngI18nClosureMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngI18nClosureMode")(x.asInstanceOf[js.Any])
  }
  
  object GLOBAL_DEFS_FOR_TERSER_WITH_AOT {
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT.ngDevMode")
    @js.native
    def ngDevMode: Boolean = js.native
    inline def ngDevMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngDevMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT.ngI18nClosureMode")
    @js.native
    def ngI18nClosureMode: Boolean = js.native
    inline def ngI18nClosureMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngI18nClosureMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/compiler-cli/private/tooling", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT.ngJitMode")
    @js.native
    def ngJitMode: Boolean = js.native
    inline def ngJitMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngJitMode")(x.asInstanceOf[js.Any])
  }
  
  inline def constructorParametersDownlevelTransform(program: Program): TransformerFactory[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("constructorParametersDownlevelTransform")(program.asInstanceOf[js.Any]).asInstanceOf[TransformerFactory[SourceFile]]
}
