package typings.antvGLite

import typings.antvGLite.anon.PartialPropertyParseOptio
import typings.antvGLite.cssomMod.CSSStyleValue
import typings.antvGLite.csspropertyMod.CSSProperty
import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssInterfacesMod {
  
  trait LayoutRegistry extends StObject {
    
    def getLayout(name: String): Any
    
    def hasLayout(name: String): Boolean
  }
  object LayoutRegistry {
    
    @JSImport("@antv/g-lite/dist/css/interfaces", "LayoutRegistry")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: LayoutRegistry](x: Self) {
      
      inline def setGetLayout(value: String => Any): Self = StObject.set(x, "getLayout", js.Any.fromFunction1(value))
      
      inline def setHasLayout(value: String => Boolean): Self = StObject.set(x, "hasLayout", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  sealed trait PropertySyntax extends StObject
  @JSImport("@antv/g-lite/dist/css/interfaces", "PropertySyntax")
  @js.native
  object PropertySyntax extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PropertySyntax & String] = js.native
    
    /**
      * @see https://developer.mozilla.org/zh-CN/docs/Web/CSS/angle
      */
    @js.native
    sealed trait ANGLE
      extends StObject
         with PropertySyntax
    /* "<angle>" */ val ANGLE: typings.antvGLite.cssInterfacesMod.PropertySyntax.ANGLE & String = js.native
    
    @js.native
    sealed trait CLIP_PATH
      extends StObject
         with PropertySyntax
    /* "<clip-path>" */ val CLIP_PATH: typings.antvGLite.cssInterfacesMod.PropertySyntax.CLIP_PATH & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#color
      */
    @js.native
    sealed trait COLOR
      extends StObject
         with PropertySyntax
    /* "<color>" */ val COLOR: typings.antvGLite.cssInterfacesMod.PropertySyntax.COLOR & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#coordinate
      */
    @js.native
    sealed trait COORDINATE
      extends StObject
         with PropertySyntax
    /* "<coordinate>" */ val COORDINATE: typings.antvGLite.cssInterfacesMod.PropertySyntax.COORDINATE & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/filter#formal_syntax
      */
    @js.native
    sealed trait FILTER
      extends StObject
         with PropertySyntax
    /* "<filter>" */ val FILTER: typings.antvGLite.cssInterfacesMod.PropertySyntax.FILTER & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#length
      */
    @js.native
    sealed trait LENGTH
      extends StObject
         with PropertySyntax
    /* "<length>" */ val LENGTH: typings.antvGLite.cssInterfacesMod.PropertySyntax.LENGTH & String = js.native
    
    @js.native
    sealed trait LENGTH_PERCENTAGE
      extends StObject
         with PropertySyntax
    /* "<length> | <percentage>" */ val LENGTH_PERCENTAGE: typings.antvGLite.cssInterfacesMod.PropertySyntax.LENGTH_PERCENTAGE & String = js.native
    
    @js.native
    sealed trait LENGTH_PERCENTAGE_12
      extends StObject
         with PropertySyntax
    /* "[<length> | <percentage>]{1,2}" */ val LENGTH_PERCENTAGE_12: typings.antvGLite.cssInterfacesMod.PropertySyntax.LENGTH_PERCENTAGE_12 & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/CSS/margin#formal_syntax
      */
    @js.native
    sealed trait LENGTH_PERCENTAGE_14
      extends StObject
         with PropertySyntax
    /* "[<length> | <percentage>]{1,4}" */ val LENGTH_PERCENTAGE_14: typings.antvGLite.cssInterfacesMod.PropertySyntax.LENGTH_PERCENTAGE_14 & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#list-of-ts
      */
    @js.native
    sealed trait LIST_OF_POINTS
      extends StObject
         with PropertySyntax
    /* "<list-of-points>" */ val LIST_OF_POINTS: typings.antvGLite.cssInterfacesMod.PropertySyntax.LIST_OF_POINTS & String = js.native
    
    @js.native
    sealed trait MARKER
      extends StObject
         with PropertySyntax
    /* "<marker>" */ val MARKER: typings.antvGLite.cssInterfacesMod.PropertySyntax.MARKER & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#number
      */
    @js.native
    sealed trait NUMBER
      extends StObject
         with PropertySyntax
    /* "<number>" */ val NUMBER: typings.antvGLite.cssInterfacesMod.PropertySyntax.NUMBER & String = js.native
    
    @js.native
    sealed trait OFFSET_DISTANCE
      extends StObject
         with PropertySyntax
    /* "<offset-distance>" */ val OFFSET_DISTANCE: typings.antvGLite.cssInterfacesMod.PropertySyntax.OFFSET_DISTANCE & String = js.native
    
    @js.native
    sealed trait OFFSET_PATH
      extends StObject
         with PropertySyntax
    /* "<offset-path>" */ val OFFSET_PATH: typings.antvGLite.cssInterfacesMod.PropertySyntax.OFFSET_PATH & String = js.native
    
    /**
      * <number> with range 0..1
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#opacity_value
      */
    @js.native
    sealed trait OPACITY_VALUE
      extends StObject
         with PropertySyntax
    /* "<opacity-value>" */ val OPACITY_VALUE: typings.antvGLite.cssInterfacesMod.PropertySyntax.OPACITY_VALUE & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#paint
      */
    @js.native
    sealed trait PAINT
      extends StObject
         with PropertySyntax
    /* "<paint>" */ val PAINT: typings.antvGLite.cssInterfacesMod.PropertySyntax.PAINT & String = js.native
    
    @js.native
    sealed trait PATH
      extends StObject
         with PropertySyntax
    /* "<path>" */ val PATH: typings.antvGLite.cssInterfacesMod.PropertySyntax.PATH & String = js.native
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Content_type#percentage
      */
    @js.native
    sealed trait PERCENTAGE
      extends StObject
         with PropertySyntax
    /* "<percentage>" */ val PERCENTAGE: typings.antvGLite.cssInterfacesMod.PropertySyntax.PERCENTAGE & String = js.native
    
    /**
      * <number> with range 0..Infinity
      */
    @js.native
    sealed trait SHADOW_BLUR
      extends StObject
         with PropertySyntax
    /* "<shadow-blur>" */ val SHADOW_BLUR: typings.antvGLite.cssInterfacesMod.PropertySyntax.SHADOW_BLUR & String = js.native
    
    @js.native
    sealed trait TEXT
      extends StObject
         with PropertySyntax
    /* "<text>" */ val TEXT: typings.antvGLite.cssInterfacesMod.PropertySyntax.TEXT & String = js.native
    
    @js.native
    sealed trait TEXT_TRANSFORM
      extends StObject
         with PropertySyntax
    /* "<text-transform>" */ val TEXT_TRANSFORM: typings.antvGLite.cssInterfacesMod.PropertySyntax.TEXT_TRANSFORM & String = js.native
    
    @js.native
    sealed trait TRANSFORM
      extends StObject
         with PropertySyntax
    /* "<transform>" */ val TRANSFORM: typings.antvGLite.cssInterfacesMod.PropertySyntax.TRANSFORM & String = js.native
    
    @js.native
    sealed trait TRANSFORM_ORIGIN
      extends StObject
         with PropertySyntax
    /* "<transform-origin>" */ val TRANSFORM_ORIGIN: typings.antvGLite.cssInterfacesMod.PropertySyntax.TRANSFORM_ORIGIN & String = js.native
    
    @js.native
    sealed trait Z_INDEX
      extends StObject
         with PropertySyntax
    /* "<z-index>" */ val Z_INDEX: typings.antvGLite.cssInterfacesMod.PropertySyntax.Z_INDEX & String = js.native
  }
  
  @js.native
  trait StyleValueRegistry extends StObject {
    
    def addUnresolveProperty(`object`: DisplayObject[Any, Any], name: String): Unit = js.native
    
    def computeProperty(name: String, computed: CSSStyleValue, `object`: DisplayObject[Any, Any]): Any = js.native
    
    def getPropertySyntax(syntax: String): CSSProperty[Any, Any] = js.native
    
    def parseProperty(name: String, value: Any, `object`: DisplayObject[Any, Any]): CSSStyleValue = js.native
    
    def processProperties(`object`: DisplayObject[Any, Any], attributes: BaseStyleProps): Unit = js.native
    def processProperties(`object`: DisplayObject[Any, Any], attributes: BaseStyleProps, options: PartialPropertyParseOptio): Unit = js.native
    
    def recalc(displayObject: DisplayObject[Any, Any]): Unit = js.native
    
    def registerMetadata(metadata: PropertyMetadata): Unit = js.native
    
    def unregisterMetadata(name: String): Unit = js.native
  }
  @JSImport("@antv/g-lite/dist/css/interfaces", "StyleValueRegistry")
  @js.native
  val StyleValueRegistry: DefinedToken = js.native
  
  trait PropertyMetadata extends StObject {
    
    /**
      * eg. strokeWidth is an alias of lineWidth
      */
    var a: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * This specifies the default value for this field.
      * - for keyword fields, this is the initial keyword
      * - for other fields, this is a string containg the C++ expression that is used to initialise the field.
      */
    var d: js.UndefOr[String | (js.Function1[/* nodeName */ String, String])] = js.undefined
    
    /**
      * This property affects only one field on ComputedStyle, and can be set
      * directly during inheritance instead of forcing a recalc.
      */
    var ind: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The property will inherit by default if no value is specified.
      * Default to `false`.
      */
    var inh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The interpolable flag indicates whether a property can be animated smoothly.
      * Default to `false`.
      */
    var int: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This specifies all valid keyword values for the property.
      */
    var k: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The resolved value used for getComputedStyle() depends on layout for this
      * property, which means we may need to update layout to return the correct
      * value from getComputedStyle().
      */
    var l: js.UndefOr[Boolean] = js.undefined
    
    var n: String
    
    /**
      * sort before init attributes according to this priority
      */
    var p: js.UndefOr[Double] = js.undefined
    
    /**
      * eg. <color> <paint> <number>
      */
    var syntax: js.UndefOr[String] = js.undefined
  }
  object PropertyMetadata {
    
    inline def apply(n: String): PropertyMetadata = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyMetadata]
    }
    
    extension [Self <: PropertyMetadata](x: Self) {
      
      inline def setA(value: js.Array[String]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setAVarargs(value: String*): Self = StObject.set(x, "a", js.Array(value*))
      
      inline def setD(value: String | (js.Function1[/* nodeName */ String, String])): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDFunction1(value: /* nodeName */ String => String): Self = StObject.set(x, "d", js.Any.fromFunction1(value))
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setInd(value: Boolean): Self = StObject.set(x, "ind", value.asInstanceOf[js.Any])
      
      inline def setIndUndefined: Self = StObject.set(x, "ind", js.undefined)
      
      inline def setInh(value: Boolean): Self = StObject.set(x, "inh", value.asInstanceOf[js.Any])
      
      inline def setInhUndefined: Self = StObject.set(x, "inh", js.undefined)
      
      inline def setInt(value: Boolean): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setIntUndefined: Self = StObject.set(x, "int", js.undefined)
      
      inline def setK(value: js.Array[String]): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      inline def setKVarargs(value: String*): Self = StObject.set(x, "k", js.Array(value*))
      
      inline def setL(value: Boolean): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  trait PropertyParseOptions extends StObject {
    
    var forceUpdateGeometry: Boolean
    
    var skipParse: Boolean
    
    var skipUpdateAttribute: Boolean
    
    var usedAttributes: js.Array[String]
  }
  object PropertyParseOptions {
    
    inline def apply(
      forceUpdateGeometry: Boolean,
      skipParse: Boolean,
      skipUpdateAttribute: Boolean,
      usedAttributes: js.Array[String]
    ): PropertyParseOptions = {
      val __obj = js.Dynamic.literal(forceUpdateGeometry = forceUpdateGeometry.asInstanceOf[js.Any], skipParse = skipParse.asInstanceOf[js.Any], skipUpdateAttribute = skipUpdateAttribute.asInstanceOf[js.Any], usedAttributes = usedAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyParseOptions]
    }
    
    extension [Self <: PropertyParseOptions](x: Self) {
      
      inline def setForceUpdateGeometry(value: Boolean): Self = StObject.set(x, "forceUpdateGeometry", value.asInstanceOf[js.Any])
      
      inline def setSkipParse(value: Boolean): Self = StObject.set(x, "skipParse", value.asInstanceOf[js.Any])
      
      inline def setSkipUpdateAttribute(value: Boolean): Self = StObject.set(x, "skipUpdateAttribute", value.asInstanceOf[js.Any])
      
      inline def setUsedAttributes(value: js.Array[String]): Self = StObject.set(x, "usedAttributes", value.asInstanceOf[js.Any])
      
      inline def setUsedAttributesVarargs(value: String*): Self = StObject.set(x, "usedAttributes", js.Array(value*))
    }
  }
}
