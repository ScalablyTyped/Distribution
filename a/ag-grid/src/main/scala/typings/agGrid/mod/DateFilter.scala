package typings.agGrid.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "DateFilter")
@js.native
class DateFilter ()
  extends typings.agGrid.dateFilterMod.DateFilter {
  def this(template: String) = this()
}
/* static members */
object DateFilter {
  
  @JSImport("ag-grid", "DateFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeTimezone(from: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTimezone")(from.asInstanceOf[js.Any]).asInstanceOf[Date]
}
