package typings.antvDataSet.arcMod

import typings.antvDataSet.antvDataSetStrings.frequency
import typings.antvDataSet.antvDataSetStrings.id
import typings.antvDataSet.antvDataSetStrings.weigth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var id: js.UndefOr[js.Function1[/* node */ js.Any, _]] = js.native
  
  var marginRatio: js.UndefOr[Double] = js.native
  
  var sortBy: js.UndefOr[
    id | weigth | frequency | Null | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])
  ] = js.native
  
  var source: js.UndefOr[js.Function1[/* edge */ js.Any, _]] = js.native
  
  var sourceWeight: js.UndefOr[js.Function1[/* edge */ js.Any, Double]] = js.native
  
  var target: js.UndefOr[js.Function1[/* edge */ js.Any, _]] = js.native
  
  var targetWeight: js.UndefOr[js.Function1[/* edge */ js.Any, Double]] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var weight: js.UndefOr[Boolean] = js.native
  
  var y: js.UndefOr[Double] = js.native
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
    def setId(value: /* node */ js.Any => _): Self = this.set("id", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMarginRatio(value: Double): Self = this.set("marginRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRatio: Self = this.set("marginRatio", js.undefined)
    
    @scala.inline
    def setSortByFunction2(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = this.set("sortBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortBy(value: id | weigth | frequency | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double])): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortByNull: Self = this.set("sortBy", null)
    
    @scala.inline
    def setSource(value: /* edge */ js.Any => _): Self = this.set("source", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceWeight(value: /* edge */ js.Any => Double): Self = this.set("sourceWeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSourceWeight: Self = this.set("sourceWeight", js.undefined)
    
    @scala.inline
    def setTarget(value: /* edge */ js.Any => _): Self = this.set("target", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetWeight(value: /* edge */ js.Any => Double): Self = this.set("targetWeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTargetWeight: Self = this.set("targetWeight", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setWeight(value: Boolean): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
