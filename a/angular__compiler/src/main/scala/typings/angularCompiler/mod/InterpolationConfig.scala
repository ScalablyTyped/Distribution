package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "InterpolationConfig")
@js.native
class InterpolationConfig protected ()
  extends typings.angularCompiler.compilerMod.InterpolationConfig {
  def this(start: String, end: String) = this()
}
/* static members */
object InterpolationConfig {
  
  @JSImport("@angular/compiler", "InterpolationConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromArray(): typings.angularCompiler.interpolationConfigMod.InterpolationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")().asInstanceOf[typings.angularCompiler.interpolationConfigMod.InterpolationConfig]
  @scala.inline
  def fromArray(markers: js.Tuple2[String, String]): typings.angularCompiler.interpolationConfigMod.InterpolationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(markers.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.interpolationConfigMod.InterpolationConfig]
}
