package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolationConfigMod {
  
  @JSImport("@angular/compiler/src/ml_parser/interpolation_config", "DEFAULT_INTERPOLATION_CONFIG")
  @js.native
  val DEFAULT_INTERPOLATION_CONFIG: InterpolationConfig = js.native
  
  @JSImport("@angular/compiler/src/ml_parser/interpolation_config", "InterpolationConfig")
  @js.native
  class InterpolationConfig protected () extends StObject {
    def this(start: String, end: String) = this()
    
    var end: String = js.native
    
    var start: String = js.native
  }
  /* static members */
  object InterpolationConfig {
    
    @JSImport("@angular/compiler/src/ml_parser/interpolation_config", "InterpolationConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromArray(): InterpolationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")().asInstanceOf[InterpolationConfig]
    @scala.inline
    def fromArray(markers: js.Tuple2[String, String]): InterpolationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(markers.asInstanceOf[js.Any]).asInstanceOf[InterpolationConfig]
  }
}
