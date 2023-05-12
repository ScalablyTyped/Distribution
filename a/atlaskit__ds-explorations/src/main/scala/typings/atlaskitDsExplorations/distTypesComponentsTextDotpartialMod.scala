package typings.atlaskitDsExplorations

import org.scalablytyped.runtime.Shortcut
import typings.atlaskitDsExplorations.distTypesComponentsTypesMod.BasePrimitiveProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsTextDotpartialMod extends Shortcut {
  
  /**
    * __Text__
    *
    * Text is a primitive component that has the Atlassian Design System's design guidelines baked in.
    * This includes considerations for text attributes such as color, font size, font weight, and line height.
    * It renders a `span` by default.
    *
    * @internal
    */
  @JSImport("@atlaskit/ds-explorations/dist/types/components/text.partial", JSImport.Default)
  @js.native
  val default: FC[TextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.span
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.div
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.p
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.strong
  */
  trait AsElement extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Monospace */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.monospace
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sans
  */
  trait FontFamily extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Size050 */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot050
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot075
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot100
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot200
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot300
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot400
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot500
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.sizeDot600
  */
  trait FontSize extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Medium */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.bold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.medium
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.regular
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.semibold
  */
  trait FontWeight extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.LineHeight100 */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lineHeightDot100
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lineHeightDot200
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lineHeightDot300
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lineHeightDot400
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lineHeightDot500
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lineHeightDot600
  */
  trait LineHeight extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Start */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.center
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.end
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.start
  */
  trait TextAlign extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Brand */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.colorDottext
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.disabled
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.inverse
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.selected
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.brand
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.danger
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.warning
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.warningDotinverse
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.success
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.discovery
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.information
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.subtlest
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.subtle
  */
  trait TextColor extends StObject
  
  trait TextProps
    extends StObject
       with BasePrimitiveProps {
    
    /**
      * HTML tag to be rendered. Defaults to `span`.
      */
    var as: js.UndefOr[AsElement] = js.undefined
    
    /**
      * Elements rendered within the Text element
      */
    var children: ReactNode
    
    /**
      * Text color
      */
    var color: js.UndefOr[TextColor] = js.undefined
    
    /**
      * Font size https://developer.mozilla.org/en-US/docs/Web/CSS/font-size
      */
    var fontSize: js.UndefOr[FontSize] = js.undefined
    
    /**
      * Font weight https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight
      */
    var fontWeight: js.UndefOr[FontWeight] = js.undefined
    
    /**
      * The HTML id attribute https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/id
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Line height https://developer.mozilla.org/en-US/docs/Web/CSS/line-height
      */
    var lineHeight: js.UndefOr[LineHeight] = js.undefined
    
    /**
      * Truncates text with an ellipsis when text overflows its parent container
      * (i.e. `width` has been set on parent that is shorter than text length).
      */
    var shouldTruncate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text align https://developer.mozilla.org/en-US/docs/Web/CSS/text-align
      */
    var textAlign: js.UndefOr[TextAlign] = js.undefined
    
    /**
      * Text transform https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform
      */
    var textTransform: js.UndefOr[TextTransform] = js.undefined
    
    /**
      * Vertical align https://developer.mozilla.org/en-US/docs/Web/CSS/vertical-align
      */
    var verticalAlign: js.UndefOr[VerticalAlign] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: AsElement): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: TextColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontSize(value: FontSize): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLineHeight(value: LineHeight): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setShouldTruncate(value: Boolean): Self = StObject.set(x, "shouldTruncate", value.asInstanceOf[js.Any])
      
      inline def setShouldTruncateUndefined: Self = StObject.set(x, "shouldTruncate", js.undefined)
      
      inline def setTextAlign(value: TextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextTransform(value: TextTransform): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setVerticalAlign(value: VerticalAlign): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
  
  /* keyof @atlaskit/ds-explorations.anon.Lowercase */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.none
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.lowercase
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.uppercase
  */
  trait TextTransform extends StObject
  
  /* keyof @atlaskit/ds-explorations.anon.Bottom */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.top
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.middle
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.bottom
  */
  trait VerticalAlign extends StObject
  
  type _To = FC[TextProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsTextDotpartialMod.foo` */
  override def _to: FC[TextProps] = default
}
