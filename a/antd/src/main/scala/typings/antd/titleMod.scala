package typings.antd

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("antd/lib/skeleton/Title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasPrefixClsClassNameWidthStyle: SkeletonTitleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasPrefixClsClassNameWidthStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SkeletonTitleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object SkeletonTitleProps {
    
    @scala.inline
    def apply(): SkeletonTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonTitleProps]
    }
    
    @scala.inline
    implicit class SkeletonTitlePropsMutableBuilder[Self <: SkeletonTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
