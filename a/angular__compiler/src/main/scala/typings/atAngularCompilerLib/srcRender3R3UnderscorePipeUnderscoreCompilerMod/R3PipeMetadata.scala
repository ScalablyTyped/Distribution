package typings
package atAngularCompilerLib.srcRender3R3UnderscorePipeUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3PipeMetadata extends js.Object {
  /**
    * Dependencies of the pipe's constructor.
    */
  var deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] | scala.Null
  /**
    * Name of the pipe type.
    */
  var name: java.lang.String
  /**
    * Name of the pipe.
    */
  var pipeName: java.lang.String
  /**
    * Whether the pipe is marked as pure.
    */
  var pure: scala.Boolean
  /**
    * An expression representing a reference to the pipe itself.
    */
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: scala.Double
}

object R3PipeMetadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    pipeName: java.lang.String,
    pure: scala.Boolean,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    typeArgumentCount: scala.Double,
    deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null
  ): R3PipeMetadata = {
    val __obj = js.Dynamic.literal(name = name, pipeName = pipeName, pure = pure, typeArgumentCount = typeArgumentCount)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3PipeMetadata]
  }
}

