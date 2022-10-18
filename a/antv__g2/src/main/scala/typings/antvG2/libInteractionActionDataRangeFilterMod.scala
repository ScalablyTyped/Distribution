package typings.antvG2

import typings.antvG2.antvG2Strings.dims
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.EventPayload
import typings.antvG2.libInterfaceMod.FilterCondition
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionDataRangeFilterMod {
  
  /**
    * 范围过滤的 Action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/data/range-filter", JSImport.Default)
  @js.native
  open class default () extends RangeFilter
  
  /** range-filter 只用于：brush-filter, brush-x-filter, brush-y-filter */
  @JSImport("@antv/g2/lib/interaction/action/data/range-filter", "BRUSH_FILTER_EVENTS")
  @js.native
  object BRUSH_FILTER_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EVENTS & String] = js.native
    
    /* "brush-filter:afterfilter" */ val AFTER_FILTER: typings.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.AFTER_FILTER & String = js.native
    
    /* "brush-filter:afterreset" */ val AFTER_RESET: typings.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.AFTER_RESET & String = js.native
    
    /* "brush-filter:beforefilter" */ val BEFORE_FILTER: typings.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.BEFORE_FILTER & String = js.native
    
    /* "brush-filter:beforereset" */ val BEFORE_RESET: typings.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.BEFORE_RESET & String = js.native
    
    /* "brush-filter-processing" */ val FILTER: typings.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.FILTER & String = js.native
    
    /* "brush-filter-reset" */ val RESET: typings.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.RESET & String = js.native
  }
  
  @js.native
  sealed trait EVENTS extends StObject
  /** range-filter 只用于：brush-filter, brush-x-filter, brush-y-filter */
  @JSImport("@antv/g2/lib/interaction/action/data/range-filter", "EVENTS")
  @js.native
  object EVENTS extends StObject {
    
    @js.native
    sealed trait AFTER_FILTER
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait AFTER_RESET
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait BEFORE_FILTER
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait BEFORE_RESET
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait FILTER
      extends StObject
         with EVENTS
    
    @js.native
    sealed trait RESET
      extends StObject
         with EVENTS
  }
  
  /**
    * 范围过滤的 Action
    * @ignore
    */
  @js.native
  trait RangeFilter
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /** 允许外部传入 dims */
    /* protected */ @JSName("cfgFields")
    var cfgFields_RangeFilter: js.Array[dims] = js.native
    
    /**
      * 范围过滤生效的字段/维度，可以是 x, y
      */
    /* protected */ var dims: js.Array[String] = js.native
    
    /**
      * 结束
      */
    def end(): Unit = js.native
    
    /**
      * 过滤，以开始的点和当前点对数据进行过滤
      */
    def filter(): Unit = js.native
    
    /**
      * 对 view 进行过滤
      */
    /* protected */ def filterView(view: View, field: String, filter: FilterCondition): Unit = js.native
    
    /* private */ var hasDim: Any = js.native
    
    /* private */ var isStarted: Any = js.native
    
    /**
      * 重新渲染
      * @param view
      */
    /* protected */ def reRender(view: View): Unit = js.native
    /* protected */ def reRender(view: View, payload: EventPayload): Unit = js.native
    
    /**
      * 取消同当前 Action 相关的过滤，指定的 x,y
      */
    def reset(): Unit = js.native
    
    /**
      * 开始范围过滤，记录范围过滤的起点
      */
    def start(): Unit = js.native
    
    /** 起始点 */
    /* protected */ var startPoint: Point = js.native
  }
}
