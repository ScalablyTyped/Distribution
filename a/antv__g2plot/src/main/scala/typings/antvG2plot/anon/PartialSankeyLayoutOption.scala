package typings.antvG2plot.anon

import typings.antvG2plot.libPlotsSankeyLayoutMod.NodeAlign
import typings.antvG2plot.libPlotsSankeyLayoutMod.NodeDepth
import typings.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2plot.@antv/g2plot/lib/plots/sankey/layout.SankeyLayoutOptions> & @antv/g2plot.@antv/g2plot/lib/plots/sankey/layout.SankeyLayoutOptions */
trait PartialSankeyLayoutOption extends StObject {
  
  var nodeAlign: js.UndefOr[NodeAlign] = js.undefined
  
  var nodeDepth: js.UndefOr[NodeDepth] = js.undefined
  
  var nodeId: js.UndefOr[js.Function1[/* node */ Datum, Any]] = js.undefined
  
  var nodePadding: js.UndefOr[Double] = js.undefined
  
  var nodeSort: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Double]] = js.undefined
  
  var nodeWidth: js.UndefOr[Double] = js.undefined
}
object PartialSankeyLayoutOption {
  
  inline def apply(): PartialSankeyLayoutOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSankeyLayoutOption]
  }
  
  extension [Self <: PartialSankeyLayoutOption](x: Self) {
    
    inline def setNodeAlign(value: NodeAlign): Self = StObject.set(x, "nodeAlign", value.asInstanceOf[js.Any])
    
    inline def setNodeAlignUndefined: Self = StObject.set(x, "nodeAlign", js.undefined)
    
    inline def setNodeDepth(value: (/* datum */ Datum, /* maxDepth */ Double) => Double): Self = StObject.set(x, "nodeDepth", js.Any.fromFunction2(value))
    
    inline def setNodeDepthUndefined: Self = StObject.set(x, "nodeDepth", js.undefined)
    
    inline def setNodeId(value: /* node */ Datum => Any): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
    
    inline def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
    
    inline def setNodeSort(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "nodeSort", js.Any.fromFunction2(value))
    
    inline def setNodeSortUndefined: Self = StObject.set(x, "nodeSort", js.undefined)
    
    inline def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
    
    inline def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
  }
}
