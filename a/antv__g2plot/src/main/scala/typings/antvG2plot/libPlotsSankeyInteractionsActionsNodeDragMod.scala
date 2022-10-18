package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsSankeyInteractionsActionsNodeDragMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action * / any */ @JSImport("@antv/g2plot/lib/plots/sankey/interactions/actions/node-drag", "SankeyNodeDragAction")
  @js.native
  open class SankeyNodeDragAction () extends StObject {
    
    /**
      * 当前拖拽的 element 索引
      */
    /* private */ var currentElementIdx: Any = js.native
    
    /**
      * 结论，清除状态
      */
    def end(): Unit = js.native
    
    /**
      * 获取当前操作的 index
      * @param element
      */
    /* private */ var getCurrentDatumIdx: Any = js.native
    
    /* private */ var getEdgeView: Any = js.native
    
    /* private */ var getNodeView: Any = js.native
    
    /**
      * 是否在拖拽中的标记
      */
    /* private */ var isDragging: Any = js.native
    
    /**
      * 当前操作的是否是 element
      */
    /* private */ var isNodeElement: Any = js.native
    
    /**
      * 之前的边动画配置
      */
    /* private */ var prevEdgeAnimateCfg: Any = js.native
    
    /**
      * 之前的节点动画配置
      */
    /* private */ var prevNodeAnimateCfg: Any = js.native
    
    /**
      * 鼠标上一次的位置的坐标点
      */
    /* private */ var prevPoint: Any = js.native
    
    /**
      * 点击下去，开始
      */
    def start(): Unit = js.native
    
    /**
      * 移动过程中，平移
      */
    def translate(): Unit = js.native
  }
}
