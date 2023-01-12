package typings.antvGLite

import typings.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typings.antvGLite.distDisplayObjectsMod.DisplayObject
import typings.antvGLite.distDomInterfacesMod.IElement
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCsspropertyMod {
  
  trait CSSProperty[Parsed, Used] extends StObject {
    
    /**
      * convert parsed value to used value.
      * eg. in `lineWidth`, convert [CSSUnitValue] to [CSSUnitValue, CSSUnitValue]
      *
      * in Blink, it convert a CSSValue to an appropriate platform value
      */
    def calculator(
      name: String,
      oldParsed: Parsed,
      parsed: Parsed,
      `object`: IElement[Any, Any],
      registry: StyleValueRegistry
    ): Used
    /**
      * convert parsed value to used value.
      * eg. in `lineWidth`, convert [CSSUnitValue] to [CSSUnitValue, CSSUnitValue]
      *
      * in Blink, it convert a CSSValue to an appropriate platform value
      */
    @JSName("calculator")
    var calculator_Original: CSSPropertyCalculator[Parsed, Used]
    
    /**
      * used with interpolation in animation system
      */
    def mixer(left: Used, right: Used): js.UndefOr[js.Tuple3[Any, Any, js.Function1[/* i */ Any, String | Any]]]
    def mixer(left: Used, right: Used, displayObject: IElement[Any, Any]): js.UndefOr[js.Tuple3[Any, Any, js.Function1[/* i */ Any, String | Any]]]
    /**
      * used with interpolation in animation system
      */
    @JSName("mixer")
    var mixer_Original: CSSPropertyMixer[Used, Any]
    
    /**
      * parse CSS string to CSSStyleValue
      *
      * @example
      * '10' -> CSS.number(10)
      * '10px' -> CSS.px(10)
      * '180deg' -> CSS.deg(180)
      */
    def parser(value: String, `object`: DisplayObject[Any, Any]): Parsed
    def parser(value: Any, `object`: DisplayObject[Any, Any]): Parsed
    /**
      * parse CSS string to CSSStyleValue
      *
      * @example
      * '10' -> CSS.number(10)
      * '10px' -> CSS.px(10)
      * '180deg' -> CSS.deg(180)
      */
    @JSName("parser")
    var parser_Original: CSSPropertyParser[Parsed]
    
    /**
      * eg. update local position after x/y/z caculated
      */
    def postProcessor(`object`: IElement[Any, Any]): Unit
    
    def preProcessor(`object`: IElement[Any, Any]): Unit
  }
  object CSSProperty {
    
    @JSImport("@antv/g-lite/dist/css/CSSProperty", "CSSProperty")
    @js.native
    val ^ : DefinedToken = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSProperty[?, ?], Parsed, Used] (val x: Self & (CSSProperty[Parsed, Used])) extends AnyVal {
      
      inline def setCalculator(
        value: (/* name */ String, Parsed, Parsed, /* object */ IElement[Any, Any], /* registry */ StyleValueRegistry) => Used
      ): Self = StObject.set(x, "calculator", js.Any.fromFunction5(value))
      
      inline def setMixer(
        value: (Used, Used, /* displayObject */ (IElement[Any, Any]) | Null) => js.UndefOr[js.Tuple3[Any, Any, js.Function1[Any, String | Any]]]
      ): Self = StObject.set(x, "mixer", js.Any.fromFunction3(value))
      
      inline def setParser(value: (/* value */ String | Any, /* object */ DisplayObject[Any, Any]) => Parsed): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setPostProcessor(value: IElement[Any, Any] => Unit): Self = StObject.set(x, "postProcessor", js.Any.fromFunction1(value))
      
      inline def setPreProcessor(value: IElement[Any, Any] => Unit): Self = StObject.set(x, "preProcessor", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("@antv/g-lite/dist/css/CSSProperty", "CSSPropertySyntaxFactory")
  @js.native
  val CSSPropertySyntaxFactory: DefinedToken = js.native
  type CSSPropertySyntaxFactory = js.Function1[/* syntax */ String, CSSProperty[Any, Any]]
  
  type CSSPropertyCalculator[Parsed, Used] = js.Function5[
    /* name */ String, 
    /* oldParsed */ Parsed, 
    /* parsed */ Parsed, 
    /* object */ IElement[Any, Any], 
    /* registry */ StyleValueRegistry, 
    Used
  ]
  
  type CSSPropertyMixer[Parsed, T /* <: Interpolatable */] = js.Function3[
    /* left */ Parsed, 
    /* right */ Parsed, 
    /* displayObject */ (IElement[Any, Any]) | Null, 
    js.UndefOr[js.Tuple3[T, T, js.Function1[/* i */ T, String | Any]]]
  ]
  
  type CSSPropertyParser[Parsed] = js.Function2[/* value */ String | Any, /* object */ DisplayObject[Any, Any], Parsed]
  
  type Interpolatable = Double | Boolean | (js.Array[Boolean | Double])
}
