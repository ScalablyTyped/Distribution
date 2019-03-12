package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** chart type service for candlestick charts. */
trait CandleStickChartType extends ChartType {
  /**
    * If the candlestick chart shows Japanese candlesticks, that is the property {@link Japanese} is `TRUE` , the property set given here contains the
    * formatting attributes of the black boxes, i.e. the boxes shown for falling values.
    *
    * The {@link com.sun.star.beans.XPropertySet} given here must support the services {@link com.sun.star.drawing.FillProperties} and {@link
    * com.sun.star.drawing.LineProperties} .
    */
  var BlackDay: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
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
  var Japanese: scala.Boolean
  /**
    * If this property is `TRUE` , the first value (which would be the opening course in a stock chart) is shown in the chart. This also makes the role
    * "values-first" mandatory.
    *
    * This property is only evaluated for non-Japanese candlestick charts, as Japanese candlesticks always require to show the first value.
    *
    * Default is `FALSE` .
    */
  var ShowFirst: scala.Boolean
  /**
    * If this property is `TRUE` , the low and high values are shown in the chart. This also makes the roles "values-min" and "values-max" mandatory.
    *
    * Default is `TRUE` .
    */
  var ShowHighLow: scala.Boolean
  /**
    * If the candlestick chart shows Japanese candlesticks, that is the property {@link Japanese} is `TRUE` , the property set given here contains the
    * formatting attributes of the white boxes, i.e. the boxes shown for rising values.
    *
    * The {@link com.sun.star.beans.XPropertySet} given here must support the services {@link com.sun.star.drawing.FillProperties} and {@link
    * com.sun.star.drawing.LineProperties} .
    */
  var WhiteDay: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object CandleStickChartType {
  @scala.inline
  def apply(
    BlackDay: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ChartType: java.lang.String,
    DataSeries: stdLib.SafeArray[XDataSeries],
    Japanese: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: java.lang.String,
    ShowFirst: scala.Boolean,
    ShowHighLow: scala.Boolean,
    SupportedMandatoryRoles: stdLib.SafeArray[java.lang.String],
    SupportedOptionalRoles: stdLib.SafeArray[java.lang.String],
    SupportedPropertyRoles: stdLib.SafeArray[java.lang.String],
    WhiteDay: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: () => scala.Unit,
    addDataSeries: XDataSeries => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    createCoordinateSystem: scala.Double => XCoordinateSystem,
    getChartType: () => java.lang.String,
    getDataSeries: () => stdLib.SafeArray[XDataSeries],
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getRoleOfSequenceForSeriesLabel: () => java.lang.String,
    getSupportedMandatoryRoles: () => stdLib.SafeArray[java.lang.String],
    getSupportedOptionalRoles: () => stdLib.SafeArray[java.lang.String],
    getSupportedPropertyRoles: () => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeDataSeries: XDataSeries => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setDataSeries: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries] => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): CandleStickChartType = {
    val __obj = js.Dynamic.literal(BlackDay = BlackDay, ChartType = ChartType, DataSeries = DataSeries, Japanese = Japanese, PropertySetInfo = PropertySetInfo, RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel, ShowFirst = ShowFirst, ShowHighLow = ShowHighLow, SupportedMandatoryRoles = SupportedMandatoryRoles, SupportedOptionalRoles = SupportedOptionalRoles, SupportedPropertyRoles = SupportedPropertyRoles, WhiteDay = WhiteDay, acquire = js.Any.fromFunction0(acquire), addDataSeries = js.Any.fromFunction1(addDataSeries), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = js.Any.fromFunction0(getChartType), getDataSeries = js.Any.fromFunction0(getDataSeries), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRoleOfSequenceForSeriesLabel = js.Any.fromFunction0(getRoleOfSequenceForSeriesLabel), getSupportedMandatoryRoles = js.Any.fromFunction0(getSupportedMandatoryRoles), getSupportedOptionalRoles = js.Any.fromFunction0(getSupportedOptionalRoles), getSupportedPropertyRoles = js.Any.fromFunction0(getSupportedPropertyRoles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataSeries = js.Any.fromFunction1(removeDataSeries), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDataSeries = js.Any.fromFunction1(setDataSeries), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[CandleStickChartType]
  }
}

