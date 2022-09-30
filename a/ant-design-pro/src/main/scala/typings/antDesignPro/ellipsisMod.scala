package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsisMod {
  
  @JSImport("ant-design-pro/lib/Ellipsis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ant-design-pro/lib/Ellipsis", JSImport.Default)
  @js.native
  open class default () extends Component[EllipsisProps, Any, Any]
  
  inline def cutStrByFullLength(str: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cutStrByFullLength")(str.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStrFullLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrFullLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Ellipsis = Component[EllipsisProps, Any, Any]
  
  trait EllipsisProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var fullWidthRecognition: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tooltip: js.UndefOr[Boolean | EllipsisTooltipProps] = js.undefined
  }
  object EllipsisProps {
    
    inline def apply(): EllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisProps]
    }
    
    extension [Self <: EllipsisProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFullWidthRecognition(value: Boolean): Self = StObject.set(x, "fullWidthRecognition", value.asInstanceOf[js.Any])
      
      inline def setFullWidthRecognitionUndefined: Self = StObject.set(x, "fullWidthRecognition", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTooltip(value: Boolean | EllipsisTooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/lib/tooltip.TooltipPropsWithTitle | antd.antd/lib/tooltip.TooltipPropsWithOverlay */ trait EllipsisTooltipProps extends StObject {
    
    var overlayStyle: Unit
    
    var title: Unit
  }
  object EllipsisTooltipProps {
    
    inline def apply(overlayStyle: Unit, title: Unit): EllipsisTooltipProps = {
      val __obj = js.Dynamic.literal(overlayStyle = overlayStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisTooltipProps]
    }
    
    extension [Self <: EllipsisTooltipProps](x: Self) {
      
      inline def setOverlayStyle(value: Unit): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Unit): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
