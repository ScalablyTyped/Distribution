package typings.antd

import typings.antd.anon.SizeString
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonInputMod {
  
  object default {
    
    @JSImport("antd/lib/skeleton/Input", JSImport.Default)
    @js.native
    def apply(props: SkeletonInputProps): Element = js.native
    @JSImport("antd/lib/skeleton/Input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/skeleton/Input", "default.defaultProps")
    @js.native
    def defaultProps: SizeString = js.native
    @scala.inline
    def defaultProps_=(x: SizeString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<antd.antd/lib/skeleton/Element.SkeletonElementProps, 'size' | 'shape'> */
  @js.native
  trait SkeletonInputProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[large | small | default] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object SkeletonInputProps {
    
    @scala.inline
    def apply(): SkeletonInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonInputProps]
    }
    
    @scala.inline
    implicit class SkeletonInputPropsMutableBuilder[Self <: SkeletonInputProps] (val x: Self) extends AnyVal {
      
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
