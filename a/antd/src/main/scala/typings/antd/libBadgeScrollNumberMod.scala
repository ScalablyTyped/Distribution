package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBadgeScrollNumberMod extends Shortcut {
  
  @JSImport("antd/lib/badge/ScrollNumber", JSImport.Default)
  @js.native
  val default: FC[ScrollNumberProps] = js.native
  
  trait ScrollNumberProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[String | Double | Null] = js.undefined
    
    var motionClassName: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var show: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String | Double | Null] = js.undefined
  }
  object ScrollNumberProps {
    
    inline def apply(show: Boolean): ScrollNumberProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollNumberProps]
    }
    
    extension [Self <: ScrollNumberProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setCount(value: String | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMotionClassName(value: String): Self = StObject.set(x, "motionClassName", value.asInstanceOf[js.Any])
      
      inline def setMotionClassNameUndefined: Self = StObject.set(x, "motionClassName", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String | Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ScrollNumberState extends StObject {
    
    var animateStarted: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[String | Double | Null] = js.undefined
  }
  object ScrollNumberState {
    
    inline def apply(): ScrollNumberState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollNumberState]
    }
    
    extension [Self <: ScrollNumberState](x: Self) {
      
      inline def setAnimateStarted(value: Boolean): Self = StObject.set(x, "animateStarted", value.asInstanceOf[js.Any])
      
      inline def setAnimateStartedUndefined: Self = StObject.set(x, "animateStarted", js.undefined)
      
      inline def setCount(value: String | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    }
  }
  
  type _To = FC[ScrollNumberProps]
  
  /* This means you don't have to write `default`, but can instead just say `libBadgeScrollNumberMod.foo` */
  override def _to: FC[ScrollNumberProps] = default
}
