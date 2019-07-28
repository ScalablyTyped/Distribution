package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** {@link ChartType} service */
trait ChartType
  extends XChartType
     with XDataSeriesContainer
     with XPropertySet

object ChartType {
  @scala.inline
  def apply(
    ChartType: String,
    DataSeries: SafeArray[XDataSeries],
    PropertySetInfo: XPropertySetInfo,
    RoleOfSequenceForSeriesLabel: String,
    SupportedMandatoryRoles: SafeArray[String],
    SupportedOptionalRoles: SafeArray[String],
    SupportedPropertyRoles: SafeArray[String],
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
  ): ChartType = {
    val __obj = js.Dynamic.literal(ChartType = ChartType, DataSeries = DataSeries, PropertySetInfo = PropertySetInfo, RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel, SupportedMandatoryRoles = SupportedMandatoryRoles, SupportedOptionalRoles = SupportedOptionalRoles, SupportedPropertyRoles = SupportedPropertyRoles, acquire = js.Any.fromFunction0(acquire), addDataSeries = js.Any.fromFunction1(addDataSeries), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = js.Any.fromFunction0(getChartType), getDataSeries = js.Any.fromFunction0(getDataSeries), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRoleOfSequenceForSeriesLabel = js.Any.fromFunction0(getRoleOfSequenceForSeriesLabel), getSupportedMandatoryRoles = js.Any.fromFunction0(getSupportedMandatoryRoles), getSupportedOptionalRoles = js.Any.fromFunction0(getSupportedOptionalRoles), getSupportedPropertyRoles = js.Any.fromFunction0(getSupportedPropertyRoles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataSeries = js.Any.fromFunction1(removeDataSeries), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDataSeries = js.Any.fromFunction1(setDataSeries), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartType]
  }
}

