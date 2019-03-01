package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartType
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  val ChartType: java.lang.String
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  val RoleOfSequenceForSeriesLabel: java.lang.String
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  val SupportedMandatoryRoles: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  val SupportedOptionalRoles: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  val SupportedPropertyRoles: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Creates a coordinate systems that fits the chart-type with its current settings and for the given dimension.
    * @throws IllegalArgumentException This chart type cannot be displayed in the given dimension.
    */
  def createCoordinateSystem(DimensionCount: scala.Double): XCoordinateSystem
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  def getChartType(): java.lang.String
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  def getRoleOfSequenceForSeriesLabel(): java.lang.String
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  def getSupportedMandatoryRoles(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  def getSupportedOptionalRoles(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  def getSupportedPropertyRoles(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XChartType {
  @scala.inline
  def apply(
    ChartType: java.lang.String,
    RoleOfSequenceForSeriesLabel: java.lang.String,
    SupportedMandatoryRoles: activexDashInteropLib.SafeArray[java.lang.String],
    SupportedOptionalRoles: activexDashInteropLib.SafeArray[java.lang.String],
    SupportedPropertyRoles: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    createCoordinateSystem: js.Function1[scala.Double, XCoordinateSystem],
    getChartType: js.Function0[java.lang.String],
    getRoleOfSequenceForSeriesLabel: js.Function0[java.lang.String],
    getSupportedMandatoryRoles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSupportedOptionalRoles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getSupportedPropertyRoles: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XChartType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChartType")(ChartType)
    __obj.updateDynamic("RoleOfSequenceForSeriesLabel")(RoleOfSequenceForSeriesLabel)
    __obj.updateDynamic("SupportedMandatoryRoles")(SupportedMandatoryRoles)
    __obj.updateDynamic("SupportedOptionalRoles")(SupportedOptionalRoles)
    __obj.updateDynamic("SupportedPropertyRoles")(SupportedPropertyRoles)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createCoordinateSystem")(createCoordinateSystem)
    __obj.updateDynamic("getChartType")(getChartType)
    __obj.updateDynamic("getRoleOfSequenceForSeriesLabel")(getRoleOfSequenceForSeriesLabel)
    __obj.updateDynamic("getSupportedMandatoryRoles")(getSupportedMandatoryRoles)
    __obj.updateDynamic("getSupportedOptionalRoles")(getSupportedOptionalRoles)
    __obj.updateDynamic("getSupportedPropertyRoles")(getSupportedPropertyRoles)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XChartType]
  }
}

