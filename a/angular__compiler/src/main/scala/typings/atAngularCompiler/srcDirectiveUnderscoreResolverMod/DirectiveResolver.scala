package typings.atAngularCompiler.srcDirectiveUnderscoreResolverMod

import typings.atAngularCompiler.atAngularCompilerNumbers.`true`
import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcCoreMod.Directive
import typings.atAngularCompiler.srcCoreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/directive_resolver", "DirectiveResolver")
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

