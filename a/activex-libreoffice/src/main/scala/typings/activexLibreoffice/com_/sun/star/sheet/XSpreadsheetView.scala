package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the main interface of a {@link SpreadsheetView} . It manages the active sheet within this view. */
trait XSpreadsheetView
  extends StObject
     with XInterface {
  
  /** returns the sheet that is shown in the view. */
  var ActiveSheet: XSpreadsheet
  
  /** returns the sheet that is shown in the view. */
  def getActiveSheet(): XSpreadsheet
  
  /** sets the sheet that is shown in the view. */
  def setActiveSheet(xActiveSheet: XSpreadsheet): Unit
}
object XSpreadsheetView {
  
  inline def apply(
    ActiveSheet: XSpreadsheet,
    acquire: () => Unit,
    getActiveSheet: () => XSpreadsheet,
    queryInterface: `type` => Any,
    release: () => Unit,
    setActiveSheet: XSpreadsheet => Unit
  ): XSpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getActiveSheet = js.Any.fromFunction0(getActiveSheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setActiveSheet = js.Any.fromFunction1(setActiveSheet))
    __obj.asInstanceOf[XSpreadsheetView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSpreadsheetView] (val x: Self) extends AnyVal {
    
    inline def setActiveSheet(value: XSpreadsheet): Self = StObject.set(x, "ActiveSheet", value.asInstanceOf[js.Any])
    
    inline def setGetActiveSheet(value: () => XSpreadsheet): Self = StObject.set(x, "getActiveSheet", js.Any.fromFunction0(value))
    
    inline def setSetActiveSheet(value: XSpreadsheet => Unit): Self = StObject.set(x, "setActiveSheet", js.Any.fromFunction1(value))
  }
}
