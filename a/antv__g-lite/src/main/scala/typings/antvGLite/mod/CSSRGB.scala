package typings.antvGLite.mod

import typings.antvGLite.csscolorvalueMod.CSSColorPercent
import typings.antvGLite.csscolorvalueMod.CSSColorRGBComp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite", "CSSRGB")
@js.native
open class CSSRGB protected ()
  extends typings.antvGLite.cssMod.CSSRGB {
  def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp) = this()
  def this(r: CSSColorRGBComp, g: CSSColorRGBComp, b: CSSColorRGBComp, alpha: CSSColorPercent) = this()
  def this(
    r: CSSColorRGBComp,
    g: CSSColorRGBComp,
    b: CSSColorRGBComp,
    alpha: Unit,
    /**
    * 'transparent' & 'none' has the same rgba data
    */
  isNone: Boolean
  ) = this()
  def this(
    r: CSSColorRGBComp,
    g: CSSColorRGBComp,
    b: CSSColorRGBComp,
    alpha: CSSColorPercent,
    /**
    * 'transparent' & 'none' has the same rgba data
    */
  isNone: Boolean
  ) = this()
}
