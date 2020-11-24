package typings.angularCompiler

import typings.angularCompiler.angularCompilerBooleans.`true`
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.coreMod.Directive
import typings.angularCompiler.coreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/directive_resolver", JSImport.Namespace)
@js.native
object directiveResolverMod extends js.Object {
  
  def findLast[T](arr: js.Array[T], condition: js.Function1[/* value */ T, Boolean]): T | Null = js.native
  
  @js.native
  class DirectiveResolver protected () extends js.Object {
    def this(_reflector: CompileReflector) = this()
    
    var _dedupeBindings: js.Any = js.native
    
    var _extractPublicName: js.Any = js.native
    
    var _merge: js.Any = js.native
    
    var _mergeWithPropertyMetadata: js.Any = js.native
    
    var _reflector: js.Any = js.native
    
    def isDirective(`type`: Type): Boolean = js.native
    
    /**
      * Return {@link Directive} for a given `Type`.
      */
    def resolve(`type`: Type): Directive = js.native
    def resolve(`type`: Type, throwIfNotFound: Boolean): Directive | Null = js.native
    @JSName("resolve")
    def resolve_true(`type`: Type, throwIfNotFound: `true`): Directive = js.native
  }
}
