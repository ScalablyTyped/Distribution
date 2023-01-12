package typings.antvComponent

import typings.antvComponent.anon.PartialReadonlyScrollbarS
import typings.antvComponent.anon.PickReadonlyScrollbarStyl
import typings.antvComponent.libAbstractGroupComponentMod.default
import typings.antvComponent.libInterfacesMod.ISlider
import typings.antvComponent.libTypesMod.GroupComponentCfg
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.libInterfacesMod.IGroup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScrollbarScrollbarMod {
  
  @JSImport("@antv/component/lib/scrollbar/scrollbar", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: ScrollbarTheme = js.native
  
  @JSImport("@antv/component/lib/scrollbar/scrollbar", "Scrollbar")
  @js.native
  open class Scrollbar ()
    extends default[ScrollbarCfg]
       with ISlider {
    
    /* private */ var bindEvents: Any = js.native
    
    /* private */ var bindLaterEvent: Any = js.native
    
    @JSName("cfg")
    var cfg_Scrollbar: ScrollbarCfg = js.native
    
    /* private */ var clearEvents: Any = js.native
    
    /* private */ var draw: Any = js.native
    
    /* private */ var emitOffsetChange: Any = js.native
    
    /* private */ var getContainerDOM: Any = js.native
    
    /* InferMemberOverrides */
    override def getEvents(): Any & (Record[String, js.Array[EventType]]) = js.native
    
    /* private */ var isMobile: Any = js.native
    
    /**
      * 移除事件
      */
    /* InferMemberOverrides */
    override def off(): Any & this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      */
    /* InferMemberOverrides */
    override def off(eventName: String): Any & this.type = js.native
    /**
      * 移除事件
      * @param eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def off(eventName: String, callback: js.Function): Any & this.type = js.native
    
    /**
      * 绑定事件
      * @param  eventName 事件名
      * @param callback  回调函数
      */
    /* InferMemberOverrides */
    override def on(eventName: String, callback: js.Function): Any & this.type = js.native
    
    /* private */ var onMouseMove: Any = js.native
    
    /* private */ var onMouseUp: Any = js.native
    
    /* private */ var onStartEvent: Any = js.native
    
    /* private */ var onThumbMouseOut: Any = js.native
    
    /* private */ var onThumbMouseOver: Any = js.native
    
    /* private */ var onTrackClick: Any = js.native
    
    /* private */ var renderThumbShape: Any = js.native
    
    /* private */ var renderTrackShape: Any = js.native
    
    /* private */ var startPos: Any = js.native
    
    /* private */ var updateThumbOffset: Any = js.native
    
    /* private */ var validateRange: Any = js.native
  }
  
  trait ScrollbarCfg
    extends StObject
       with GroupComponentCfg {
    
    var isHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var maxLimit: js.UndefOr[Double] = js.undefined
    
    var minLimit: js.UndefOr[Double] = js.undefined
    
    var minThumbLen: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[ScrollbarTheme] = js.undefined
    
    var thumbLen: Double
    
    var thumbOffset: js.UndefOr[Double] = js.undefined
    
    var trackLen: Double
    
    var x: Double
    
    var y: Double
  }
  object ScrollbarCfg {
    
    inline def apply(container: IGroup, thumbLen: Double, trackLen: Double, x: Double, y: Double): ScrollbarCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], thumbLen = thumbLen.asInstanceOf[js.Any], trackLen = trackLen.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarCfg] (val x: Self) extends AnyVal {
      
      inline def setIsHorizontal(value: Boolean): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      inline def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      inline def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      inline def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      inline def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      inline def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      inline def setMinThumbLen(value: Double): Self = StObject.set(x, "minThumbLen", value.asInstanceOf[js.Any])
      
      inline def setMinThumbLenUndefined: Self = StObject.set(x, "minThumbLen", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: ScrollbarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setThumbLen(value: Double): Self = StObject.set(x, "thumbLen", value.asInstanceOf[js.Any])
      
      inline def setThumbOffset(value: Double): Self = StObject.set(x, "thumbOffset", value.asInstanceOf[js.Any])
      
      inline def setThumbOffsetUndefined: Self = StObject.set(x, "thumbOffset", js.undefined)
      
      inline def setTrackLen(value: Double): Self = StObject.set(x, "trackLen", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollbarStyle extends StObject {
    
    var lineCap: String
    
    var size: Double
    
    var thumbColor: String
    
    var trackColor: String
  }
  object ScrollbarStyle {
    
    inline def apply(lineCap: String, size: Double, thumbColor: String, trackColor: String): ScrollbarStyle = {
      val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbColor = thumbColor.asInstanceOf[js.Any], trackColor = trackColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarStyle] (val x: Self) extends AnyVal {
      
      inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      inline def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollbarTheme extends StObject {
    
    var default: js.UndefOr[PartialReadonlyScrollbarS] = js.undefined
    
    var hover: js.UndefOr[PickReadonlyScrollbarStyl] = js.undefined
  }
  object ScrollbarTheme {
    
    inline def apply(): ScrollbarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarTheme] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PartialReadonlyScrollbarS): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setHover(value: PickReadonlyScrollbarStyl): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
}
