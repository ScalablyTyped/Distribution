package typings.antvComponent

import typings.antvComponent.anon.PartialReadonlyScrollbarS
import typings.antvComponent.groupComponentMod.default
import typings.antvComponent.interfacesMod.ISlider
import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.interfacesMod.IGroup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarScrollbarMod {
  
  @JSImport("@antv/component/lib/scrollbar/scrollbar", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: ScrollbarTheme = js.native
  
  @JSImport("@antv/component/lib/scrollbar/scrollbar", "Scrollbar")
  @js.native
  class Scrollbar ()
    extends default[ScrollbarCfg]
       with ISlider {
    
    var bindEvents: js.Any = js.native
    
    var bindLaterEvent: js.Any = js.native
    
    @JSName("cfg")
    var cfg_Scrollbar: ScrollbarCfg = js.native
    
    var clearEvents: js.Any = js.native
    
    var draw: js.Any = js.native
    
    var emitOffsetChange: js.Any = js.native
    
    var getContainerDOM: js.Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) & js.Any = js.native
    
    var isMobile: js.Any = js.native
    
    /**
      * 取消监听一个事件，或者一个channel
      * @param evt
      * @param callback
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(): this.type & js.Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String): this.type & js.Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String, callback: js.Function): this.type & js.Any = js.native
    
    /**
      * 监听一个事件
      * @param evt
      * @param callback
      * @param once
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def on(evt: String, callback: js.Function): this.type & js.Any = js.native
    
    var onMouseMove: js.Any = js.native
    
    var onMouseUp: js.Any = js.native
    
    var onStartEvent: js.Any = js.native
    
    var onThumbMouseOut: js.Any = js.native
    
    var onThumbMouseOver: js.Any = js.native
    
    var onTrackClick: js.Any = js.native
    
    var renderThumbShape: js.Any = js.native
    
    var renderTrackShape: js.Any = js.native
    
    var startPos: js.Any = js.native
    
    var updateThumbOffset: js.Any = js.native
    
    var validateRange: js.Any = js.native
  }
  
  trait ScrollbarCfg
    extends StObject
       with GroupComponentCfg {
    
    var isHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var maxLimit: js.UndefOr[Double] = js.undefined
    
    var minLimit: js.UndefOr[Double] = js.undefined
    
    var minThumbLen: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[ScrollbarTheme] = js.undefined
    
    var thumbLen: Double
    
    var thumbOffset: js.UndefOr[Double] = js.undefined
    
    var trackLen: Double
    
    var x: Double
    
    var y: Double
  }
  object ScrollbarCfg {
    
    @scala.inline
    def apply(container: IGroup, thumbLen: Double, trackLen: Double, x: Double, y: Double): ScrollbarCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], thumbLen = thumbLen.asInstanceOf[js.Any], trackLen = trackLen.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarCfg]
    }
    
    @scala.inline
    implicit class ScrollbarCfgMutableBuilder[Self <: ScrollbarCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHorizontal(value: Boolean): Self = StObject.set(x, "isHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHorizontalUndefined: Self = StObject.set(x, "isHorizontal", js.undefined)
      
      @scala.inline
      def setMaxLimit(value: Double): Self = StObject.set(x, "maxLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLimitUndefined: Self = StObject.set(x, "maxLimit", js.undefined)
      
      @scala.inline
      def setMinLimit(value: Double): Self = StObject.set(x, "minLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLimitUndefined: Self = StObject.set(x, "minLimit", js.undefined)
      
      @scala.inline
      def setMinThumbLen(value: Double): Self = StObject.set(x, "minThumbLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinThumbLenUndefined: Self = StObject.set(x, "minThumbLen", js.undefined)
      
      @scala.inline
      def setTheme(value: ScrollbarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setThumbLen(value: Double): Self = StObject.set(x, "thumbLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbOffset(value: Double): Self = StObject.set(x, "thumbOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbOffsetUndefined: Self = StObject.set(x, "thumbOffset", js.undefined)
      
      @scala.inline
      def setTrackLen(value: Double): Self = StObject.set(x, "trackLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollbarStyle extends StObject {
    
    var lineCap: String
    
    var size: Double
    
    var thumbColor: String
    
    var trackColor: String
  }
  object ScrollbarStyle {
    
    @scala.inline
    def apply(lineCap: String, size: Double, thumbColor: String, trackColor: String): ScrollbarStyle = {
      val __obj = js.Dynamic.literal(lineCap = lineCap.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], thumbColor = thumbColor.asInstanceOf[js.Any], trackColor = trackColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarStyle]
    }
    
    @scala.inline
    implicit class ScrollbarStyleMutableBuilder[Self <: ScrollbarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollbarTheme extends StObject {
    
    var default: js.UndefOr[PartialReadonlyScrollbarS] = js.undefined
    
    var hover: js.UndefOr[PartialReadonlyScrollbarS] = js.undefined
  }
  object ScrollbarTheme {
    
    @scala.inline
    def apply(): ScrollbarTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarTheme]
    }
    
    @scala.inline
    implicit class ScrollbarThemeMutableBuilder[Self <: ScrollbarTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: PartialReadonlyScrollbarS): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setHover(value: PartialReadonlyScrollbarS): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
}
