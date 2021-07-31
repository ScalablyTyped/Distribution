package typings.antvComponent

import typings.antvComponent.interfacesMod.ISlider
import typings.antvComponent.typesMod.ContinueLegendCfg
import typings.antvEventEmitter.mod.EventType
import typings.antvGBase.interfacesMod.IGroup
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object continuousMod {
  
  @JSImport("@antv/component/lib/legend/continuous", JSImport.Default)
  @js.native
  class default () extends ContinueLegend
  
  @js.native
  trait ContinueLegend
    extends typings.antvComponent.legendBaseMod.default[ContinueLegendCfg]
       with ISlider {
    
    var bindHandlersEvent: js.Any = js.native
    
    var bindRailEvent: js.Any = js.native
    
    var bindSliderEvent: js.Any = js.native
    
    var bindTrackEvent: js.Any = js.native
    
    var changeRailLength: js.Any = js.native
    
    var changeRailPosition: js.Any = js.native
    
    var drawLabel: js.Any = js.native
    
    var drawLabels: js.Any = js.native
    
    /* protected */ def drawLegendContent(group: IGroup): Unit = js.native
    
    var drawRail: js.Any = js.native
    
    var fitRailLength: js.Any = js.native
    
    var fixedElements: js.Any = js.native
    
    var fixedHorizontal: js.Any = js.native
    
    var fixedVertail: js.Any = js.native
    
    var getClipTrackAttrs: js.Any = js.native
    
    var getCurrentValue: js.Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) & js.Any = js.native
    
    var getHandlerPath: js.Any = js.native
    
    var getLabelAlignAttrs: js.Any = js.native
    
    var getPointByValue: js.Any = js.native
    
    var getRailBBox: js.Any = js.native
    
    var getRailCanvasBBox: js.Any = js.native
    
    var getRailPath: js.Any = js.native
    
    var getRailShape: js.Any = js.native
    
    var getTrackAttrs: js.Any = js.native
    
    var getTrackColor: js.Any = js.native
    
    var getTrackPath: js.Any = js.native
    
    var getValueByCanvasPoint: js.Any = js.native
    
    var isVertical: js.Any = js.native
    
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
    
    var resetHandler: js.Any = js.native
    
    var resetHandlers: js.Any = js.native
    
    var resetTrack: js.Any = js.native
    
    var resetTrackClip: js.Any = js.native
    
    def setRange(min: js.Any, max: js.Any): Unit = js.native
  }
}
