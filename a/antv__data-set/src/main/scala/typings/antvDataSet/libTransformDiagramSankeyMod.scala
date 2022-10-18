package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.sankeyCenter
import typings.antvDataSet.antvDataSetStrings.sankeyJustify
import typings.antvDataSet.antvDataSetStrings.sankeyLeft
import typings.antvDataSet.antvDataSetStrings.sankeyRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformDiagramSankeyMod {
  
  trait Options extends StObject {
    
    var nodeAlign: js.UndefOr[sankeyLeft | sankeyRight | sankeyCenter | sankeyJustify] = js.undefined
    
    var nodeId: js.UndefOr[js.Function1[/* node */ Any, Any]] = js.undefined
    
    var nodePadding: js.UndefOr[Double] = js.undefined
    
    var nodeWidth: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[Null | (js.Function2[/* a */ Any, /* b */ Any, Double])] = js.undefined
    
    var source: js.UndefOr[js.Function1[/* edge */ Any, Any]] = js.undefined
    
    var target: js.UndefOr[js.Function1[/* edge */ Any, Any]] = js.undefined
    
    var value: js.UndefOr[js.Function1[/* node */ Any, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNodeAlign(value: sankeyLeft | sankeyRight | sankeyCenter | sankeyJustify): Self = StObject.set(x, "nodeAlign", value.asInstanceOf[js.Any])
      
      inline def setNodeAlignUndefined: Self = StObject.set(x, "nodeAlign", js.undefined)
      
      inline def setNodeId(value: /* node */ Any => Any): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
      
      inline def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
      
      inline def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
      
      inline def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
      
      inline def setSort(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortNull: Self = StObject.set(x, "sort", null)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSource(value: /* edge */ Any => Any): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: /* edge */ Any => Any): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setValue(value: /* node */ Any => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
