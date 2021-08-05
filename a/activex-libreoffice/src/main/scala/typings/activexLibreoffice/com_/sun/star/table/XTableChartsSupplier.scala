package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to access a collection of charts in a table or spreadsheet. */
trait XTableChartsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  val Charts: XTableCharts
  
  /**
    * returns the collection of charts.
    * @see com.sun.star.table.TableCharts
    */
  def getCharts(): XTableCharts
}
object XTableChartsSupplier {
  
  inline def apply(
    Charts: XTableCharts,
    acquire: () => Unit,
    getCharts: () => XTableCharts,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTableChartsSupplier = {
    val __obj = js.Dynamic.literal(Charts = Charts.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCharts = js.Any.fromFunction0(getCharts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTableChartsSupplier]
  }
  
  extension [Self <: XTableChartsSupplier](x: Self) {
    
    inline def setCharts(value: XTableCharts): Self = StObject.set(x, "Charts", value.asInstanceOf[js.Any])
    
    inline def setGetCharts(value: () => XTableCharts): Self = StObject.set(x, "getCharts", js.Any.fromFunction0(value))
  }
}
