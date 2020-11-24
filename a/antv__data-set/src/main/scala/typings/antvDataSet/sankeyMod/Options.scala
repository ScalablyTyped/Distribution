package typings.antvDataSet.sankeyMod

import typings.antvDataSet.antvDataSetStrings.sankeyCenter
import typings.antvDataSet.antvDataSetStrings.sankeyJustify
import typings.antvDataSet.antvDataSetStrings.sankeyLeft
import typings.antvDataSet.antvDataSetStrings.sankeyRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNodeAlign(value: sankeyLeft | sankeyRight | sankeyCenter | sankeyJustify): Self = this.set("nodeAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeAlign: Self = this.set("nodeAlign", js.undefined)
    
    @scala.inline
    def setNodeId(value: /* node */ js.Any => _): Self = this.set("nodeId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setNodePadding(value: Double): Self = this.set("nodePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodePadding: Self = this.set("nodePadding", js.undefined)
    
    @scala.inline
    def setNodeWidth(value: Double): Self = this.set("nodeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeWidth: Self = this.set("nodeWidth", js.undefined)
    
    @scala.inline
    def setSort(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortNull: Self = this.set("sort", null)
    
    @scala.inline
    def setSource(value: /* edge */ js.Any => _): Self = this.set("source", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTarget(value: /* edge */ js.Any => _): Self = this.set("target", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setValue(value: /* node */ js.Any => _): Self = this.set("value", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
