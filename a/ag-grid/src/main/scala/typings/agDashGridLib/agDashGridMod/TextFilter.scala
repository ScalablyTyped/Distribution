package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "TextFilter")
@js.native
class TextFilter ()
  extends agDashGridLib.distLibFilterTextFilterMod.TextFilter

/* static members */
@JSImport("ag-grid", "TextFilter")
@js.native
object TextFilter extends js.Object {
  @JSName("DEFAULT_COMPARATOR")
  var DEFAULT_COMPARATOR_Original: agDashGridLib.distLibFilterTextFilterMod.TextComparator = js.native
  @JSName("DEFAULT_FORMATTER")
  var DEFAULT_FORMATTER_Original: agDashGridLib.distLibFilterTextFilterMod.TextFormatter = js.native
  @JSName("DEFAULT_LOWERCASE_FORMATTER")
  var DEFAULT_LOWERCASE_FORMATTER_Original: agDashGridLib.distLibFilterTextFilterMod.TextFormatter = js.native
  def DEFAULT_COMPARATOR(filter: java.lang.String, gridValue: js.Any, filterText: java.lang.String): scala.Boolean = js.native
  def DEFAULT_FORMATTER(from: java.lang.String): java.lang.String = js.native
  def DEFAULT_LOWERCASE_FORMATTER(from: java.lang.String): java.lang.String = js.native
}

