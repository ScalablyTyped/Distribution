package typings.atlaskitSingleSelect.mod

import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.bottom
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.left
import typings.atlaskitSingleSelect.atlaskitSingleSelectStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemType extends js.Object {
  
  var content: js.UndefOr[ReactNode] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var elemBefore: js.UndefOr[ReactNode] = js.native
  
  var filterValues: js.UndefOr[js.Array[String]] = js.native
  
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  var isSelected: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var tooltipDescription: js.UndefOr[String] = js.native
  
  var tooltipPosition: js.UndefOr[top | bottom | left] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object ItemType {
  
  @scala.inline
  def apply(): ItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemType]
  }
  
  @scala.inline
  implicit class ItemTypeOps[Self <: ItemType] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ReactNode): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setElemBefore(value: ReactNode): Self = this.set("elemBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElemBefore: Self = this.set("elemBefore", js.undefined)
    
    @scala.inline
    def setFilterValuesVarargs(value: String*): Self = this.set("filterValues", js.Array(value :_*))
    
    @scala.inline
    def setFilterValues(value: js.Array[String]): Self = this.set("filterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValues: Self = this.set("filterValues", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTooltipDescription(value: String): Self = this.set("tooltipDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipDescription: Self = this.set("tooltipDescription", js.undefined)
    
    @scala.inline
    def setTooltipPosition(value: top | bottom | left): Self = this.set("tooltipPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPosition: Self = this.set("tooltipPosition", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
