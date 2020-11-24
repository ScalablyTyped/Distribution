package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XChartType extends XInterface {
  
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  val ChartType: String = js.native
  
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  val RoleOfSequenceForSeriesLabel: String = js.native
  
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  val SupportedMandatoryRoles: SafeArray[String] = js.native
  
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  val SupportedOptionalRoles: SafeArray[String] = js.native
  
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  val SupportedPropertyRoles: SafeArray[String] = js.native
  
  /**
    * Creates a coordinate systems that fits the chart-type with its current settings and for the given dimension.
    * @throws IllegalArgumentException This chart type cannot be displayed in the given dimension.
    */
  def createCoordinateSystem(DimensionCount: Double): XCoordinateSystem = js.native
  
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  def getChartType(): String = js.native
  
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  def getRoleOfSequenceForSeriesLabel(): String = js.native
  
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  def getSupportedMandatoryRoles(): SafeArray[String] = js.native
  
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  def getSupportedOptionalRoles(): SafeArray[String] = js.native
  
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  def getSupportedPropertyRoles(): SafeArray[String] = js.native
}
object XChartType {
  
  @scala.inline
  def apply(
    ChartType: String,
    RoleOfSequenceForSeriesLabel: String,
    SupportedMandatoryRoles: SafeArray[String],
    SupportedOptionalRoles: SafeArray[String],
    SupportedPropertyRoles: SafeArray[String],
    acquire: () => Unit,
    createCoordinateSystem: Double => XCoordinateSystem,
    getChartType: () => String,
    getRoleOfSequenceForSeriesLabel: () => String,
    getSupportedMandatoryRoles: () => SafeArray[String],
    getSupportedOptionalRoles: () => SafeArray[String],
    getSupportedPropertyRoles: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChartType = {
    val __obj = js.Dynamic.literal(ChartType = ChartType.asInstanceOf[js.Any], RoleOfSequenceForSeriesLabel = RoleOfSequenceForSeriesLabel.asInstanceOf[js.Any], SupportedMandatoryRoles = SupportedMandatoryRoles.asInstanceOf[js.Any], SupportedOptionalRoles = SupportedOptionalRoles.asInstanceOf[js.Any], SupportedPropertyRoles = SupportedPropertyRoles.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createCoordinateSystem = js.Any.fromFunction1(createCoordinateSystem), getChartType = js.Any.fromFunction0(getChartType), getRoleOfSequenceForSeriesLabel = js.Any.fromFunction0(getRoleOfSequenceForSeriesLabel), getSupportedMandatoryRoles = js.Any.fromFunction0(getSupportedMandatoryRoles), getSupportedOptionalRoles = js.Any.fromFunction0(getSupportedOptionalRoles), getSupportedPropertyRoles = js.Any.fromFunction0(getSupportedPropertyRoles), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChartType]
  }
  
  @scala.inline
  implicit class XChartTypeOps[Self <: XChartType] (val x: Self) extends AnyVal {
    
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
    def setChartType(value: String): Self = this.set("ChartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleOfSequenceForSeriesLabel(value: String): Self = this.set("RoleOfSequenceForSeriesLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedMandatoryRoles(value: SafeArray[String]): Self = this.set("SupportedMandatoryRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOptionalRoles(value: SafeArray[String]): Self = this.set("SupportedOptionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPropertyRoles(value: SafeArray[String]): Self = this.set("SupportedPropertyRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCoordinateSystem(value: Double => XCoordinateSystem): Self = this.set("createCoordinateSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChartType(value: () => String): Self = this.set("getChartType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRoleOfSequenceForSeriesLabel(value: () => String): Self = this.set("getRoleOfSequenceForSeriesLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedMandatoryRoles(value: () => SafeArray[String]): Self = this.set("getSupportedMandatoryRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedOptionalRoles(value: () => SafeArray[String]): Self = this.set("getSupportedOptionalRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedPropertyRoles(value: () => SafeArray[String]): Self = this.set("getSupportedPropertyRoles", js.Any.fromFunction0(value))
  }
}
