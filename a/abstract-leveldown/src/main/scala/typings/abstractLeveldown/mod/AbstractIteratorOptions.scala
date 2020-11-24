package typings.abstractLeveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractIteratorOptions[K] extends AbstractOptions {
  
  var gt: js.UndefOr[K] = js.native
  
  var gte: js.UndefOr[K] = js.native
  
  var keyAsBuffer: js.UndefOr[Boolean] = js.native
  
  var keys: js.UndefOr[Boolean] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var lt: js.UndefOr[K] = js.native
  
  var lte: js.UndefOr[K] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var valueAsBuffer: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[Boolean] = js.native
}
object AbstractIteratorOptions {
  
  @scala.inline
  def apply[K](): AbstractIteratorOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbstractIteratorOptions[K]]
  }
  
  @scala.inline
  implicit class AbstractIteratorOptionsOps[Self <: AbstractIteratorOptions[_], K] (val x: Self with AbstractIteratorOptions[K]) extends AnyVal {
    
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
    def setGt(value: K): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    
    @scala.inline
    def setGte(value: K): Self = this.set("gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGte: Self = this.set("gte", js.undefined)
    
    @scala.inline
    def setKeyAsBuffer(value: Boolean): Self = this.set("keyAsBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAsBuffer: Self = this.set("keyAsBuffer", js.undefined)
    
    @scala.inline
    def setKeys(value: Boolean): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLt(value: K): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    
    @scala.inline
    def setLte(value: K): Self = this.set("lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLte: Self = this.set("lte", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setValueAsBuffer(value: Boolean): Self = this.set("valueAsBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAsBuffer: Self = this.set("valueAsBuffer", js.undefined)
    
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
