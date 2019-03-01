package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies filled net diagrams.
  * @since OOo 3.2  Net diagrams are also known as radar diagrams.
  */
trait FilledNetDiagram
  extends Diagram
     with ChartAxisXSupplier
     with ChartAxisYSupplier
     with StackableDiagram

object FilledNetDiagram {
  @scala.inline
  def apply(
    AutomaticPosition: scala.Boolean,
    AutomaticSize: scala.Boolean,
    DataCaption: scala.Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: java.lang.String,
    HasXAxis: scala.Boolean,
    HasXAxisDescription: scala.Boolean,
    HasXAxisGrid: scala.Boolean,
    HasXAxisHelpGrid: scala.Boolean,
    HasXAxisTitle: scala.Boolean,
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
    XAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XAxisTitle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    XHelpGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XMainGrid: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
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
    getXAxis: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXAxisTitle: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape],
    getXHelpGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getXMainGrid: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
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
  ): FilledNetDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticPosition")(AutomaticPosition)
    __obj.updateDynamic("AutomaticSize")(AutomaticSize)
    __obj.updateDynamic("DataCaption")(DataCaption)
    __obj.updateDynamic("DataRowSource")(DataRowSource)
    __obj.updateDynamic("DiagramType")(DiagramType)
    __obj.updateDynamic("HasXAxis")(HasXAxis)
    __obj.updateDynamic("HasXAxisDescription")(HasXAxisDescription)
    __obj.updateDynamic("HasXAxisGrid")(HasXAxisGrid)
    __obj.updateDynamic("HasXAxisHelpGrid")(HasXAxisHelpGrid)
    __obj.updateDynamic("HasXAxisTitle")(HasXAxisTitle)
    __obj.updateDynamic("HasYAxis")(HasYAxis)
    __obj.updateDynamic("HasYAxisDescription")(HasYAxisDescription)
    __obj.updateDynamic("HasYAxisGrid")(HasYAxisGrid)
    __obj.updateDynamic("HasYAxisHelpGrid")(HasYAxisHelpGrid)
    __obj.updateDynamic("HasYAxisTitle")(HasYAxisTitle)
    __obj.updateDynamic("MissingValueTreatment")(MissingValueTreatment)
    __obj.updateDynamic("Percent")(Percent)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SecondXAxisTitle")(SecondXAxisTitle)
    __obj.updateDynamic("SecondYAxisTitle")(SecondYAxisTitle)
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("Stacked")(Stacked)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("XAxis")(XAxis)
    __obj.updateDynamic("XAxisTitle")(XAxisTitle)
    __obj.updateDynamic("XHelpGrid")(XHelpGrid)
    __obj.updateDynamic("XMainGrid")(XMainGrid)
    __obj.updateDynamic("YAxis")(YAxis)
    __obj.updateDynamic("YAxisTitle")(YAxisTitle)
    __obj.updateDynamic("YHelpGrid")(YHelpGrid)
    __obj.updateDynamic("YMainGrid")(YMainGrid)
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
    __obj.updateDynamic("getPosition")(getPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSecondXAxisTitle")(getSecondXAxisTitle)
    __obj.updateDynamic("getSecondYAxisTitle")(getSecondYAxisTitle)
    __obj.updateDynamic("getSecondaryAxis")(getSecondaryAxis)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getXAxis")(getXAxis)
    __obj.updateDynamic("getXAxisTitle")(getXAxisTitle)
    __obj.updateDynamic("getXHelpGrid")(getXHelpGrid)
    __obj.updateDynamic("getXMainGrid")(getXMainGrid)
    __obj.updateDynamic("getYAxis")(getYAxis)
    __obj.updateDynamic("getYAxisTitle")(getYAxisTitle)
    __obj.updateDynamic("getYHelpGrid")(getYHelpGrid)
    __obj.updateDynamic("getYMainGrid")(getYMainGrid)
    __obj.updateDynamic("isAutomaticDiagramPositioning")(isAutomaticDiagramPositioning)
    __obj.updateDynamic("isExcludingDiagramPositioning")(isExcludingDiagramPositioning)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setAutomaticDiagramPositioning")(setAutomaticDiagramPositioning)
    __obj.updateDynamic("setDiagramPositionExcludingAxes")(setDiagramPositionExcludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxes")(setDiagramPositionIncludingAxes)
    __obj.updateDynamic("setDiagramPositionIncludingAxesAndAxisTitles")(setDiagramPositionIncludingAxesAndAxisTitles)
    __obj.updateDynamic("setPosition")(setPosition)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSize")(setSize)
    __obj.asInstanceOf[FilledNetDiagram]
  }
}

