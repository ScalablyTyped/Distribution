package typings.algoliasearchHelper.mod.SearchResults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetValue extends js.Object {
  
  var count: Double = js.native
  
  var isExcluded: Boolean = js.native
  
  var isRefined: Boolean = js.native
  
  var name: String = js.native
}
object FacetValue {
  
  @scala.inline
  def apply(count: Double, isExcluded: Boolean, isRefined: Boolean, name: String): FacetValue = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], isExcluded = isExcluded.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetValue]
  }
  
  @scala.inline
  implicit class FacetValueOps[Self <: FacetValue] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExcluded(value: Boolean): Self = this.set("isExcluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRefined(value: Boolean): Self = this.set("isRefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
