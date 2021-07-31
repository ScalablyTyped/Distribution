package typings.atom.mod

import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.center
import typings.atom.atomStrings.down
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceOpenOptions extends StObject {
  
  /**
    *  A boolean indicating whether to call Pane::activateItem on containing pane.
    *  Defaults to true.
    */
  var activateItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  A boolean indicating whether to call Pane::activate on containing pane.
    *  Defaults to true.
    */
  var activatePane: js.UndefOr[Boolean] = js.undefined
  
  /** A number indicating which column to move the cursor to initially. Defaults to 0. */
  var initialColumn: js.UndefOr[Double] = js.undefined
  
  /** A number indicating which row to move the cursor to initially. Defaults to 0. */
  var initialLine: js.UndefOr[Double] = js.undefined
  
  /**
    *  A String containing the name of the location in which this item should be opened.
    *  If omitted, Atom will fall back to the last location in which a user has placed
    *  an item with the same URI or, if this is a new URI, the default location specified
    *  by the item.
    *  NOTE: This option should almost always be omitted to honor user preference.
    */
  var location: js.UndefOr[left_ | right_ | bottom_ | center] = js.undefined
  
  /**
    *  A Boolean indicating whether or not the item should be opened in a pending state.
    *  Existing pending items in a pane are replaced with new pending items when they
    *  are opened.
    */
  var pending: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  A boolean. If true, the workspace will attempt to activate an existing item for
    *  the given URI on any pane. If false, only the active pane will be searched for
    *  an existing item for the same URI. Defaults to false.
    */
  var searchAllPanes: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Either 'left', 'right', 'up' or 'down'. If 'left', the item will be opened in
    *  leftmost pane of the current active pane's row. If 'right', the item will be
    *  opened in the rightmost pane of the current active pane's row. If only one pane
    *  exists in the row, a new pane will be created. If 'up', the item will be opened
    *  in topmost pane of the current active pane's column. If 'down', the item will be
    *  opened in the bottommost pane of the current active pane's column. If only one pane
    *  exists in the column, a new pane will be created.
    */
  var split: js.UndefOr[left_ | right_ | up | down] = js.undefined
}
object WorkspaceOpenOptions {
  
  @scala.inline
  def apply(): WorkspaceOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceOpenOptions]
  }
  
  @scala.inline
  implicit class WorkspaceOpenOptionsMutableBuilder[Self <: WorkspaceOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateItem(value: Boolean): Self = StObject.set(x, "activateItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivateItemUndefined: Self = StObject.set(x, "activateItem", js.undefined)
    
    @scala.inline
    def setActivatePane(value: Boolean): Self = StObject.set(x, "activatePane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivatePaneUndefined: Self = StObject.set(x, "activatePane", js.undefined)
    
    @scala.inline
    def setInitialColumn(value: Double): Self = StObject.set(x, "initialColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialColumnUndefined: Self = StObject.set(x, "initialColumn", js.undefined)
    
    @scala.inline
    def setInitialLine(value: Double): Self = StObject.set(x, "initialLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialLineUndefined: Self = StObject.set(x, "initialLine", js.undefined)
    
    @scala.inline
    def setLocation(value: left_ | right_ | bottom_ | center): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    @scala.inline
    def setSearchAllPanes(value: Boolean): Self = StObject.set(x, "searchAllPanes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchAllPanesUndefined: Self = StObject.set(x, "searchAllPanes", js.undefined)
    
    @scala.inline
    def setSplit(value: left_ | right_ | up | down): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
