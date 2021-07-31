package typings.agGrid.mainMod

import typings.agGrid.textFilterMod.TextComparator
import typings.agGrid.textFilterMod.TextFormatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "TextFilter")
@js.native
class TextFilter ()
  extends typings.agGrid.textFilterMod.TextFilter {
  def this(template: String) = this()
}
/* static members */
object TextFilter {
  
  @JSImport("ag-grid/dist/lib/main", "TextFilter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "TextFilter.DEFAULT_COMPARATOR")
  @js.native
  def DEFAULT_COMPARATOR: TextComparator = js.native
  @scala.inline
  def DEFAULT_COMPARATOR(filter: String, gridValue: js.Any, filterText: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_COMPARATOR")(filter.asInstanceOf[js.Any], gridValue.asInstanceOf[js.Any], filterText.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def DEFAULT_COMPARATOR_=(x: TextComparator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPARATOR")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "TextFilter.DEFAULT_FORMATTER")
  @js.native
  def DEFAULT_FORMATTER: TextFormatter = js.native
  @scala.inline
  def DEFAULT_FORMATTER(from: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_FORMATTER")(from.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def DEFAULT_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_FORMATTER")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "TextFilter.DEFAULT_LOWERCASE_FORMATTER")
  @js.native
  def DEFAULT_LOWERCASE_FORMATTER: TextFormatter = js.native
  @scala.inline
  def DEFAULT_LOWERCASE_FORMATTER(from: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_LOWERCASE_FORMATTER")(from.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def DEFAULT_LOWERCASE_FORMATTER_=(x: TextFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_LOWERCASE_FORMATTER")(x.asInstanceOf[js.Any])
}
