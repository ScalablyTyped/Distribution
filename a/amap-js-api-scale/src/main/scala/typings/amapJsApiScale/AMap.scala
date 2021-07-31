package typings.amapJsApiScale

import typings.amapJsApi.AMap.EventEmitter
import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiScale.AMap.Scale.Position
import typings.amapJsApiScale.amapJsApiScaleStrings.hide
import typings.amapJsApiScale.amapJsApiScaleStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  /**
    * 比例尺插件
    */
  @js.native
  trait Scale
    extends StObject
       with EventEmitter {
    
    /**
      * 隐藏比例尺
      */
    def hide(): Unit = js.native
    
    /**
      * 相对于地图容器左上角的偏移量
      */
    var offset: Pixel = js.native
    
    /**
      * 控件停靠位置
      */
    var position: Position = js.native
    
    /**
      * 显示比例尺
      */
    def show(): Unit = js.native
    
    /**
      * 是否可见
      */
    var visible: Boolean = js.native
  }
  object Scale {
    
    trait EventMap extends StObject {
      
      var hide: Event_[typings.amapJsApiScale.amapJsApiScaleStrings.hide, Unit]
      
      var show: Event_[typings.amapJsApiScale.amapJsApiScaleStrings.show, Unit]
    }
    object EventMap {
      
      @scala.inline
      def apply(hide: Event_[hide, Unit], show: Event_[show, Unit]): EventMap = {
        val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
        __obj.asInstanceOf[EventMap]
      }
      
      @scala.inline
      implicit class EventMapMutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHide(value: Event_[hide, Unit]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShow(value: Event_[show, Unit]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 相对于地图容器左上角的偏移量
        */
      var offset: js.UndefOr[Pixel] = js.undefined
      
      /**
        * 控件停靠位置
        * LT:左上角;
        * RT:右上角;
        * LB:左下角;
        * RB:右下角;
        * 默认位置：LB
        */
      var position: js.UndefOr[Position] = js.undefined
      
      /**
        * 是否可见
        */
      var visible: js.UndefOr[Boolean] = js.undefined
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
        def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.amapJsApiScale.amapJsApiScaleStrings.LT
      - typings.amapJsApiScale.amapJsApiScaleStrings.RT
      - typings.amapJsApiScale.amapJsApiScaleStrings.LB
      - typings.amapJsApiScale.amapJsApiScaleStrings.RB
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def LB: typings.amapJsApiScale.amapJsApiScaleStrings.LB = "LB".asInstanceOf[typings.amapJsApiScale.amapJsApiScaleStrings.LB]
      
      @scala.inline
      def LT: typings.amapJsApiScale.amapJsApiScaleStrings.LT = "LT".asInstanceOf[typings.amapJsApiScale.amapJsApiScaleStrings.LT]
      
      @scala.inline
      def RB: typings.amapJsApiScale.amapJsApiScaleStrings.RB = "RB".asInstanceOf[typings.amapJsApiScale.amapJsApiScaleStrings.RB]
      
      @scala.inline
      def RT: typings.amapJsApiScale.amapJsApiScaleStrings.RT = "RT".asInstanceOf[typings.amapJsApiScale.amapJsApiScaleStrings.RT]
    }
  }
}
