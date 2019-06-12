package typings
package atAngularCompilerLib.srcDirectiveUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/directive_resolver", "DirectiveResolver")
@js.native
class DirectiveResolver protected () extends js.Object {
  def this(_reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  var _dedupeBindings: js.Any = js.native
  var _extractPublicName: js.Any = js.native
  var _merge: js.Any = js.native
  var _mergeWithPropertyMetadata: js.Any = js.native
  var _reflector: js.Any = js.native
  def isDirective(`type`: atAngularCompilerLib.srcCoreMod.Type): scala.Boolean = js.native
  /**
    * Return {@link Directive} for a given `Type`.
    */
  def resolve(`type`: atAngularCompilerLib.srcCoreMod.Type): atAngularCompilerLib.srcCoreMod.Directive = js.native
  def resolve(`type`: atAngularCompilerLib.srcCoreMod.Type, throwIfNotFound: scala.Boolean): atAngularCompilerLib.srcCoreMod.Directive | scala.Null = js.native
  @JSName("resolve")
  def resolve_true(
    `type`: atAngularCompilerLib.srcCoreMod.Type,
    throwIfNotFound: atAngularCompilerLib.atAngularCompilerLibNumbers.`true`
  ): atAngularCompilerLib.srcCoreMod.Directive = js.native
}

