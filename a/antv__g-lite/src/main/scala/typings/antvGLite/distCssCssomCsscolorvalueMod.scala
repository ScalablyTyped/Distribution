package typings.antvGLite

import typings.antvGLite.antvGLiteStrings.none
import typings.antvGLite.distCssCssomCssstylevalueMod.CSSStyleValue
import typings.std.CSSNumberish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomCsscolorvalueMod {
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/css/cssom/CSSColorValue", "CSSColorValue")
  @js.native
  open class CSSColorValue protected () extends CSSStyleValue {
    def this(colorSpace: ColorSpace) = this()
    
    var colorSpace: ColorSpace = js.native
    
    /**
      * @see https://drafts.css-houdini.org/css-typed-om-1/#dom-csscolorvalue-to
      */
    def to(colorSpace: ColorSpace): CSSColorValue = js.native
  }
  
  type CSSColorAngle = CSSNumberish | none
  
  type CSSColorNumber = CSSNumberish | none
  
  type CSSColorPercent = CSSNumberish | none
  
  type CSSColorRGBComp = CSSNumberish | none
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGLite.antvGLiteStrings.rgb
    - typings.antvGLite.antvGLiteStrings.hsl
    - typings.antvGLite.antvGLiteStrings.hwb
    - typings.antvGLite.antvGLiteStrings.lch
    - typings.antvGLite.antvGLiteStrings.lab
  */
  trait ColorSpace extends StObject
  object ColorSpace {
    
    inline def hsl: typings.antvGLite.antvGLiteStrings.hsl = "hsl".asInstanceOf[typings.antvGLite.antvGLiteStrings.hsl]
    
    inline def hwb: typings.antvGLite.antvGLiteStrings.hwb = "hwb".asInstanceOf[typings.antvGLite.antvGLiteStrings.hwb]
    
    inline def lab: typings.antvGLite.antvGLiteStrings.lab = "lab".asInstanceOf[typings.antvGLite.antvGLiteStrings.lab]
    
    inline def lch: typings.antvGLite.antvGLiteStrings.lch = "lch".asInstanceOf[typings.antvGLite.antvGLiteStrings.lch]
    
    inline def rgb: typings.antvGLite.antvGLiteStrings.rgb = "rgb".asInstanceOf[typings.antvGLite.antvGLiteStrings.rgb]
  }
}
