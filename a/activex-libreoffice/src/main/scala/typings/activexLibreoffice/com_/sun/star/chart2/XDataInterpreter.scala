package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
@js.native
trait XDataInterpreter extends XInterface {
  /**
    * Interprets the given data.
    * @param xSource the data source.
    * @param aArguments Arguments that tell the template how to slice the given range. The properties should be defined in a separate service.  For standard p
    * @param aSeriesToReUse use all the data series given here for the result before creating new ones.
    */
  def interpretDataSource(xSource: XDataSource, aArguments: SeqEquiv[PropertyValue], aSeriesToReUse: SeqEquiv[XDataSeries]): InterpretedData = js.native
  /**
    * parses the given data and states, if a {@link reinterpretDataSeries()} call can be done without data loss.
    * @returns `TRUE` , if the data given in `aInterpretedData` has a similar structure than the one required is used as output of the data interpreter.
    */
  def isDataCompatible(aInterpretedData: InterpretedData): Boolean = js.native
  /**
    * Try to reverse the operation done in {@link interpretDataSource()} .
    *
    * In case `aInterpretedData` is the result of {@link interpretDataSource()} ( `xSource` ), the result of this method should be `xSource` .
    */
  def mergeInterpretedData(aInterpretedData: InterpretedData): XDataSource = js.native
  /** Re-interprets the data given in `aInterpretedData` while keeping the number of data series and the categories. */
  def reinterpretDataSeries(aInterpretedData: InterpretedData): InterpretedData = js.native
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
  implicit class XDataInterpreterOps[Self <: XDataInterpreter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInterpretDataSource(value: (XDataSource, SeqEquiv[PropertyValue], SeqEquiv[XDataSeries]) => InterpretedData): Self = this.set("interpretDataSource", js.Any.fromFunction3(value))
    @scala.inline
    def setIsDataCompatible(value: InterpretedData => Boolean): Self = this.set("isDataCompatible", js.Any.fromFunction1(value))
    @scala.inline
    def setMergeInterpretedData(value: InterpretedData => XDataSource): Self = this.set("mergeInterpretedData", js.Any.fromFunction1(value))
    @scala.inline
    def setReinterpretDataSeries(value: InterpretedData => InterpretedData): Self = this.set("reinterpretDataSeries", js.Any.fromFunction1(value))
  }
  
}

