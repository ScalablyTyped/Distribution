package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsisMod {
  
  @JSImport("ant-design-pro/lib/Ellipsis", JSImport.Default)
  @js.native
  class default ()
    extends Component[EllipsisProps, js.Any, js.Any]
  
  @JSImport("ant-design-pro/lib/Ellipsis", "cutStrByFullLength")
  @js.native
  def cutStrByFullLength(str: String, maxLength: Double): String = js.native
  
  @JSImport("ant-design-pro/lib/Ellipsis", "getStrFullLength")
  @js.native
  def getStrFullLength(str: String): Double = js.native
  
  type Ellipsis = Component[EllipsisProps, js.Any, js.Any]
  
  @js.native
  trait EllipsisProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var fullWidthRecognition: js.UndefOr[Boolean] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var lines: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tooltip: js.UndefOr[Boolean | EllipsisTooltipProps] = js.native
  }
  object EllipsisProps {
    
    @scala.inline
    def apply(): EllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisProps]
    }
    
    @scala.inline
    implicit class EllipsisPropsMutableBuilder[Self <: EllipsisProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFullWidthRecognition(value: Boolean): Self = StObject.set(x, "fullWidthRecognition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthRecognitionUndefined: Self = StObject.set(x, "fullWidthRecognition", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean | EllipsisTooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/lib/tooltip.TooltipPropsWithTitle | antd.antd/lib/tooltip.TooltipPropsWithOverlay */ @js.native
  trait EllipsisTooltipProps extends StObject {
    
    var overlayStyle: js.UndefOr[scala.Nothing] = js.native
    
    var title: js.UndefOr[scala.Nothing] = js.native
  }
}
