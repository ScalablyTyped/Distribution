package typings
package atAngularCompilerLib.srcRender3R3UnderscorePipeUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3PipeMetadata extends js.Object {
  var deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] | scala.Null
  var name: java.lang.String
  var pipeName: java.lang.String
  var pure: scala.Boolean
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3PipeMetadata {
  @scala.inline
  def apply(
    name: java.lang.String,
    pipeName: java.lang.String,
    pure: scala.Boolean,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    deps: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreFactoryMod.R3DependencyMetadata] = null
  ): R3PipeMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("pipeName")(pipeName)
    __obj.updateDynamic("pure")(pure)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    __obj.asInstanceOf[R3PipeMetadata]
  }
}

