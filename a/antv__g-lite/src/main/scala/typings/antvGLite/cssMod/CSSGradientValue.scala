package typings.antvGLite.cssMod

import typings.antvGLite.cssgradientvalueMod.LinearGradient
import typings.antvGLite.cssgradientvalueMod.RadialGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSGradientValue")
@js.native
open class CSSGradientValue protected ()
  extends typings.antvGLite.cssomMod.CSSGradientValue {
  def this(`type`: typings.antvGLite.cssgradientvalueMod.GradientType, value: LinearGradient) = this()
  def this(`type`: typings.antvGLite.cssgradientvalueMod.GradientType, value: RadialGradient) = this()
}
