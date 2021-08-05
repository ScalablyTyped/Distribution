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
    
    /* private */ var bindHandlersEvent: js.Any = js.native
    
    /* private */ var bindRailEvent: js.Any = js.native
    
    /* private */ var bindSliderEvent: js.Any = js.native
    
    /* private */ var bindTrackEvent: js.Any = js.native
    
    /* private */ var changeRailLength: js.Any = js.native
    
    /* private */ var changeRailPosition: js.Any = js.native
    
    /* private */ var drawLabel: js.Any = js.native
    
    /* private */ var drawLabels: js.Any = js.native
    
    /* protected */ def drawLegendContent(group: IGroup): Unit = js.native
    
    /* private */ var drawRail: js.Any = js.native
    
    /* private */ var fitRailLength: js.Any = js.native
    
    /* private */ var fixedElements: js.Any = js.native
    
    /* private */ var fixedHorizontal: js.Any = js.native
    
    /* private */ var fixedVertail: js.Any = js.native
    
    /* private */ var getClipTrackAttrs: js.Any = js.native
    
    /* private */ var getCurrentValue: js.Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) & js.Any = js.native
    
    /* private */ var getHandlerPath: js.Any = js.native
    
    /* private */ var getLabelAlignAttrs: js.Any = js.native
    
    /* private */ var getPointByValue: js.Any = js.native
    
    /* private */ var getRailBBox: js.Any = js.native
    
    /* private */ var getRailCanvasBBox: js.Any = js.native
    
    /* private */ var getRailPath: js.Any = js.native
    
    /* private */ var getRailShape: js.Any = js.native
    
    /* private */ var getTrackAttrs: js.Any = js.native
    
    /* private */ var getTrackColor: js.Any = js.native
    
    /* private */ var getTrackPath: js.Any = js.native
    
    /* private */ var getValueByCanvasPoint: js.Any = js.native
    
    /* private */ var isVertical: js.Any = js.native
    
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
    
    /* private */ var resetHandler: js.Any = js.native
    
    /* private */ var resetHandlers: js.Any = js.native
    
    /* private */ var resetTrack: js.Any = js.native
    
    /* private */ var resetTrackClip: js.Any = js.native
    
    def setRange(min: js.Any, max: js.Any): Unit = js.native
  }
}
