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
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    calculateDiagramPositionExcludingAxes: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    calculateDiagramPositionIncludingAxes: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getAxis: scala.Double => XAxis,
    getDataPointProperties: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getDataRowProperties: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getDiagramType: () => java.lang.String,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getSecondXAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getSecondYAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getSecondaryAxis: scala.Double => XAxis,
    getShapeType: () => java.lang.String,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getYAxis: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYAxisTitle: () => activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    getYHelpGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getYMainGrid: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    isAutomaticDiagramPositioning: () => scala.Boolean,
    isExcludingDiagramPositioning: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setAutomaticDiagramPositioning: () => scala.Unit,
    setDiagramPositionExcludingAxes: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setDiagramPositionIncludingAxes: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle => scala.Unit,
    setPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size => scala.Unit
  ): NetDiagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition, AutomaticSize = AutomaticSize, DataCaption = DataCaption, DataRowSource = DataRowSource, DiagramType = DiagramType, HasYAxis = HasYAxis, HasYAxisDescription = HasYAxisDescription, HasYAxisGrid = HasYAxisGrid, HasYAxisHelpGrid = HasYAxisHelpGrid, HasYAxisTitle = HasYAxisTitle, MissingValueTreatment = MissingValueTreatment, Percent = Percent, Position = Position, PropertySetInfo = PropertySetInfo, SecondXAxisTitle = SecondXAxisTitle, SecondYAxisTitle = SecondYAxisTitle, ShapeType = ShapeType, Size = Size, Stacked = Stacked, UserDefinedAttributes = UserDefinedAttributes, YAxis = YAxis, YAxisTitle = YAxisTitle, YHelpGrid = YHelpGrid, YMainGrid = YMainGrid, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[NetDiagram]
  }
}

