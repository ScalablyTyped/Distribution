package typings.aframe.anon

import typings.aframe.aframeStrings.`srgb-linear`
import typings.aframe.aframeStrings.srgb
import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcMathColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofColorManagement extends StObject {
  
  def convert(color: Color, sourceColorSpace: srgb | `srgb-linear`, targetColorSpace: srgb | `srgb-linear`): Color = js.native
  def convert(color: Color, sourceColorSpace: srgb | `srgb-linear`, targetColorSpace: /* "display-p3" */ String): Color = js.native
  def convert(color: Color, sourceColorSpace: /* "display-p3" */ String, targetColorSpace: srgb | `srgb-linear`): Color = js.native
  def convert(
    color: Color,
    sourceColorSpace: /* "display-p3" */ String,
    targetColorSpace: /* "display-p3" */ String
  ): Color = js.native
  
  /**
    * @default false
    */
  var enabled: Boolean = js.native
  
  def fromWorkingColorSpace(color: Color, targetColorSpace: srgb | `srgb-linear`): Color = js.native
  def fromWorkingColorSpace(color: Color, targetColorSpace: /* "display-p3" */ String): Color = js.native
  
  def toWorkingColorSpace(color: Color, sourceColorSpace: srgb | `srgb-linear`): Color = js.native
  def toWorkingColorSpace(color: Color, sourceColorSpace: /* "display-p3" */ String): Color = js.native
  
  /**
    * @default LinearSRGBColorSpace
    */
  var workingColorSpace: ColorSpace = js.native
}
