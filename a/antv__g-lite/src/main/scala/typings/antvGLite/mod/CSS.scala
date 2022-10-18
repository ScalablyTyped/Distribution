package typings.antvGLite.mod

import typings.antvGLite.distCssCssMod.PropertyDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSS {
  
  @JSImport("@antv/g-lite", "CSS")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * <angle>
    */
  inline def deg(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deg")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <length>
    */
  inline def em(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <angle>
    */
  inline def grad(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("grad")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <time>
    */
  inline def ms(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("ms")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <number>
    * @see https://drafts.csswg.org/css-values-4/#number-value
    */
  inline def number(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <percentage>
    * @see https://drafts.csswg.org/css-values-4/#percentage-value
    */
  inline def percent(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("percent")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <length>
    */
  inline def px(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("px")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <angle>
    */
  inline def rad(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("rad")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * CSS Layout API
    * register layout
    *
    * @see https://github.com/w3c/css-houdini-drafts/blob/main/css-layout-api/EXPLAINER.md
    * @see https://developer.mozilla.org/en-US/docs/Web/Guide/Houdini#css_layout_api
    */
  inline def registerLayout(name: String, clazz: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLayout")(name.asInstanceOf[js.Any], clazz.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * CSS Properties & Values API
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CSS_Properties_and_Values_API
    * @see https://drafts.css-houdini.org/css-properties-values-api/#registering-custom-properties
    * @see https://developer.mozilla.org/en-US/docs/Web/API/CSS/RegisterProperty
    */
  inline def registerProperty(definition: PropertyDefinition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerProperty")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def rem(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("rem")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <time>
    */
  inline def s(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
  
  /**
    * <angle>
    */
  inline def turn(n: Double): typings.antvGLite.distCssCssomMod.CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("turn")(n.asInstanceOf[js.Any]).asInstanceOf[typings.antvGLite.distCssCssomMod.CSSUnitValue]
}
