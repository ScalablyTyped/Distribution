package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a chart object in a table or spreadsheet.
  * @see com.sun.star.table.TableChart
  */
trait XTableChart
  extends StObject
     with XInterface {
  
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  var HasColumnHeaders: Boolean
  
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  var HasRowHeaders: Boolean
  
  /** returns the cell ranges that contain the data for the chart. */
  var Ranges: SafeArray[CellRangeAddress]
  
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  def getHasColumnHeaders(): Boolean
  
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def getHasRowHeaders(): Boolean
  
  /** returns the cell ranges that contain the data for the chart. */
  def getRanges(): SafeArray[CellRangeAddress]
  
  /** specifies whether the cells of the topmost row of the source data are interpreted as column headers. */
  def setHasColumnHeaders(bHasColumnHeaders: Boolean): Unit
  
  /** specifies whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def setHasRowHeaders(bHasRowHeaders: Boolean): Unit
  
  /** sets the cell ranges that contain the data for the chart. */
  def setRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit
}
object XTableChart {
  
  inline def apply(
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getHasColumnHeaders: () => Boolean,
    getHasRowHeaders: () => Boolean,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => Any,
    release: () => Unit,
    setHasColumnHeaders: Boolean => Unit,
    setHasRowHeaders: Boolean => Unit,
    setRanges: SeqEquiv[CellRangeAddress] => Unit
  ): XTableChart = {
    val __obj = js.Dynamic.literal(HasColumnHeaders = HasColumnHeaders.asInstanceOf[js.Any], HasRowHeaders = HasRowHeaders.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setRanges = js.Any.fromFunction1(setRanges))
    __obj.asInstanceOf[XTableChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XTableChart] (val x: Self) extends AnyVal {
    
    inline def setGetHasColumnHeaders(value: () => Boolean): Self = StObject.set(x, "getHasColumnHeaders", js.Any.fromFunction0(value))
    
    inline def setGetHasRowHeaders(value: () => Boolean): Self = StObject.set(x, "getHasRowHeaders", js.Any.fromFunction0(value))
    
    inline def setGetRanges(value: () => SafeArray[CellRangeAddress]): Self = StObject.set(x, "getRanges", js.Any.fromFunction0(value))
    
    inline def setHasColumnHeaders(value: Boolean): Self = StObject.set(x, "HasColumnHeaders", value.asInstanceOf[js.Any])
    
    inline def setHasRowHeaders(value: Boolean): Self = StObject.set(x, "HasRowHeaders", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
    
    inline def setSetHasColumnHeaders(value: Boolean => Unit): Self = StObject.set(x, "setHasColumnHeaders", js.Any.fromFunction1(value))
    
    inline def setSetHasRowHeaders(value: Boolean => Unit): Self = StObject.set(x, "setHasRowHeaders", js.Any.fromFunction1(value))
    
    inline def setSetRanges(value: SeqEquiv[CellRangeAddress] => Unit): Self = StObject.set(x, "setRanges", js.Any.fromFunction1(value))
  }
}
