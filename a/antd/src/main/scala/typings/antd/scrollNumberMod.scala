package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollNumberMod extends Shortcut {
  
  @JSImport("antd/lib/badge/ScrollNumber", JSImport.Default)
  @js.native
  val default: FC[ScrollNumberProps] = js.native
  
  trait ScrollNumberProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[String | Double | Null] = js.undefined
    
    var onAnimated: js.UndefOr[js.Function] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var show: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String | Double | Null] = js.undefined
  }
  object ScrollNumberProps {
    
    @scala.inline
    def apply(show: Boolean): ScrollNumberProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollNumberProps]
    }
    
    @scala.inline
    implicit class ScrollNumberPropsMutableBuilder[Self <: ScrollNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setCount(value: String | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setOnAnimated(value: js.Function): Self = StObject.set(x, "onAnimated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimatedUndefined: Self = StObject.set(x, "onAnimated", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ScrollNumberState extends StObject {
    
    var animateStarted: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[String | Double | Null] = js.undefined
  }
  object ScrollNumberState {
    
    @scala.inline
    def apply(): ScrollNumberState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollNumberState]
    }
    
    @scala.inline
    implicit class ScrollNumberStateMutableBuilder[Self <: ScrollNumberState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateStarted(value: Boolean): Self = StObject.set(x, "animateStarted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateStartedUndefined: Self = StObject.set(x, "animateStarted", js.undefined)
      
      @scala.inline
      def setCount(value: String | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  type _To = FC[ScrollNumberProps]
  
  /* This means you don't have to write `default`, but can instead just say `scrollNumberMod.foo` */
  override def _to: FC[ScrollNumberProps] = default
}
