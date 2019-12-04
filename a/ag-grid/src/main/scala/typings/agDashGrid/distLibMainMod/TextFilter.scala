package typings.agDashGrid.distLibMainMod

import typings.agDashGrid.distLibFilterTextFilterMod.TextComparator
import typings.agDashGrid.distLibFilterTextFilterMod.TextFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "TextFilter")
@js.native
class TextFilter ()
  extends typings.agDashGrid.distLibFilterTextFilterMod.TextFilter

/* static members */
@JSImport("ag-grid/dist/lib/main", "TextFilter")
@js.native
object TextFilter extends js.Object {
  @JSName("DEFAULT_COMPARATOR")
  var DEFAULT_COMPARATOR_Original: TextComparator = js.native
  @JSName("DEFAULT_FORMATTER")
  var DEFAULT_FORMATTER_Original: TextFormatter = js.native
  @JSName("DEFAULT_LOWERCASE_FORMATTER")
  var DEFAULT_LOWERCASE_FORMATTER_Original: TextFormatter = js.native
  def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = js.native
  def DEFAULT_FORMATTER(from: String): String = js.native
  def DEFAULT_LOWERCASE_FORMATTER(from: String): String = js.native
}

