package typings.agGrid.headerGroupCompMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHeaderGroupParams extends js.Object {
  
  var api: GridApi = js.native
  
  var columnApi: ColumnApi = js.native
  
  var columnGroup: ColumnGroup = js.native
  
  var context: js.Any = js.native
  
  var displayName: String = js.native
  
  def setExpanded(expanded: Boolean): Unit = js.native
}
object IHeaderGroupParams {
  
  @scala.inline
  def apply(
    api: GridApi,
    columnApi: ColumnApi,
    columnGroup: ColumnGroup,
    context: js.Any,
    displayName: String,
    setExpanded: Boolean => Unit
  ): IHeaderGroupParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columnGroup = columnGroup.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], setExpanded = js.Any.fromFunction1(setExpanded))
    __obj.asInstanceOf[IHeaderGroupParams]
  }
  
  @scala.inline
  implicit class IHeaderGroupParamsOps[Self <: IHeaderGroupParams] (val x: Self) extends AnyVal {
    
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
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnApi(value: ColumnApi): Self = this.set("columnApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnGroup(value: ColumnGroup): Self = this.set("columnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetExpanded(value: Boolean => Unit): Self = this.set("setExpanded", js.Any.fromFunction1(value))
  }
}
