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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticPosition")(AutomaticPosition)
    __obj.updateDynamic("AutomaticSize")(AutomaticSize)
    __obj.updateDynamic("DataCaption")(DataCaption)
    __obj.updateDynamic("DataRowSource")(DataRowSource)
    __obj.updateDynamic("DiagramType")(DiagramType)
    __obj.updateDynamic("Dim3D")(Dim3D)
    __obj.updateDynamic("Floor")(Floor)
    __obj.updateDynamic("MissingValueTreatment")(MissingValueTreatment)
    __obj.updateDynamic("Perspective")(Perspective)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RotationHorizontal")(RotationHorizontal)
    __obj.updateDynamic("RotationVertical")(RotationVertical)
    __obj.updateDynamic("SecondXAxisTitle")(SecondXAxisTitle)
    __obj.updateDynamic("SecondYAxisTitle")(SecondYAxisTitle)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Wall")(Wall)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("calculateDiagramPositionExcludingAxes")(calculateDiagramPositionExcludingAxes)
    __obj.updateDynamic("calculateDiagramPositionIncludingAxes")(calculateDiagramPositionIncludingAxes)
    __obj.updateDynamic("calculateDiagramPositionIncludingAxesAndAxisTitles")(calculateDiagramPositionIncludingAxesAndAxisTitles)
    __obj.updateDynamic("getAxis")(getAxis)
    __obj.updateDynamic("getDataPointProperties")(getDataPointProperties)
    __obj.updateDynamic("getDataRowProperties")(getDataRowProperties)
    __obj.updateDynamic("getDiagramType")(getDiagramType)
    __obj.updateDynamic("getFloor")(getFloor)
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSecondXAxisTitle")(getSecondXAxisTitle)
    __obj.updateDynamic("getSecondYAxisTitle")(getSecondYAxisTitle)
    __obj.updateDynamic("getSecondaryAxis")(getSecondaryAxis)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getWall")(getWall)
    __obj.updateDynamic("isAutomaticDiagramPositioning")(isAutomaticDiagramPositioning)
    __obj.updateDynamic("isExcludingDiagramPositioning")(isExcludingDiagramPositioning)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("set3DSettingsToDefault")(set3DSettingsToDefault)
    __obj.updateDynamic("setAutomaticDiagramPositioning")(setAutomaticDiagramPositioning)
    __obj.updateDynamic("setDefaultIllumination")(setDefaultIllumination)
    __obj.updateDynamic("setDefaultRotation")(setDefaultRotation)
    __obj.updateDynamic("setDiagramPositionExcludingAxes")(setDiagramPositionExcludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxes")(setDiagramPositionIncludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxesAndAxisTitles")(setDiagramPositionIncludingAxesAndAxisTitles)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[PieDiagram]
  }
}

