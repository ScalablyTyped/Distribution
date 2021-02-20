package typings.amapJsApiControlBar

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApiControlBar.amapJsApiControlBarStrings.hide
import typings.amapJsApiControlBar.amapJsApiControlBarStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait ControlBar extends EventEmitter {
    
    def hide(): Unit = js.native
    
    // internal
    def show(): Unit = js.native
  }
  object ControlBar {
    
    @js.native
    trait EventMap extends StObject {
      
      var hide: Event_[
            typings.amapJsApiControlBar.amapJsApiControlBarStrings.hide, 
            js.UndefOr[scala.Nothing]
          ] = js.native
      
      var show: Event_[
            typings.amapJsApiControlBar.amapJsApiControlBarStrings.show, 
            js.UndefOr[scala.Nothing]
          ] = js.native
    }
    object EventMap {
      
      @scala.inline
      def apply(hide: Event_[hide, js.UndefOr[scala.Nothing]], show: Event_[show, js.UndefOr[scala.Nothing]]): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHide(value: Event_[hide, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShow(value: Event_[show, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Options extends StObject {
      
      /**
        * 显示位置
        */
      var position: js.UndefOr[Position] = js.native
      
      /**
        * 是否显示倾斜、旋转按钮
        */
      var showControlButton: js.UndefOr[Boolean] = js.native
      
      /**
        * 是否显示缩放按钮
        */
      var showZoomBar: js.UndefOr[Boolean] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setShowControlButton(value: Boolean): Self = StObject.set(x, "showControlButton", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowControlButtonUndefined: Self = StObject.set(x, "showControlButton", js.undefined)
        
        @scala.inline
        def setShowZoomBar(value: Boolean): Self = StObject.set(x, "showZoomBar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowZoomBarUndefined: Self = StObject.set(x, "showZoomBar", js.undefined)
      }
    }
    
    @js.native
    trait Position extends StObject {
      
      var bottom: js.UndefOr[String] = js.native
      
      var left: js.UndefOr[String] = js.native
      
      var right: js.UndefOr[String] = js.native
      
      var top: js.UndefOr[String] = js.native
    }
    object Position {
      
      @scala.inline
      def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      @scala.inline
      implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        @scala.inline
        def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
  }
}
