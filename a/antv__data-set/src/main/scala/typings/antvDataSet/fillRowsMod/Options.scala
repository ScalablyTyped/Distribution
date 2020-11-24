package typings.antvDataSet.fillRowsMod

import typings.antvDataSet.antvDataSetStrings.group
import typings.antvDataSet.antvDataSetStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var fillBy: js.UndefOr[group | order] = js.native
  
  var groupBy: js.UndefOr[js.Array[String]] = js.native
  
  var orderBy: js.UndefOr[js.Array[String]] = js.native
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
    def setFillBy(value: group | order): Self = this.set("fillBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillBy: Self = this.set("fillBy", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: String*): Self = this.set("groupBy", js.Array(value :_*))
    
    @scala.inline
    def setGroupBy(value: js.Array[String]): Self = this.set("groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBy: Self = this.set("groupBy", js.undefined)
    
    @scala.inline
    def setOrderByVarargs(value: String*): Self = this.set("orderBy", js.Array(value :_*))
    
    @scala.inline
    def setOrderBy(value: js.Array[String]): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
  }
}
