package typings.angularCompiler

import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.coreMod.NgModule
import typings.angularCompiler.coreMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngModuleResolverMod {
  
  @JSImport("@angular/compiler/src/ng_module_resolver", "NgModuleResolver")
  @js.native
  class NgModuleResolver protected () extends StObject {
    def this(_reflector: CompileReflector) = this()
    
    /* private */ var _reflector: js.Any = js.native
    
    def isNgModule(`type`: js.Any): Boolean = js.native
    
    def resolve(`type`: Type): NgModule | Null = js.native
    def resolve(`type`: Type, throwIfNotFound: Boolean): NgModule | Null = js.native
  }
}
