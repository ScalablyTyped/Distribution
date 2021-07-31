package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
trait XDataInterpreter
  extends StObject
     with XInterface {
  
  /**
    * Interprets the given data.
    * @param xSource the data source.
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    * @param aSeriesToReUse use all the data series given here for the result before creating new ones.
    */
  def interpretDataSource(xSource: XDataSource, aArguments: SeqEquiv[PropertyValue], aSeriesToReUse: SeqEquiv[XDataSeries]): InterpretedData
  
  /**
    * parses the given data and states, if a {@link reinterpretDataSeries()} call can be done without data loss.
    * @returns `TRUE` , if the data given in `aInterpretedData` has a similar structure than the one required is used as output of the data interpreter.
    */
  def isDataCompatible(aInterpretedData: InterpretedData): Boolean
  
  /**
    * Try to reverse the operation done in {@link interpretDataSource()} .
    *
    * In case `aInterpretedData` is the result of {@link interpretDataSource()} ( `xSource` ), the result of this method should be `xSource` .
    */
  def mergeInterpretedData(aInterpretedData: InterpretedData): XDataSource
  
  /** Re-interprets the data given in `aInterpretedData` while keeping the number of data series and the categories. */
  def reinterpretDataSeries(aInterpretedData: InterpretedData): InterpretedData
}
object XDataInterpreter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    interpretDataSource: (XDataSource, SeqEquiv[PropertyValue], SeqEquiv[XDataSeries]) => InterpretedData,
    isDataCompatible: InterpretedData => Boolean,
    mergeInterpretedData: InterpretedData => XDataSource,
    queryInterface: `type` => js.Any,
    reinterpretDataSeries: InterpretedData => InterpretedData,
    release: () => Unit
  ): XDataInterpreter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), interpretDataSource = js.Any.fromFunction3(interpretDataSource), isDataCompatible = js.Any.fromFunction1(isDataCompatible), mergeInterpretedData = js.Any.fromFunction1(mergeInterpretedData), queryInterface = js.Any.fromFunction1(queryInterface), reinterpretDataSeries = js.Any.fromFunction1(reinterpretDataSeries), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataInterpreter]
  }
  
  @scala.inline
  implicit class XDataInterpreterMutableBuilder[Self <: XDataInterpreter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterpretDataSource(value: (XDataSource, SeqEquiv[PropertyValue], SeqEquiv[XDataSeries]) => InterpretedData): Self = StObject.set(x, "interpretDataSource", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsDataCompatible(value: InterpretedData => Boolean): Self = StObject.set(x, "isDataCompatible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMergeInterpretedData(value: InterpretedData => XDataSource): Self = StObject.set(x, "mergeInterpretedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReinterpretDataSeries(value: InterpretedData => InterpretedData): Self = StObject.set(x, "reinterpretDataSeries", js.Any.fromFunction1(value))
  }
}
