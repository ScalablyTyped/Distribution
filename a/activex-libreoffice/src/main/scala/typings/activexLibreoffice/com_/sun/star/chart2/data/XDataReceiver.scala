package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDataReceiver extends XInterface {
  /**
    * Returns a component at which a view representing the data of the attached data provider may listen for highlighting the data ranges used by the
    * currently selected objects in the data receiver component.
    *
    * This is typically used by a spreadsheet to highlight the ranges used by the currently selected object in a chart.
    *
    * The range highlighter is optional, i.e., this method may return an empty object.
    */
  val RangeHighlighter: XRangeHighlighter = js.native
  /** Returns the data requested by the most recently attached data provider, that is still used. */
  val UsedData: XDataSource = js.native
  /**
    * returns a list of all range strings for which data has been requested by the most recently attached data provider, and which is still used.
    *
    * This list may be used by the data provider to swap charts out of memory, but still get informed by changes of ranges while the chart is not loaded.
    * @returns a list of used range strings.
    */
  val UsedRangeRepresentations: SafeArray[String] = js.native
  /**
    * attaches a component that provides data for the document.
    *
    * The previously set data provider will be released.
    * @param xProvider The new {@link DataProvider} . If it is an empty reference, the {@link ChartDocument} will have no data.
    */
  def attachDataProvider(xProvider: XDataProvider): Unit = js.native
  /**
    * attaches an XNumberFormatsSupplier to this {@link XDataReceiver} .
    *
    * The given number formats will be used for display purposes.
    */
  def attachNumberFormatsSupplier(xSupplier: XNumberFormatsSupplier): Unit = js.native
  /**
    * Returns a component at which a view representing the data of the attached data provider may listen for highlighting the data ranges used by the
    * currently selected objects in the data receiver component.
    *
    * This is typically used by a spreadsheet to highlight the ranges used by the currently selected object in a chart.
    *
    * The range highlighter is optional, i.e., this method may return an empty object.
    */
  def getRangeHighlighter(): XRangeHighlighter = js.native
  /** Returns the data requested by the most recently attached data provider, that is still used. */
  def getUsedData(): XDataSource = js.native
  /**
    * returns a list of all range strings for which data has been requested by the most recently attached data provider, and which is still used.
    *
    * This list may be used by the data provider to swap charts out of memory, but still get informed by changes of ranges while the chart is not loaded.
    * @returns a list of used range strings.
    */
  def getUsedRangeRepresentations(): SafeArray[String] = js.native
  def setArguments(aArguments: SeqEquiv[PropertyValue]): Unit = js.native
}

object XDataReceiver {
  @scala.inline
  def apply(
    RangeHighlighter: XRangeHighlighter,
    UsedData: XDataSource,
    UsedRangeRepresentations: SafeArray[String],
    acquire: () => Unit,
    attachDataProvider: XDataProvider => Unit,
    attachNumberFormatsSupplier: XNumberFormatsSupplier => Unit,
    getRangeHighlighter: () => XRangeHighlighter,
    getUsedData: () => XDataSource,
    getUsedRangeRepresentations: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setArguments: SeqEquiv[PropertyValue] => Unit
  ): XDataReceiver = {
    val __obj = js.Dynamic.literal(RangeHighlighter = RangeHighlighter.asInstanceOf[js.Any], UsedData = UsedData.asInstanceOf[js.Any], UsedRangeRepresentations = UsedRangeRepresentations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), attachDataProvider = js.Any.fromFunction1(attachDataProvider), attachNumberFormatsSupplier = js.Any.fromFunction1(attachNumberFormatsSupplier), getRangeHighlighter = js.Any.fromFunction0(getRangeHighlighter), getUsedData = js.Any.fromFunction0(getUsedData), getUsedRangeRepresentations = js.Any.fromFunction0(getUsedRangeRepresentations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setArguments = js.Any.fromFunction1(setArguments))
    __obj.asInstanceOf[XDataReceiver]
  }
  @scala.inline
  implicit class XDataReceiverOps[Self <: XDataReceiver] (val x: Self) extends AnyVal {
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
    def setRangeHighlighter(value: XRangeHighlighter): Self = this.set("RangeHighlighter", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedData(value: XDataSource): Self = this.set("UsedData", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedRangeRepresentations(value: SafeArray[String]): Self = this.set("UsedRangeRepresentations", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachDataProvider(value: XDataProvider => Unit): Self = this.set("attachDataProvider", js.Any.fromFunction1(value))
    @scala.inline
    def setAttachNumberFormatsSupplier(value: XNumberFormatsSupplier => Unit): Self = this.set("attachNumberFormatsSupplier", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRangeHighlighter(value: () => XRangeHighlighter): Self = this.set("getRangeHighlighter", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUsedData(value: () => XDataSource): Self = this.set("getUsedData", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUsedRangeRepresentations(value: () => SafeArray[String]): Self = this.set("getUsedRangeRepresentations", js.Any.fromFunction0(value))
    @scala.inline
    def setSetArguments(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("setArguments", js.Any.fromFunction1(value))
  }
  
}

