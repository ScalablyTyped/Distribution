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
    acquire: js.Function0[scala.Unit],
    interpretDataSource: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries], 
      InterpretedData
    ],
    isDataCompatible: js.Function1[InterpretedData, scala.Boolean],
    mergeInterpretedData: js.Function1[
      InterpretedData, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    reinterpretDataSeries: js.Function1[InterpretedData, InterpretedData],
    release: js.Function0[scala.Unit]
  ): XDataInterpreter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("interpretDataSource")(interpretDataSource)
    __obj.updateDynamic("isDataCompatible")(isDataCompatible)
    __obj.updateDynamic("mergeInterpretedData")(mergeInterpretedData)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("reinterpretDataSeries")(reinterpretDataSeries)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataInterpreter]
  }
}

