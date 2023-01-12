package typings.amapJsApiControlBar

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApiControlBar.amapJsApiControlBarStrings.hide
import typings.amapJsApiControlBar.amapJsApiControlBarStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait ControlBar
    extends StObject
       with EventEmitter {
    
    def hide(): Unit = js.native
    
    // internal
    def show(): Unit = js.native
  }
  object ControlBar {
    
    trait EventMap extends StObject {
      
      var hide: Event_[typings.amapJsApiControlBar.amapJsApiControlBarStrings.hide, Unit]
      
      var show: Event_[typings.amapJsApiControlBar.amapJsApiControlBarStrings.show, Unit]
    }
    object EventMap {
      
      inline def apply(hide: Event_[hide, Unit], show: Event_[show, Unit]): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        inline def setHide(value: Event_[hide, Unit]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        inline def setShow(value: Event_[show, Unit]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 显示位置
        */
      var position: js.UndefOr[Position] = js.undefined
      
      /**
        * 是否显示倾斜、旋转按钮
        */
      var showControlButton: js.UndefOr[Boolean] = js.undefined
      
      /**
        * 是否显示缩放按钮
        */
      var showZoomBar: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setShowControlButton(value: Boolean): Self = StObject.set(x, "showControlButton", value.asInstanceOf[js.Any])
        
        inline def setShowControlButtonUndefined: Self = StObject.set(x, "showControlButton", js.undefined)
        
        inline def setShowZoomBar(value: Boolean): Self = StObject.set(x, "showZoomBar", value.asInstanceOf[js.Any])
        
        inline def setShowZoomBarUndefined: Self = StObject.set(x, "showZoomBar", js.undefined)
      }
    }
    
    trait Position extends StObject {
      
      var bottom: js.UndefOr[String] = js.undefined
      
      var left: js.UndefOr[String] = js.undefined
      
      var right: js.UndefOr[String] = js.undefined
      
      var top: js.UndefOr[String] = js.undefined
    }
    object Position {
      
      inline def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
        
        inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
  }
}
