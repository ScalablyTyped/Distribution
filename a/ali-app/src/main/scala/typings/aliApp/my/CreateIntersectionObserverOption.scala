package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntersectionObserverOption extends js.Object {
  
  var initialRatio: js.UndefOr[Double] = js.native
  
  var selectAll: js.UndefOr[Boolean] = js.native
  
  var thresholds: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object CreateIntersectionObserverOption {
  
  @scala.inline
  def apply(): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
  
  @scala.inline
  implicit class CreateIntersectionObserverOptionOps[Self <: CreateIntersectionObserverOption] (val x: Self) extends AnyVal {
    
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
    def setInitialRatio(value: Double): Self = this.set("initialRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRatio: Self = this.set("initialRatio", js.undefined)
    
    @scala.inline
    def setSelectAll(value: Boolean): Self = this.set("selectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAll: Self = this.set("selectAll", js.undefined)
    
    @scala.inline
    def setThresholds(value: js.Tuple2[Double, Double]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
  }
}
