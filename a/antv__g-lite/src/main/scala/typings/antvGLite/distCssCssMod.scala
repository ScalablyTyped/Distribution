package typings.antvGLite

import typings.antvGLite.distCssCssomMod.CSSUnitValue
import typings.antvGLite.distCssInterfacesMod.PropertySyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssMod {
  
  object CSS {
    
    @JSImport("@antv/g-lite/dist/css/CSS", "CSS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * <angle>
      */
    inline def deg(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("deg")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <length>
      */
    inline def em(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("em")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <angle>
      */
    inline def grad(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("grad")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <time>
      */
    inline def ms(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("ms")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <number>
      * @see https://drafts.csswg.org/css-values-4/#number-value
      */
    inline def number(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <percentage>
      * @see https://drafts.csswg.org/css-values-4/#percentage-value
      */
    inline def percent(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("percent")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <length>
      */
    inline def px(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("px")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <angle>
      */
    inline def rad(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("rad")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
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
    
    inline def rem(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("rem")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <time>
      */
    inline def s(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
    
    /**
      * <angle>
      */
    inline def turn(n: Double): CSSUnitValue = ^.asInstanceOf[js.Dynamic].applyDynamic("turn")(n.asInstanceOf[js.Any]).asInstanceOf[CSSUnitValue]
  }
  
  trait PropertyDefinition extends StObject {
    
    /**
      * A boolean value defining whether the defined property should be inherited (true), or not (false). Defaults to false.
      */
    var inherits: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var interpolable: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    /**
      * representing the expected syntax of the defined property. Defaults to "*".
      */
    var syntax: PropertySyntax
  }
  object PropertyDefinition {
    
    inline def apply(name: String, syntax: PropertySyntax): PropertyDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyDefinition] (val x: Self) extends AnyVal {
      
      inline def setInherits(value: Boolean): Self = StObject.set(x, "inherits", value.asInstanceOf[js.Any])
      
      inline def setInheritsUndefined: Self = StObject.set(x, "inherits", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInterpolable(value: Boolean): Self = StObject.set(x, "interpolable", value.asInstanceOf[js.Any])
      
      inline def setInterpolableUndefined: Self = StObject.set(x, "interpolable", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSyntax(value: PropertySyntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
}
