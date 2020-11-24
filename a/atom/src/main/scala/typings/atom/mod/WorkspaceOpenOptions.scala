package typings.atom.mod

import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.center
import typings.atom.atomStrings.down
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceOpenOptions extends js.Object {
  
  /**
    *  A boolean indicating whether to call Pane::activateItem on containing pane.
    *  Defaults to true.
    */
  var activateItem: js.UndefOr[Boolean] = js.native
  
  /**
    *  A boolean indicating whether to call Pane::activate on containing pane.
    *  Defaults to true.
    */
  var activatePane: js.UndefOr[Boolean] = js.native
  
  /** A number indicating which column to move the cursor to initially. Defaults to 0. */
  var initialColumn: js.UndefOr[Double] = js.native
  
  /** A number indicating which row to move the cursor to initially. Defaults to 0. */
  var initialLine: js.UndefOr[Double] = js.native
  
  /**
    *  A String containing the name of the location in which this item should be opened.
    *  If omitted, Atom will fall back to the last location in which a user has placed
    *  an item with the same URI or, if this is a new URI, the default location specified
    *  by the item.
    *  NOTE: This option should almost always be omitted to honor user preference.
    */
  var location: js.UndefOr[left_ | right_ | bottom_ | center] = js.native
  
  /**
    *  A Boolean indicating whether or not the item should be opened in a pending state.
    *  Existing pending items in a pane are replaced with new pending items when they
    *  are opened.
    */
  var pending: js.UndefOr[Boolean] = js.native
  
  /**
    *  A boolean. If true, the workspace will attempt to activate an existing item for
    *  the given URI on any pane. If false, only the active pane will be searched for
    *  an existing item for the same URI. Defaults to false.
    */
  var searchAllPanes: js.UndefOr[Boolean] = js.native
  
  /**
    *  Either 'left', 'right', 'up' or 'down'. If 'left', the item will be opened in
    *  leftmost pane of the current active pane's row. If 'right', the item will be
    *  opened in the rightmost pane of the current active pane's row. If only one pane
    *  exists in the row, a new pane will be created. If 'up', the item will be opened
    *  in topmost pane of the current active pane's column. If 'down', the item will be
    *  opened in the bottommost pane of the current active pane's column. If only one pane
    *  exists in the column, a new pane will be created.
    */
  var split: js.UndefOr[left_ | right_ | up | down] = js.native
}
object WorkspaceOpenOptions {
  
  @scala.inline
  def apply(): WorkspaceOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceOpenOptions]
  }
  
  @scala.inline
  implicit class WorkspaceOpenOptionsOps[Self <: WorkspaceOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setActivateItem(value: Boolean): Self = this.set("activateItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivateItem: Self = this.set("activateItem", js.undefined)
    
    @scala.inline
    def setActivatePane(value: Boolean): Self = this.set("activatePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivatePane: Self = this.set("activatePane", js.undefined)
    
    @scala.inline
    def setInitialColumn(value: Double): Self = this.set("initialColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialColumn: Self = this.set("initialColumn", js.undefined)
    
    @scala.inline
    def setInitialLine(value: Double): Self = this.set("initialLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLine: Self = this.set("initialLine", js.undefined)
    
    @scala.inline
    def setLocation(value: left_ | right_ | bottom_ | center): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    
    @scala.inline
    def setSearchAllPanes(value: Boolean): Self = this.set("searchAllPanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchAllPanes: Self = this.set("searchAllPanes", js.undefined)
    
    @scala.inline
    def setSplit(value: left_ | right_ | up | down): Self = this.set("split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
  }
}
