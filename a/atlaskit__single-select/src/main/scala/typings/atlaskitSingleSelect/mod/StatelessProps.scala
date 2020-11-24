package typings.atlaskitSingleSelect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatelessProps extends Props {
  
  /** Value to be used when filtering the items. Compared against 'content'. */
  var filterValue: js.UndefOr[String] = js.native
  
  /**
    * Sets whether the field is loading data. The same property is used
    * for either initial fetch (when no options are available) as well for
    * subsequent loading of more options. The component reacts accordingly
    * based on the `items` provided.
    */
  var isLoading: js.UndefOr[Boolean] = js.native
  
  /** Sets whether the Select dropdown is open. */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Message to be displayed when the component is set to its loading state.
    * The message might be displayed differently depending on whether or not
    * there are items already being rendered.
    */
  var loadingMessage: js.UndefOr[String] = js.native
  
  /** The selected item data */
  var selectedItem: js.UndefOr[ItemType] = js.native
}
object StatelessProps {
  
  @scala.inline
  def apply(): StatelessProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessProps]
  }
  
  @scala.inline
  implicit class StatelessPropsOps[Self <: StatelessProps] (val x: Self) extends AnyVal {
    
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
    def setFilterValue(value: String): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    
    @scala.inline
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLoading: Self = this.set("isLoading", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setLoadingMessage(value: String): Self = this.set("loadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingMessage: Self = this.set("loadingMessage", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: ItemType): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
  }
}
