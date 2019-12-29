package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/interpolation_config", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserInterpolationUnderscoreConfigMod extends js.Object {
  @js.native
  class InterpolationConfig protected () extends js.Object {
    def this(start: String, end: String) = this()
    var end: String = js.native
    var start: String = js.native
  }
  
  val DEFAULT_INTERPOLATION_CONFIG: InterpolationConfig = js.native
  /* static members */
  @js.native
  object InterpolationConfig extends js.Object {
    def fromArray(): InterpolationConfig = js.native
    def fromArray(markers: js.Tuple2[String, String]): InterpolationConfig = js.native
  }
  
}

