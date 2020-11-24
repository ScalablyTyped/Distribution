package typings.agGrid.filterManagerMod

import typings.agGrid.columnMod.Column
import typings.agGrid.iFilterMod.IFilterComp
import typings.agGrid.utilsMod.ExternalPromise
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterWrapper extends js.Object {
  
  var column: Column = js.native
  
  var compiledElement: js.Any = js.native
  
  var filterPromise: Promise[IFilterComp] = js.native
  
  var guiPromise: ExternalPromise[HTMLElement] = js.native
  
  var scope: js.Any = js.native
}
object FilterWrapper {
  
  @scala.inline
  def apply(
    column: Column,
    compiledElement: js.Any,
    filterPromise: Promise[IFilterComp],
    guiPromise: ExternalPromise[HTMLElement],
    scope: js.Any
  ): FilterWrapper = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compiledElement = compiledElement.asInstanceOf[js.Any], filterPromise = filterPromise.asInstanceOf[js.Any], guiPromise = guiPromise.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterWrapper]
  }
  
  @scala.inline
  implicit class FilterWrapperOps[Self <: FilterWrapper] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompiledElement(value: js.Any): Self = this.set("compiledElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterPromise(value: Promise[IFilterComp]): Self = this.set("filterPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuiPromise(value: ExternalPromise[HTMLElement]): Self = this.set("guiPromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
