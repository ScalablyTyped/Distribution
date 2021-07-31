package typings.agGrid.mainMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "DateFilter")
@js.native
class DateFilter ()
  extends typings.agGrid.dateFilterMod.DateFilter {
  def this(template: String) = this()
}
/* static members */
object DateFilter {
  
  @JSImport("ag-grid/dist/lib/main", "DateFilter")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def removeTimezone(from: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTimezone")(from.asInstanceOf[js.Any]).asInstanceOf[Date]
}
