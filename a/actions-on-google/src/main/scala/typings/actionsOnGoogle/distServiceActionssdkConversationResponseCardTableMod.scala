package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsButton
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsTableCard
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsTableCardCell
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsTableCardColumnProperties
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseCardTableMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card/table", "Table")
  @js.native
  open class Table protected ()
    extends StObject
       with GoogleActionsV2UiElementsTableCard {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
  trait TableColumn
    extends StObject
       with GoogleActionsV2UiElementsTableCardColumnProperties {
    
    /**
      * Alias for `horizontalAlignment`
      *
      * Horizontal alignment of content w.r.t column. If unspecified, content
      * will be aligned to the leading edge.
      * @public
      */
    var align: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.undefined
  }
  object TableColumn {
    
    inline def apply(): TableColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableColumn] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  trait TableOptions extends StObject {
    
    /**
      * Buttons for the Table.
      * Currently at most 1 button is supported.
      * @public
      */
    var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
    
    /**
      * Headers and alignment of columns.
      *
      * This property or `columns` is required.
      *
      * When provided as string array, just the header field is set per column.
      * @public
      */
    var columnProperties: js.UndefOr[js.Array[TableColumn | String]] = js.undefined
    
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
    var columns: js.UndefOr[(js.Array[TableColumn | String]) | Double] = js.undefined
    
    /**
      * Default dividerAfter for all rows.
      * Individual rows with `dividerAfter` set will override for that specific row.
      * @public
      */
    var dividers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Image associated with the table.
      * @public
      */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
    
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
    var rows: js.Array[TableRow | js.Array[String]]
    
    /**
      * Subtitle for the table.
      * @public
      */
    var subtitle: js.UndefOr[String] = js.undefined
    
    /**
      * Overall title of the table.
      *
      * Must be set if subtitle is set.
      * @public
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object TableOptions {
    
    inline def apply(rows: js.Array[TableRow | js.Array[String]]): TableOptions = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
      
      inline def setButtons(value: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setColumnProperties(value: js.Array[TableColumn | String]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
      
      inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
      
      inline def setColumnPropertiesVarargs(value: (TableColumn | String)*): Self = StObject.set(x, "columnProperties", js.Array(value*))
      
      inline def setColumns(value: (js.Array[TableColumn | String]) | Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (TableColumn | String)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setDividers(value: Boolean): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
      
      inline def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
      
      inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setRows(value: js.Array[TableRow | js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (TableRow | js.Array[String])*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TableRow extends StObject {
    
    /**
      * Cells in this row.
      * The first 3 cells are guaranteed to be shown but others might be cut on certain surfaces.
      * Please test with the simulator to see which cells will be shown for a given surface.
      *
      * When provided as a string array, creates the cells as text.
      * @public
      */
    var cells: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardCell | String]] = js.undefined
    
    /**
      * Indicates whether there should be a divider after each row.
      *
      * Overrides top level `dividers` property for this specific row if set.
      * @public
      */
    var dividerAfter: js.UndefOr[Boolean] = js.undefined
  }
  object TableRow {
    
    inline def apply(): TableRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRow] (val x: Self) extends AnyVal {
      
      inline def setCells(value: js.Array[GoogleActionsV2UiElementsTableCardCell | String]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: (GoogleActionsV2UiElementsTableCardCell | String)*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setDividerAfter(value: Boolean): Self = StObject.set(x, "dividerAfter", value.asInstanceOf[js.Any])
      
      inline def setDividerAfterUndefined: Self = StObject.set(x, "dividerAfter", js.undefined)
    }
  }
}
