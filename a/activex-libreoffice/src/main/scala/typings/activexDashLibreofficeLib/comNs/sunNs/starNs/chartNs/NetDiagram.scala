package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies net diagrams.
  *
  * Net diagrams are also known as radar diagrams.
  */
trait NetDiagram
  extends Diagram
     with StackableDiagram
     with ChartAxisYSupplier

object NetDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: scala.Boolean,
    AutomaticSize: scala.Boolean,
    DataCaption: scala.Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: java.lang.String,
    HasYAxis: scala.Boolean,
    HasYAxisDescription: scala.Boolean,
    HasYAxisGrid: scala.Boolean,
    HasYAxisHelpGrid: scala.Boolean,
    HasYAxisTitle: scala.Boolean,
    MissingValueTreatment: scala.Double,
    Percent: scala.Boolean,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SecondXAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    SecondYAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Stacked: scala.Boolean,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    YAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    YHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    YMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
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
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSecondXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getSecondaryAxis: js.Function1[scala.Double, XAxis],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getYAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getYHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getYMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
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
    setAutomaticDiagramPositioning: js.Function0[scala.Unit],
    setDiagramPositionExcludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxes: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setDiagramPositionIncludingAxesAndAxisTitles: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): NetDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, MissingValueTreatment = MissingValueTreatment, Percent = Percent, Position = Position, PropertySetInfo = PropertySetInfo, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, ShapeType = ShapeType, Size = Size, Stacked = Stacked, UserDefinedAttributes = UserDefinedAttributes, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, calculateDiagramPositionExcludingAxes = calculateDiagramPositionExcludingAxes, calculateDiagramPositionIncludingAxes = calculateDiagramPositionIncludingAxes, calculateDiagramPositionIncludingAxesAndAxisTitles = calculateDiagramPositionIncludingAxesAndAxisTitles, getAxis = getAxis, getDataPointProperties = getDataPointProperties, getDataRowProperties = getDataRowProperties, getDiagramType = getDiagramType, getPosition = getPosition, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getSecondXAxisTitle = getSecondXAxisTitle, getSecondYAxisTitle = getSecondYAxisTitle, getSecondaryAxis = getSecondaryAxis, getShapeType = getShapeType, getSize = getSize, getYAxis = getYAxis, getYAxisTitle = getYAxisTitle, getYHelpGrid = getYHelpGrid, getYMainGrid = getYMainGrid, isAutomaticDiagramPositioning = isAutomaticDiagramPositioning, isExcludingDiagramPositioning = isExcludingDiagramPositioning, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAutomaticDiagramPositioning = setAutomaticDiagramPositioning, setDiagramPositionExcludingAxes = setDiagramPositionExcludingAxes, setDiagramPositionIncludingAxes = setDiagramPositionIncludingAxes, setDiagramPositionIncludingAxesAndAxisTitles = setDiagramPositionIncludingAxesAndAxisTitles, setPosition = setPosition, setPropertyValue = setPropertyValue, setSize = setSize)
  
    __obj.asInstanceOf[NetDiagram]
  }
}

