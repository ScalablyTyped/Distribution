package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartType
  extends StObject
     with XInterface {
  
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  val ChartType: String
  
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  val RoleOfSequenceForSeriesLabel: String
  
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  val SupportedMandatoryRoles: SafeArray[String]
  
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  val SupportedOptionalRoles: SafeArray[String]
  
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  val SupportedPropertyRoles: SafeArray[String]
  
  /**
    * Creates a coordinate systems that fits the chart-type with its current settings and for the given dimension.
    * @throws IllegalArgumentException This chart type cannot be displayed in the given dimension.
    */
  def createCoordinateSystem(DimensionCount: Double): XCoordinateSystem
  
  /** A string representation of the chart type. This needs to be the service-name which can be used to create a chart type. */
  def getChartType(): String
  
  /** Returns the role of the XLabeledDataSequence of which the label will be taken to identify the {@link DataSeries} in dialogs or the legend. */
  def getRoleOfSequenceForSeriesLabel(): String
  
  /**
    * Returns a sequence of roles that are understood by this chart type.
    *
    * All roles must be listed in the order in which they are usually parsed. This ensures that gluing sequences together and splitting them up apart again
    * results in the same structure as before.
    *
    * Note, that this does not involve optional roles, like error-bars.
    */
  def getSupportedMandatoryRoles(): SafeArray[String]
  
  /**
    * Returns a sequence of roles that are understood in addition to the mandatory roles (see {@link XChartType.getSupportedMandatoryRoles()} ).
    *
    * An example for an optional role are error-bars.
    */
  def getSupportedOptionalRoles(): SafeArray[String]
  
  /**
    * Returns a sequence with supported property mapping roles.
    *
    * An example for a property mapping role is FillColor.
    */
  def getSupportedPropertyRoles(): SafeArray[String]
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
  implicit class XChartTypeMutableBuilder[Self <: XChartType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartType(value: String): Self = StObject.set(x, "ChartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateCoordinateSystem(value: Double => XCoordinateSystem): Self = StObject.set(x, "createCoordinateSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChartType(value: () => String): Self = StObject.set(x, "getChartType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRoleOfSequenceForSeriesLabel(value: () => String): Self = StObject.set(x, "getRoleOfSequenceForSeriesLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedMandatoryRoles(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedMandatoryRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedOptionalRoles(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedOptionalRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedPropertyRoles(value: () => SafeArray[String]): Self = StObject.set(x, "getSupportedPropertyRoles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoleOfSequenceForSeriesLabel(value: String): Self = StObject.set(x, "RoleOfSequenceForSeriesLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedMandatoryRoles(value: SafeArray[String]): Self = StObject.set(x, "SupportedMandatoryRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedOptionalRoles(value: SafeArray[String]): Self = StObject.set(x, "SupportedOptionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedPropertyRoles(value: SafeArray[String]): Self = StObject.set(x, "SupportedPropertyRoles", value.asInstanceOf[js.Any])
  }
}
