package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.activexLibreofficeInts.`0`
import typings.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies if the data rows (aka data series) displayed in the chart, take their values from the row or the column in the underlying data source (
  * {@link ChartDataArray} ).
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeInts.`1`
  - typings.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait ChartDataRowSource extends StObject
object ChartDataRowSource {
  
  /** values displayed as data rows are taken from the columns of the data source. */
  inline def COLUMNS: `1` = 1.asInstanceOf[`1`]
  
  /** values displayed as data rows are taken from the rows of the data source. */
  inline def ROWS: `0` = 0.asInstanceOf[`0`]
}
