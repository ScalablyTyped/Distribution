package typings.angularCompiler

import typings.angularCompiler.coreMod.Directive
import typings.angularCompiler.coreMod.Type
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.DirectiveResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/testing/src/directive_resolver_mock", JSImport.Namespace)
@js.native
object directiveResolverMockMod extends js.Object {
  @js.native
  class MockDirectiveResolver protected () extends DirectiveResolver {
    def this(reflector: CompileReflector) = this()
    var _directives: js.Any = js.native
    /**
      * Overrides the {@link core.Directive} for a directive.
      */
    def setDirective(`type`: Type, metadata: Directive): Unit = js.native
  }
  
}

