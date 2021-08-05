package typings.angularCompiler

import typings.angularCompiler.coreMod.Directive
import typings.angularCompiler.coreMod.Type
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.DirectiveResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directiveResolverMockMod {
  
  @JSImport("@angular/compiler/testing/src/directive_resolver_mock", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected () extends DirectiveResolver {
    def this(reflector: CompileReflector) = this()
    
    /* private */ var _directives: js.Any = js.native
    
    /**
      * Overrides the {@link core.Directive} for a directive.
      */
    def setDirective(`type`: Type, metadata: Directive): Unit = js.native
  }
}
