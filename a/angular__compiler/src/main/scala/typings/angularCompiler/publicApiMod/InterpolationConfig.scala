package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "InterpolationConfig")
@js.native
class InterpolationConfig protected ()
  extends typings.angularCompiler.srcCompilerMod.InterpolationConfig {
  def this(start: String, end: String) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "InterpolationConfig")
@js.native
object InterpolationConfig extends js.Object {
  def fromArray(): typings.angularCompiler.interpolationConfigMod.InterpolationConfig = js.native
  def fromArray(markers: js.Tuple2[String, String]): typings.angularCompiler.interpolationConfigMod.InterpolationConfig = js.native
}

