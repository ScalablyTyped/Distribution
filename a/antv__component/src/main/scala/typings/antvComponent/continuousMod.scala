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
  open class default () extends ContinueLegend
  
  @js.native
  trait ContinueLegend
    extends typings.antvComponent.legendBaseMod.default[ContinueLegendCfg]
       with ISlider {
    
    /* private */ var bindHandlersEvent: Any = js.native
    
    /* private */ var bindRailEvent: Any = js.native
    
    /* private */ var bindSliderEvent: Any = js.native
    
    /* private */ var bindTrackEvent: Any = js.native
    
    /* private */ var changeRailLength: Any = js.native
    
    /* private */ var changeRailPosition: Any = js.native
    
    /* private */ var drawLabel: Any = js.native
    
    /* private */ var drawLabels: Any = js.native
    
    /* protected */ def drawLegendContent(group: IGroup): Unit = js.native
    
    /* private */ var drawRail: Any = js.native
    
    /* private */ var fitRailLength: Any = js.native
    
    /* private */ var fixedElements: Any = js.native
    
    /* private */ var fixedHorizontal: Any = js.native
    
    /* private */ var fixedVertail: Any = js.native
    
    /* private */ var getClipTrackAttrs: Any = js.native
    
    /* private */ var getCurrentValue: Any = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def getEvents(): (Record[String, js.Array[EventType]]) & Any = js.native
    
    /* private */ var getHandlerPath: Any = js.native
    
    /* private */ var getLabelAlignAttrs: Any = js.native
    
    /* private */ var getPointByValue: Any = js.native
    
    /* private */ var getRailBBox: Any = js.native
    
    /* private */ var getRailCanvasBBox: Any = js.native
    
    /* private */ var getRailPath: Any = js.native
    
    /* private */ var getRailShape: Any = js.native
    
    /* private */ var getTrackAttrs: Any = js.native
    
    /* private */ var getTrackColor: Any = js.native
    
    /* private */ var getTrackPath: Any = js.native
    
    /* private */ var getValueByCanvasPoint: Any = js.native
    
    /* private */ var isVertical: Any = js.native
    
    /**
      * 取消监听一个事件，或者一个channel
      * @param evt
      * @param callback
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(): this.type & Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String): this.type & Any = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def off(evt: String, callback: js.Function): this.type & Any = js.native
    
    /**
      * 监听一个事件
      * @param evt
      * @param callback
      * @param once
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def on(evt: String, callback: js.Function): this.type & Any = js.native
    
    /* private */ var resetHandler: Any = js.native
    
    /* private */ var resetHandlers: Any = js.native
    
    /* private */ var resetTrack: Any = js.native
    
    /* private */ var resetTrackClip: Any = js.native
    
    def setRange(min: Any, max: Any): Unit = js.native
  }
}
