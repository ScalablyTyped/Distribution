package typings
package atAngularCompilerLib.srcPipeUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/pipe_resolver", "PipeResolver")
@js.native
class PipeResolver protected () extends js.Object {
  def this(_reflector: atAngularCompilerLib.srcCompileUnderscoreReflectorMod.CompileReflector) = this()
  var _reflector: js.Any = js.native
  def isPipe(`type`: atAngularCompilerLib.srcCoreMod.Type): scala.Boolean = js.native
  /**
    * Return {@link Pipe} for a given `Type`.
    */
  def resolve(`type`: atAngularCompilerLib.srcCoreMod.Type): atAngularCompilerLib.srcCoreMod.Pipe | scala.Null = js.native
  def resolve(`type`: atAngularCompilerLib.srcCoreMod.Type, throwIfNotFound: scala.Boolean): atAngularCompilerLib.srcCoreMod.Pipe | scala.Null = js.native
}

