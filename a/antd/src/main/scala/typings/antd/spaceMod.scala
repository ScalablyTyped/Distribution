package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.baseline
import typings.antd.antdStrings.center
import typings.antd.antdStrings.end
import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.start
import typings.antd.antdStrings.vertical
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spaceMod extends Shortcut {
  
  @JSImport("antd/lib/space", JSImport.Default)
  @js.native
  val default: FC[SpaceProps] = js.native
  
  @JSImport("antd/lib/space", "LastIndexContext")
  @js.native
  val LastIndexContext: Context[Double] = js.native
  
  trait SpaceProps extends StObject {
    
    var align: js.UndefOr[start | end | center | baseline] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[SizeType | Double] = js.undefined
    
    var split: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SpaceProps {
    
    @scala.inline
    def apply(): SpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceProps]
    }
    
    @scala.inline
    implicit class SpacePropsMutableBuilder[Self <: SpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | end | center | baseline): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: ReactNode): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[SpaceProps]
  
  /* This means you don't have to write `default`, but can instead just say `spaceMod.foo` */
  override def _to: FC[SpaceProps] = default
}
