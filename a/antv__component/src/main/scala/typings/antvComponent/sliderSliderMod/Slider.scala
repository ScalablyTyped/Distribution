package typings.antvComponent.sliderSliderMod

import typings.antvComponent.anon.PartialSliderCfg
import typings.antvComponent.groupComponentMod.GroupComponent
import typings.antvComponent.interfacesMod.ISlider
import typings.antvEventEmitter.mod.EventType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/slider/slider", "Slider")
@js.native
class Slider ()
  extends GroupComponent[SliderCfg]
     with ISlider {
  
  /**
    * 调整 text 的位置，自动躲避
    * 根据位置，调整返回新的位置
    * @param range
    */
  var _dodgeText: js.Any = js.native
  
  /**
    * 调整 offsetRange，因为一些范围的限制
    * @param offsetRange
    */
  var adjustOffsetRange: js.Any = js.native
  
  var bindEvents: js.Any = js.native
  
  @JSName("cfg")
  var cfg_Slider: SliderCfg = js.native
  
  var currentTarget: js.Any = js.native
  
  def draw(): Unit = js.native
  
  var getContainerDOM: js.Any = js.native
  
  /* InferMemberOverrides */
  /* InferMemberOverrides */
  override def getEvents(): js.Any with (Record[String, js.Array[EventType]]) = js.native
  
  var maxHandler: js.Any = js.native
  
  var minHandler: js.Any = js.native
  
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
  
  var onMouseDown: js.Any = js.native
  
  var onMouseMove: js.Any = js.native
  
  var onMouseUp: js.Any = js.native
  
  var prevX: js.Any = js.native
  
  var prevY: js.Any = js.native
  
  var trend: js.Any = js.native
  
  def update(cfg: PartialSliderCfg): Unit = js.native
  
  var updateStartEnd: js.Any = js.native
  
  var updateUI: js.Any = js.native
}
