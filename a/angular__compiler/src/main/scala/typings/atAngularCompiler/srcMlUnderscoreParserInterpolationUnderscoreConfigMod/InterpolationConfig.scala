package typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/interpolation_config", "InterpolationConfig")
@js.native
class InterpolationConfig protected () extends js.Object {
  def this(start: String, end: String) = this()
  var end: String = js.native
  var start: String = js.native
}

/* static members */
@JSImport("@angular/compiler/src/ml_parser/interpolation_config", "InterpolationConfig")
@js.native
object InterpolationConfig extends js.Object {
  def fromArray(): InterpolationConfig = js.native
  def fromArray(markers: js.Tuple2[String, String]): InterpolationConfig = js.native
}

