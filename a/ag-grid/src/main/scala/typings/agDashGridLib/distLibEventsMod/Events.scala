package typings
package agDashGridLib.distLibEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/events", "Events")
@js.native
class Events ()
  extends agDashGridLib.distLibEventKeysMod.Events

/* static members */
@JSImport("ag-grid/dist/lib/events", "Events")
@js.native
object Events extends js.Object {
  var EVENT_ANIMATION_QUEUE_EMPTY: java.lang.String = js.native
  /** All items from here down are used internally by the grid, not intended for external use. */
  var EVENT_BODY_HEIGHT_CHANGED: java.lang.String = js.native
  /** Main body of grid has scrolled, either horizontally or vertically */
  var EVENT_BODY_SCROLL: java.lang.String = js.native
  var EVENT_CELL_CLICKED: java.lang.String = js.native
  var EVENT_CELL_CONTEXT_MENU: java.lang.String = js.native
  var EVENT_CELL_DOUBLE_CLICKED: java.lang.String = js.native
  var EVENT_CELL_EDITING_STARTED: java.lang.String = js.native
  var EVENT_CELL_EDITING_STOPPED: java.lang.String = js.native
  var EVENT_CELL_FOCUSED: java.lang.String = js.native
  var EVENT_CELL_MOUSE_DOWN: java.lang.String = js.native
  var EVENT_CELL_MOUSE_OUT: java.lang.String = js.native
  var EVENT_CELL_MOUSE_OVER: java.lang.String = js.native
  var EVENT_CELL_VALUE_CHANGED: java.lang.String = js.native
  var EVENT_COLUMN_AGG_FUNC_CHANGE_REQUEST: java.lang.String = js.native
  /** Everything has changed with the columns. Either complete new set of columns set, or user called setState()*/
  var EVENT_COLUMN_EVERYTHING_CHANGED: java.lang.String = js.native
  /** A column group was opened / closed */
  var EVENT_COLUMN_GROUP_OPENED: java.lang.String = js.native
  var EVENT_COLUMN_HOVER_CHANGED: java.lang.String = js.native
  /** A column was moved */
  var EVENT_COLUMN_MOVED: java.lang.String = js.native
  /** One or more columns was pinned / unpinned*/
  var EVENT_COLUMN_PINNED: java.lang.String = js.native
  /** A pivot column was added, removed or order changed. */
  var EVENT_COLUMN_PIVOT_CHANGED: java.lang.String = js.native
  var EVENT_COLUMN_PIVOT_CHANGE_REQUEST: java.lang.String = js.native
  /** The pivot mode flag was changed */
  var EVENT_COLUMN_PIVOT_MODE_CHANGED: java.lang.String = js.native
  /** One or more columns was resized. If just one, the column in the event is set. */
  var EVENT_COLUMN_RESIZED: java.lang.String = js.native
  /** A row group column was added, removed or order changed. */
  var EVENT_COLUMN_ROW_GROUP_CHANGED: java.lang.String = js.native
  var EVENT_COLUMN_ROW_GROUP_CHANGE_REQUEST: java.lang.String = js.native
  /** A value column was added, removed or agg function was changed. */
  var EVENT_COLUMN_VALUE_CHANGED: java.lang.String = js.native
  var EVENT_COLUMN_VALUE_CHANGE_REQUEST: java.lang.String = js.native
  /** One or more columns was shown / hidden */
  var EVENT_COLUMN_VISIBLE: java.lang.String = js.native
  /** Only used by React, Angular 2+, Web Components, Aurelia and VueJS ag-Grid components
    * (not used if doing plain JavaScript or Angular 1.x). If the grid receives changes due
    * to bound properties, this event fires after the grid has finished processing the change. */
  var EVENT_COMPONENT_STATE_CHANGED: java.lang.String = js.native
  /** The list of displayed columns has changed, can result from columns open / close, column move, pivot, group, etc */
  var EVENT_DISPLAYED_COLUMNS_CHANGED: java.lang.String = js.native
  var EVENT_DISPLAYED_COLUMNS_WIDTH_CHANGED: java.lang.String = js.native
  /** A column drag has started, either resizing a column or moving a column. */
  var EVENT_DRAG_STARTED: java.lang.String = js.native
  /** A column drag has stopped */
  var EVENT_DRAG_STOPPED: java.lang.String = js.native
  /** 2 events for filtering. The grid LISTENS for filterChanged and afterFilterChanged */
  var EVENT_FILTER_CHANGED: java.lang.String = js.native
  /** Filter was change but not applied. Only useful if apply buttons are used in filters. */
  var EVENT_FILTER_MODIFIED: java.lang.String = js.native
  var EVENT_FLASH_CELLS: java.lang.String = js.native
  /** The list of grid columns has changed. */
  var EVENT_GRID_COLUMNS_CHANGED: java.lang.String = js.native
  /** Gets called once after the grid has finished initialising. */
  var EVENT_GRID_READY: java.lang.String = js.native
  /** Width of height of the main grid div has changed. Grid listens for this and does layout of grid if it's
    * changed, so always filling the space it was given. */
  var EVENT_GRID_SIZE_CHANGED: java.lang.String = js.native
  var EVENT_HEIGHT_SCALE_CHANGED: java.lang.String = js.native
  /** Model was updated - grid updates the drawn rows when this happens */
  var EVENT_MODEL_UPDATED: java.lang.String = js.native
  /** User has set in new columns. */
  var EVENT_NEW_COLUMNS_LOADED: java.lang.String = js.native
  /** The displayed page for pagination has changed. For example the data was filtered or sorted,
    * or the user has moved to a different page. */
  var EVENT_PAGINATION_CHANGED: java.lang.String = js.native
  var EVENT_PASTE_END: java.lang.String = js.native
  var EVENT_PASTE_START: java.lang.String = js.native
  /** The client has set new floating data into the grid */
  var EVENT_PINNED_ROW_DATA_CHANGED: java.lang.String = js.native
  /** Range selection has changed */
  var EVENT_RANGE_SELECTION_CHANGED: java.lang.String = js.native
  var EVENT_ROW_CLICKED: java.lang.String = js.native
  /** The client has set new data into the grid */
  var EVENT_ROW_DATA_CHANGED: java.lang.String = js.native
  /** The client has updated data for the grid */
  var EVENT_ROW_DATA_UPDATED: java.lang.String = js.native
  var EVENT_ROW_DOUBLE_CLICKED: java.lang.String = js.native
  var EVENT_ROW_DRAG_END: java.lang.String = js.native
  var EVENT_ROW_DRAG_ENTER: java.lang.String = js.native
  var EVENT_ROW_DRAG_LEAVE: java.lang.String = js.native
  var EVENT_ROW_DRAG_MOVE: java.lang.String = js.native
  var EVENT_ROW_EDITING_STARTED: java.lang.String = js.native
  var EVENT_ROW_EDITING_STOPPED: java.lang.String = js.native
  /** A row group was opened / closed */
  var EVENT_ROW_GROUP_OPENED: java.lang.String = js.native
  var EVENT_ROW_SELECTED: java.lang.String = js.native
  var EVENT_ROW_VALUE_CHANGED: java.lang.String = js.native
  var EVENT_SCROLL_VISIBILITY_CHANGED: java.lang.String = js.native
  var EVENT_SELECTION_CHANGED: java.lang.String = js.native
  var EVENT_SORT_CHANGED: java.lang.String = js.native
  /** For when the tool panel is shown / hidden */
  var EVENT_TOOL_PANEL_VISIBLE_CHANGED: java.lang.String = js.native
  /** The indexes of the rows rendered has changed, eg user has scrolled to a new vertical position. */
  var EVENT_VIEWPORT_CHANGED: java.lang.String = js.native
  /** The list of virtual columns has changed, results from viewport changing */
  var EVENT_VIRTUAL_COLUMNS_CHANGED: java.lang.String = js.native
  /** A row was removed from the dom, for any reason. Use to clean up resources (if any) used by the row. */
  var EVENT_VIRTUAL_ROW_REMOVED: java.lang.String = js.native
}

