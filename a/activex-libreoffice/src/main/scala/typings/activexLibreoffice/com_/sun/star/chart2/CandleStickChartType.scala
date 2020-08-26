package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** chart type service for candlestick charts. */
@js.native
trait CandleStickChartType
  extends XChartType
     with XDataSeriesContainer
     with XPropertySet {
  /**
    * If the candlestick chart shows Japanese candlesticks, that is the property {@link Japanese} is `TRUE` , the property set given here contains the
    * formatting attributes of the black boxes, i.e. the boxes shown for falling values.
    *
    * The {@link com.sun.star.beans.XPropertySet} given here must support the services {@link com.sun.star.drawing.FillProperties} and {@link
    * com.sun.star.drawing.LineProperties} .
    */
  var BlackDay: XPropertySet = js.native
  /**
    * If this property is `TRUE` , the candlesticks are shown as Japanese candlesticks. This implies that the property {@link ShowFirst} is also `TRUE` .
    *
    * Japanese candlesticks show the first and last value as boxes. A rising course (i.e. if the last value is greater than the first one) is shown by a
    * white box. A falling course is shown by a black box.
    *
    * Default is `FALSE` .
    * @see WhiteDay
    * @see BlackDay
    */
  var Japanese: Boolean = js.native
  /**
    * If this property is `TRUE` , the first value (which would be the opening course in a stock chart) is shown in the chart. This also makes the role
    * "values-first" mandatory.
    *
    * This property is only evaluated for non-Japanese candlestick charts, as Japanese candlesticks always require to show the first value.
    *
    * Default is `FALSE` .
    */
  var ShowFirst: Boolean = js.native
  /**
    * If this property is `TRUE` , the low and high values are shown in the chart. This also makes the roles "values-min" and "values-max" mandatory.
    *
    * Default is `TRUE` .
    */
  var ShowHighLow: Boolean = js.native
  /**
    * If the candlestick chart shows Japanese candlesticks, that is the property {@link Japanese} is `TRUE` , the property set given here contains the
    * formatting attributes of the white boxes, i.e. the boxes shown for rising values.
    *
    * The {@link com.sun.star.beans.XPropertySet} given here must support the services {@link com.sun.star.drawing.FillProperties} and {@link
    * com.sun.star.drawing.LineProperties} .
    */
  var WhiteDay: XPropertySet = js.native
}

object CandleStickChartType {
  @scala.inline
  def apply(
    BlackDay: XPropertySet,
    ChartType: String,
    DataSeries: SafeArray[XDataSeries],
    Japanese: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: String,
    ShowFirst: Boolean,
    ShowHighLow: Boolean,
    SupportedMandatoryRoles: SafeArray[String],
    SupportedOptionalRoles: SafeArray[String],
    SupportedPropertyRoles: SafeArray[String],
    WhiteDay: XPropertySet,
    acquire: () => Unit,
    addDataSeries: XDataSeries => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createCoordinateSystem: Double => XCoordinateSystem,
    getChartType: () => String,
    getDataSeries: () => SafeArray[XDataSeries],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRoleOfSequenceForSeriesLabel: () => String,
    getSupportedMandatoryRoles: () => SafeArray[String],
    getSupportedOptionalRoles: () => SafeArray[String],
    getSupportedPropertyRoles: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeDataSeries: XDataSeries => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setDataSeries: SeqEquiv[XDataSeries] => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): CandleStickChartType = {
    val __obj = js.Dynamic.literal(BlackDay = BlackDay.asInstanceOf[js.Any], ChartType = ChartType.asInstanceOf[js.Any], DataSeries = DataSeries.asInstanceOf[js.Any], Japanese = Japanese.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel.asInstanceOf[js.Any], ShowFirst = ShowFirst.asInstanceOf[js.Any], ShowHighLow = ShowHighLow.asInstanceOf[js.Any], SupportedMandatoryRoles = SupportedMandatoryRoles.asInstanceOf[js.Any], SupportedOptionalRoles = SupportedOptionalRoles.asInstanceOf[js.Any], SupportedPropertyRoles = SupportedPropertyRoles.asInstanceOf[js.Any], WhiteDay = WhiteDay.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addDataSeries = js.Any.fromFunction1(addDataSeries), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = js.Any.fromFunction0(getChartType), getDataSeries = js.Any.fromFunction0(getDataSeries), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRoleOfSequenceForSeriesLabel = js.Any.fromFunction0(getRoleOfSequenceForSeriesLabel), getSupportedMandatoryRoles = js.Any.fromFunction0(getSupportedMandatoryRoles), getSupportedOptionalRoles = js.Any.fromFunction0(getSupportedOptionalRoles), getSupportedPropertyRoles = js.Any.fromFunction0(getSupportedPropertyRoles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataSeries = js.Any.fromFunction1(removeDataSeries), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDataSeries = js.Any.fromFunction1(setDataSeries), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[CandleStickChartType]
  }
  @scala.inline
  implicit class CandleStickChartTypeOps[Self <: CandleStickChartType] (val x: Self) extends AnyVal {
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
    def setBlackDay(value: XPropertySet): Self = this.set("BlackDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setJapanese(value: Boolean): Self = this.set("Japanese", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowFirst(value: Boolean): Self = this.set("ShowFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHighLow(value: Boolean): Self = this.set("ShowHighLow", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteDay(value: XPropertySet): Self = this.set("WhiteDay", value.asInstanceOf[js.Any])
  }
  
}

