package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides enhanced access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  * @see com.sun.star.sheet.Scenario
  * @see com.sun.star.sheet.XScenario
  * @since OOo 2.0
  */
trait XScenarioEnhanced
  extends StObject
     with XInterface {
  
  /** gets the ranges to the scenario. */
  val Ranges: SafeArray[CellRangeAddress]
  
  /** gets the ranges to the scenario. */
  def getRanges(): SafeArray[CellRangeAddress]
}
object XScenarioEnhanced {
  
  inline def apply(
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XScenarioEnhanced = {
    val __obj = js.Dynamic.literal(Ranges = Ranges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScenarioEnhanced]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XScenarioEnhanced] (val x: Self) extends AnyVal {
    
    inline def setGetRanges(value: () => SafeArray[CellRangeAddress]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    inline def setRanges(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
  }
}
