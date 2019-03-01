package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link ChartType} service */
trait ChartType
  extends XChartType
     with XDataSeriesContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet

object ChartType {
  @scala.inline
  def apply(
    ChartType: java.lang.String,
    DataSeries: activexDashInteropLib.SafeArray[XDataSeries],
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: java.lang.String,
    SupportedMandatoryRoles: activexDashInteropLib.SafeArray[java.lang.String],
    SupportedOptionalRoles: activexDashInteropLib.SafeArray[java.lang.String],
    SupportedPropertyRoles: activexDashInteropLib.SafeArray[java.lang.String],
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
  ): ChartType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChartType")(ChartType)
    __obj.updateDynamic("DataSeries")(DataSeries)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RoleOfSequenceForSeriesLabel")(RoleOfSequenceForSeriesLabel)
    __obj.updateDynamic("SupportedMandatoryRoles")(SupportedMandatoryRoles)
    __obj.updateDynamic("SupportedOptionalRoles")(SupportedOptionalRoles)
    __obj.updateDynamic("SupportedPropertyRoles")(SupportedPropertyRoles)
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
    __obj.asInstanceOf[ChartType]
  }
}

