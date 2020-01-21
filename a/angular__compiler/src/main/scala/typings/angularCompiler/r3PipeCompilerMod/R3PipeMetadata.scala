package typings.angularCompiler.r3PipeCompilerMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3PipeMetadata extends js.Object {
  /**
    * Dependencies of the pipe's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | Null
  /**
    * Name of the pipe type.
    */
  var name: String
  /**
    * Name of the pipe.
    */
  var pipeName: String
  /**
    * Whether the pipe is marked as pure.
    */
  var pure: Boolean
  /**
    * An expression representing a reference to the pipe itself.
    */
  var `type`: Expression
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double
}

object R3PipeMetadata {
  @scala.inline
  def apply(
    name: String,
    pipeName: String,
    pure: Boolean,
    `type`: Expression,
    typeArgumentCount: Double,
    deps: js.Array[R3DependencyMetadata] = null
  ): R3PipeMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pipeName = pipeName.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3PipeMetadata]
  }
}

