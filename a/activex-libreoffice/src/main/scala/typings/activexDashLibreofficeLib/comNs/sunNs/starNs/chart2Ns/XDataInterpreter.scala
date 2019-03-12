package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
trait XDataInterpreter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Interprets the given data.
    * @param xSource the data source.
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    * @param aSeriesToReUse use all the data series given here for the result before creating new ones.
    */
  def interpretDataSource(
    xSource: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    aSeriesToReUse: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries]
  ): InterpretedData
  /**
    * parses the given data and states, if a {@link reinterpretDataSeries()} call can be done without data loss.
    * @returns `TRUE` , if the data given in `aInterpretedData` has a similar structure than the one required is used as output of the data interpreter.
    */
  def isDataCompatible(aInterpretedData: InterpretedData): scala.Boolean
  /**
    * Try to reverse the operation done in {@link interpretDataSource()} .
    *
    * In case `aInterpretedData` is the result of {@link interpretDataSource()} ( `xSource` ), the result of this method should be `xSource` .
    */
  def mergeInterpretedData(aInterpretedData: InterpretedData): activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
  /** Re-interprets the data given in `aInterpretedData` while keeping the number of data series and the categories. */
  def reinterpretDataSeries(aInterpretedData: InterpretedData): InterpretedData
}

object XDataInterpreter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    interpretDataSource: (activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries]) => InterpretedData,
    isDataCompatible: InterpretedData => scala.Boolean,
    mergeInterpretedData: InterpretedData => activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    reinterpretDataSeries: InterpretedData => InterpretedData,
    release: () => scala.Unit
  ): XDataInterpreter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), interpretDataSource = js.Any.fromFunction3(interpretDataSource), isDataCompatible = js.Any.fromFunction1(isDataCompatible), mergeInterpretedData = js.Any.fromFunction1(mergeInterpretedData), queryInterface = js.Any.fromFunction1(queryInterface), reinterpretDataSeries = js.Any.fromFunction1(reinterpretDataSeries), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataInterpreter]
  }
}

