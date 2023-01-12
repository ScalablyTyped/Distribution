package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDataReceiver
  extends StObject
     with XInterface {
  
  /**
    * Returns a component at which a view representing the data of the attached data provider may listen for highlighting the data ranges used by the
    * currently selected objects in the data receiver component.
    *
    * This is typically used by a spreadsheet to highlight the ranges used by the currently selected object in a chart.
    *
    * The range highlighter is optional, i.e., this method may return an empty object.
    */
  val RangeHighlighter: XRangeHighlighter
  
  /** Returns the data requested by the most recently attached data provider, that is still used. */
  val UsedData: XDataSource
  
  /**
    * returns a list of all range strings for which data has been requested by the most recently attached data provider, and which is still used.
    *
    * This list may be used by the data provider to swap charts out of memory, but still get informed by changes of ranges while the chart is not loaded.
    * @returns a list of used range strings.
    */
  val UsedRangeRepresentations: SafeArray[String]
  
  /**
    * attaches a component that provides data for the document.
    *
    * The previously set data provider will be released.
    * @param xProvider The new {@link DataProvider} . If it is an empty reference, the {@link ChartDocument} will have no data.
    */
  def attachDataProvider(xProvider: XDataProvider): Unit
  
  /**
    * attaches an XNumberFormatsSupplier to this {@link XDataReceiver} .
    *
    * The given number formats will be used for display purposes.
    */
  def attachNumberFormatsSupplier(xSupplier: XNumberFormatsSupplier): Unit
  
  /**
    * Returns a component at which a view representing the data of the attached data provider may listen for highlighting the data ranges used by the
    * currently selected objects in the data receiver component.
    *
    * This is typically used by a spreadsheet to highlight the ranges used by the currently selected object in a chart.
    *
    * The range highlighter is optional, i.e., this method may return an empty object.
    */
  def getRangeHighlighter(): XRangeHighlighter
  
  /** Returns the data requested by the most recently attached data provider, that is still used. */
  def getUsedData(): XDataSource
  
  /**
    * returns a list of all range strings for which data has been requested by the most recently attached data provider, and which is still used.
    *
    * This list may be used by the data provider to swap charts out of memory, but still get informed by changes of ranges while the chart is not loaded.
    * @returns a list of used range strings.
    */
  def getUsedRangeRepresentations(): SafeArray[String]
  
  def setArguments(aArguments: SeqEquiv[PropertyValue]): Unit
}
object XDataReceiver {
  
  inline def apply(
    RangeHighlighter: XRangeHighlighter,
    UsedData: XDataSource,
    UsedRangeRepresentations: SafeArray[String],
    acquire: () => Unit,
    attachDataProvider: XDataProvider => Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Unit,
    getRangeHighlighter: () => XRangeHighlighter,
    getUsedData: () => XDataSource,
    getUsedRangeRepresentations: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit,
    setArguments: SeqEquiv[PropertyValue] => Unit
  ): XDataReceiver = {
    val __obj = js.Dynamic.literal(RangeHighlighter = RangeHighlighter.asInstanceOf[js.Any], UsedData = UsedData.asInstanceOf[js.Any], UsedRangeRepresentations = UsedRangeRepresentations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachDataProvider = js.Any.fromFunction1(attachDataProvider), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), getRangeHighlighter = js.Any.fromFunction0(getRangeHighlighter), getUsedData = js.Any.fromFunction0(getUsedData), getUsedRangeRepresentations = js.Any.fromFunction0(getUsedRangeRepresentations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setArguments = js.Any.fromFunction1(setArguments))
    __obj.asInstanceOf[XDataReceiver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataReceiver] (val x: Self) extends AnyVal {
    
    inline def setAttachDataProvider(value: XDataProvider => Unit): Self = StObject.set(x, "attachDataProvider", js.Any.fromFunction1(value))
    
    inline def setAttachNumberFormatsSupplier(value: XNumberFormatsSupplier => Unit): Self = StObject.set(x, "attachNumberFormatsSupplier", js.Any.fromFunction1(value))
    
    inline def setGetRangeHighlighter(value: () => XRangeHighlighter): Self = StObject.set(x, "getRangeHighlighter", js.Any.fromFunction0(value))
    
    inline def setGetUsedData(value: () => XDataSource): Self = StObject.set(x, "getUsedData", js.Any.fromFunction0(value))
    
    inline def setGetUsedRangeRepresentations(value: () => SafeArray[String]): Self = StObject.set(x, "getUsedRangeRepresentations", js.Any.fromFunction0(value))
    
    inline def setRangeHighlighter(value: XRangeHighlighter): Self = StObject.set(x, "RangeHighlighter", value.asInstanceOf[js.Any])
    
    inline def setSetArguments(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setArguments", js.Any.fromFunction1(value))
    
    inline def setUsedData(value: XDataSource): Self = StObject.set(x, "UsedData", value.asInstanceOf[js.Any])
    
    inline def setUsedRangeRepresentations(value: SafeArray[String]): Self = StObject.set(x, "UsedRangeRepresentations", value.asInstanceOf[js.Any])
  }
}
