package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.sankeyCenter
import typings.antvDataSet.antvDataSetStrings.sankeyJustify
import typings.antvDataSet.antvDataSetStrings.sankeyLeft
import typings.antvDataSet.antvDataSetStrings.sankeyRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyMod {
  
  @js.native
  trait Options extends StObject {
    
    var nodeAlign: js.UndefOr[sankeyLeft | sankeyRight | sankeyCenter | sankeyJustify] = js.native
    
    var nodeId: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
    
    var nodePadding: js.UndefOr[Double] = js.native
    
    var nodeWidth: js.UndefOr[Double] = js.native
    
    var sort: js.UndefOr[Null | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])] = js.native
    
    var source: js.UndefOr[js.Function1[/* edge */ js.Any, _]] = js.native
    
    var target: js.UndefOr[js.Function1[/* edge */ js.Any, _]] = js.native
    
    var value: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeAlign(value: sankeyLeft | sankeyRight | sankeyCenter | sankeyJustify): Self = StObject.set(x, "nodeAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeAlignUndefined: Self = StObject.set(x, "nodeAlign", js.undefined)
      
      @scala.inline
      def setNodeId(value: /* node */ js.Any => _): Self = StObject.set(x, "nodeId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      @scala.inline
      def setNodePadding(value: Double): Self = StObject.set(x, "nodePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodePaddingUndefined: Self = StObject.set(x, "nodePadding", js.undefined)
      
      @scala.inline
      def setNodeWidth(value: Double): Self = StObject.set(x, "nodeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeWidthUndefined: Self = StObject.set(x, "nodeWidth", js.undefined)
      
      @scala.inline
      def setSort(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortNull: Self = StObject.set(x, "sort", null)
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSource(value: /* edge */ js.Any => _): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: /* edge */ js.Any => _): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setValue(value: /* node */ js.Any => _): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
