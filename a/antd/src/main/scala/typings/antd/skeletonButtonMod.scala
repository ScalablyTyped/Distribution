package typings.antd

import typings.antd.anon.SizeString
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.round
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonButtonMod {
  
  object default {
    
    @scala.inline
    def apply(props: SkeletonButtonProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/skeleton/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/skeleton/Button", "default.defaultProps")
    @js.native
    def defaultProps: SizeString = js.native
    @scala.inline
    def defaultProps_=(x: SizeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<antd.antd/lib/skeleton/Element.SkeletonElementProps, 'size'> */
  trait SkeletonButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[circle | square | round] = js.undefined
    
    var size: js.UndefOr[large | small | default] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SkeletonButtonProps {
    
    @scala.inline
    def apply(): SkeletonButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonButtonProps]
    }
    
    @scala.inline
    implicit class SkeletonButtonPropsMutableBuilder[Self <: SkeletonButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShape(value: circle | square | round): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: large | small | default): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
