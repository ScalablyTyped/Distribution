package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "InterpolationConfig")
@js.native
class InterpolationConfig protected ()
  extends typings.angularCompiler.publicApiMod.InterpolationConfig {
  def this(start: String, end: String) = this()
}

/* static members */
@JSImport("@angular/compiler/compiler", "InterpolationConfig")
@js.native
object InterpolationConfig extends js.Object {
  def fromArray(): typings.angularCompiler.interpolationConfigMod.InterpolationConfig = js.native
  def fromArray(markers: js.Tuple2[String, String]): typings.angularCompiler.interpolationConfigMod.InterpolationConfig = js.native
}

