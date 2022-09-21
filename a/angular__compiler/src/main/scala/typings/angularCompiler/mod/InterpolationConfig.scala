package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "InterpolationConfig")
@js.native
open class InterpolationConfig protected () extends StObject {
  def this(start: String, end: String) = this()
  
  var end: String = js.native
  
  var start: String = js.native
}
/* static members */
object InterpolationConfig {
  
  @JSImport("@angular/compiler", "InterpolationConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArray(): InterpolationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")().asInstanceOf[InterpolationConfig]
  inline def fromArray(markers: js.Tuple2[String, String]): InterpolationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(markers.asInstanceOf[js.Any]).asInstanceOf[InterpolationConfig]
}
