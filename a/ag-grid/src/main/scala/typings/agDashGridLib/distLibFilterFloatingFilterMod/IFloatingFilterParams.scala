package typings
package agDashGridLib.distLibFilterFloatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFloatingFilterParams[M, F /* <: FloatingFilterChange */] extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi = js.native
  var column: agDashGridLib.distLibEntitiesColumnMod.Column = js.native
  var debounceMs: js.UndefOr[scala.Double] = js.native
  var suppressFilterButton: scala.Boolean = js.native
  def currentParentModel(): M = js.native
  def onFloatingFilterChanged(change: F | M): scala.Boolean = js.native
}

