package typings.agGrid.floatingFilterMod

import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFloatingFilterParams[M, F /* <: FloatingFilterChange */] extends js.Object {
  
  var api: GridApi = js.native
  
  var column: Column = js.native
  
  def currentParentModel(): M = js.native
  
  var debounceMs: js.UndefOr[Double] = js.native
  
  def onFloatingFilterChanged(change: F | M): Boolean = js.native
  
  var suppressFilterButton: Boolean = js.native
}
