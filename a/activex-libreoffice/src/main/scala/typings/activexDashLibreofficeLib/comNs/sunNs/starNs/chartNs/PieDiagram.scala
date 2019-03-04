package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** a service for pie diagrams. */
trait PieDiagram
  extends Diagram
     with Dim3DDiagram

object PieDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: scala.Boolean,
    AutomaticSize: scala.Boolean,
    DataCaption: scala.Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: java.lang.String,
    Dim3D: scala.Boolean,
    Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    MissingValueTreatment: scala.Double,
    Perspective: scala.Double,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RotationHorizontal: scala.Double,
    RotationVertical: scala.Double,
    SecondXAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondYAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
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
    calculateDiagramPositionExcludingAxes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    calculateDiagramPositionIncludingAxes: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    calculateDiagramPositionIncludingAxesAndAxisTitles: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getAxis: js.Function1[scala.Double, XAxis],
    getDataPointProperties: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
    ],
    getDataRowProperties: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getDiagramType: js.Function0[java.lang.String],
    getFloor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSecondXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondaryAxis: js.Function1[scala.Double, XAxis],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getWall: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    isAutomaticDiagramPositioning: js.Function0[scala.Boolean],
    isExcludingDiagramPositioning: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    set3DSettingsToDefault: js.Function0[scala.Unit],
    setAutomaticDiagramPositioning: js.Function0[scala.Unit],
    setDefaultIllumination: js.Function0[scala.Unit],
    setDefaultRotation: js.Function0[scala.Unit],
    setDiagramPositionExcludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxesAndAxisTitles: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): PieDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, Dim3D = Dim3D, Floor = Floor, MissingValueTreatment = MissingValueTreatment, Perspective = Perspective, Position = Position, PropertySetInfo = PropertySetInfo, RotationHorizontal = RotationHorizontal, RotationVertical = RotationVertical, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, ShapeType = ShapeType, Size = Size, UserDefinedAttributes = UserDefinedAttributes, Wall = Wall, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles, getAxis = getAxis, getDataPointProperties = getDataPointProperties, getDataRowProperties = getDataRowProperties, getDiagramType = getDiagramType, getFloor = getFloor, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSecondXAxisTitle = getSecondXAxisTitle, getSecondYAxisTitle = getSecondYAxisTitle, getSecondaryAxis = getSecondaryAxis, getShapeType = getShapeType, getSize = getSize, getWall = getWall, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning, isExcludingDiagramPositioning = isExcludingDiagramPositioning, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, set3DSettingsToDefault = set3DSettingsToDefault, setAutomaticDiagramPositioning = setAutomaticDiagramPositioning, setDefaultIllumination = setDefaultIllumination, setDefaultRotation = setDefaultRotation, setDiagramPositionExcludingAxes = setDiagramPositionExcludingAxes, setDiagramPositionIncludingAxes = setDiagramPositionIncludingAxes, setDiagramPositionIncludingAxesAndAxisTitles = setDiagramPositionIncludingAxesAndAxisTitles, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize)
  
    __obj.asInstanceOf[PieDiagram]
  }
}

