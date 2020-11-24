package typings.antvComponent.scrollbarScrollbarMod

import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.interfacesMod.ISlider
import typings.antvEventEmitter.mod.EventType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/scrollbar/scrollbar", "Scrollbar")
@js.native
class Scrollbar ()
  extends GroupComponent[ScrollbarCfg]
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
  override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
  
  var isMobile: js.Any = js.native
  
  /**
    * 移除事件
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(): js.Any with this.type = js.native
  /**
    * 移除事件
    * @param eventName 事件名
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(eventName: String): js.Any with this.type = js.native
  /**
    * 移除事件
    * @param eventName 事件名
    * @param callback  回调函数
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def off(eventName: String, callback: js.Function): js.Any with this.type = js.native
  
  /**
    * 绑定事件
    * @param  eventName 事件名
    * @param callback  回调函数
    */
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def on(eventName: String, callback: js.Function): js.Any with this.type = js.native
  
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
