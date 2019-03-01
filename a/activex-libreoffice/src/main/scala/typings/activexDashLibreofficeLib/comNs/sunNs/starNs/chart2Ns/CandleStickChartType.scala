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
    DataSeries: activexDashInteropLib.SafeArray[XDataSeries],
    Japanese: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: java.lang.String,
    ShowFirst: scala.Boolean,
    ShowHighLow: scala.Boolean,
    SupportedMandatoryRoles: activexDashInteropLib.SafeArray[java.lang.String],
    SupportedOptionalRoles: activexDashInteropLib.SafeArray[java.lang.String],
    SupportedPropertyRoles: activexDashInteropLib.SafeArray[java.lang.String],
    WhiteDay: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    addDataSeries: js.Function1[XDataSeries, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createCoordinateSystem: js.Function1[scala.Double, XCoordinateSystem],
    getChartType: js.Function0[java.lang.String],
    getDataSeries: js.Function0[activexDashInteropLib.SafeArray[XDataSeries]],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRoleOfSequenceForSeriesLabel: js.Function0[java.lang.String],
    getSupportedMandatoryRoles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSupportedOptionalRoles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSupportedPropertyRoles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDataSeries: js.Function1[XDataSeries, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setDataSeries: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries], scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): CandleStickChartType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BlackDay")(BlackDay)
    __obj.updateDynamic("ChartType")(ChartType)
    __obj.updateDynamic("DataSeries")(DataSeries)
    __obj.updateDynamic("Japanese")(Japanese)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RoleOfSequenceForSeriesLabel")(RoleOfSequenceForSeriesLabel)
    __obj.updateDynamic("ShowFirst")(ShowFirst)
    __obj.updateDynamic("ShowHighLow")(ShowHighLow)
    __obj.updateDynamic("SupportedMandatoryRoles")(SupportedMandatoryRoles)
    __obj.updateDynamic("SupportedOptionalRoles")(SupportedOptionalRoles)
    __obj.updateDynamic("SupportedPropertyRoles")(SupportedPropertyRoles)
    __obj.updateDynamic("WhiteDay")(WhiteDay)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDataSeries")(addDataSeries)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createCoordinateSystem")(createCoordinateSystem)
    __obj.updateDynamic("getChartType")(getChartType)
    __obj.updateDynamic("getDataSeries")(getDataSeries)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRoleOfSequenceForSeriesLabel")(getRoleOfSequenceForSeriesLabel)
    __obj.updateDynamic("getSupportedMandatoryRoles")(getSupportedMandatoryRoles)
    __obj.updateDynamic("getSupportedOptionalRoles")(getSupportedOptionalRoles)
    __obj.updateDynamic("getSupportedPropertyRoles")(getSupportedPropertyRoles)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDataSeries")(removeDataSeries)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setDataSeries")(setDataSeries)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[CandleStickChartType]
  }
}

