package typings.actionsOnGoogle.tableMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsButton
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOptions extends js.Object {
  
  /**
    * Buttons for the Table.
    * Currently at most 1 button is supported.
    * @public
    */
  var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.native
  
  /**
    * Headers and alignment of columns.
    *
    * This property or `columns` is required.
    *
    * When provided as string array, just the header field is set per column.
    * @public
    */
  var columnProperties: js.UndefOr[js.Array[TableColumn | String]] = js.native
  
  /**
    * Headers and alignment of columns with shortened name.
    * Alias of `columnProperties` with the additional capability of accepting a number type.
    *
    * This property or `columnProperties` is required.
    *
    * When provided as string array, just the header field is set per column.
    * When provided a number, it represents the number of elements per row.
    * @public
    */
  var columns: js.UndefOr[(js.Array[TableColumn | String]) | Double] = js.native
  
  /**
    * Default dividerAfter for all rows.
    * Individual rows with `dividerAfter` set will override for that specific row.
    * @public
    */
  var dividers: js.UndefOr[Boolean] = js.native
  
  /**
    * Image associated with the table.
    * @public
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Row data of the table.
    *
    * The first 3 rows are guaranteed to be shown but others might be cut on certain surfaces.
    * Please test with the simulator to see which rows will be shown for a given surface.
    *
    * On surfaces that support the WEB_BROWSER capability, you can point the user to
    * a web page with more data.
    * @public
    */
  var rows: js.Array[TableRow | js.Array[String]] = js.native
  
  /**
    * Subtitle for the table.
    * @public
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Overall title of the table.
    *
    * Must be set if subtitle is set.
    * @public
    */
  var title: js.UndefOr[String] = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(rows: js.Array[TableRow | js.Array[String]]): TableOptions = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
    
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
    def setRowsVarargs(value: (TableRow | js.Array[String])*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[TableRow | js.Array[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setColumnPropertiesVarargs(value: (TableColumn | String)*): Self = this.set("columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setColumnProperties(value: js.Array[TableColumn | String]): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (TableColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: (js.Array[TableColumn | String]) | Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDividers(value: Boolean): Self = this.set("dividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDividers: Self = this.set("dividers", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
