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

