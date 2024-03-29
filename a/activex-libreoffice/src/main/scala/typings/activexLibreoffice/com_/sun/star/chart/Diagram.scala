package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the base service for the diagram of the chart document.
  *
  * The diagram is the object that contains the actual plot.
  *
  * Different {@link Diagram} Types, e.g., {@link PieDiagram} or {@link LineDiagram} , can be instantiated by the {@link
  * com.sun.star.lang.XMultiServiceFactory} of the {@link XChartDocument} .
  */
trait Diagram
  extends StObject
     with XDiagram
     with XAxisSupplier
     with XSecondAxisTitleSupplier
     with XDiagramPositioning
     with XPropertySet
     with UserDefinedAttributesSupplier {
  
  /**
    * If this property is `TRUE` the position is calculated by the application automatically. Setting this property to false will have no effect. Instead
    * use the interface {@link com.sun.star.drawing.XShape} to set a concrete position (note {@link com.sun.star.chart.XDiagram} is derived from {@link
    * com.sun.star.drawing.XShape} ).
    */
  var AutomaticPosition: Boolean
  
  /**
    * If this property is `TRUE` the size is calculated by the application automatically. Setting this property to false will have no effect. Instead use
    * the interface {@link com.sun.star.drawing.XShape} to set a concrete size (note {@link com.sun.star.chart.XDiagram} is derived from {@link
    * com.sun.star.drawing.XShape} ).
    */
  var AutomaticSize: Boolean
  
  /**
    * specifies how the caption of data points is displayed.
    * @see ChartDataCaption
    */
  var DataCaption: Double
  
  /**
    * determines if the data for a data row is contained in the columns or in the rows of the data array.
    * @see ChartDataRowSource
    * @see ChartDataArray
    */
  var DataRowSource: ChartDataRowSource
  
  /**
    * specifies how empty or invalid cells in the provided data should be handled when displayed
    * @see MissingValueTreatment
    */
  var MissingValueTreatment: Double
}
object Diagram {
  
  inline def apply(
    AutomaticPosition: Boolean,
    AutomaticSize: Boolean,
    DataCaption: Double,
    DataRowSource: ChartDataRowSource,
    DiagramType: String,
    MissingValueTreatment: Double,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    ShapeType: String,
    Size: Size,
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    calculateDiagramPositionExcludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => Rectangle,
    getAxis: Double => XAxis,
    getDataPointProperties: (Double, Double) => XPropertySet,
    getDataRowProperties: Double => XPropertySet,
    getDiagramType: () => String,
    getPosition: () => Point,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    getSecondaryAxis: Double => XAxis,
    getShapeType: () => String,
    getSize: () => Size,
    isAutomaticDiagramPositioning: () => Boolean,
    isExcludingDiagramPositioning: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAutomaticDiagramPositioning: () => Unit,
    setDiagramPositionExcludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Unit,
    setPosition: Point => Unit,
    setPropertyValue: (String, Any) => Unit,
    setSize: Size => Unit
  ): Diagram = {
    val __obj = js.Dynamic.literal(AutomaticPosition = AutomaticPosition.asInstanceOf[js.Any], AutomaticSize = AutomaticSize.asInstanceOf[js.Any], DataCaption = DataCaption.asInstanceOf[js.Any], DataRowSource = DataRowSource.asInstanceOf[js.Any], DiagramType = DiagramType.asInstanceOf[js.Any], MissingValueTreatment = MissingValueTreatment.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), getAxis = js.Any.fromFunction1(getAxis), getDataPointProperties = js.Any.fromFunction2(getDataPointProperties), getDataRowProperties = js.Any.fromFunction1(getDataRowProperties), getDiagramType = js.Any.fromFunction0(getDiagramType), getPosition = js.Any.fromFunction0(getPosition), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles), setPosition = js.Any.fromFunction1(setPosition), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSize = js.Any.fromFunction1(setSize))
    __obj.asInstanceOf[Diagram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diagram] (val x: Self) extends AnyVal {
    
    inline def setAutomaticPosition(value: Boolean): Self = StObject.set(x, "AutomaticPosition", value.asInstanceOf[js.Any])
    
    inline def setAutomaticSize(value: Boolean): Self = StObject.set(x, "AutomaticSize", value.asInstanceOf[js.Any])
    
    inline def setDataCaption(value: Double): Self = StObject.set(x, "DataCaption", value.asInstanceOf[js.Any])
    
    inline def setDataRowSource(value: ChartDataRowSource): Self = StObject.set(x, "DataRowSource", value.asInstanceOf[js.Any])
    
    inline def setMissingValueTreatment(value: Double): Self = StObject.set(x, "MissingValueTreatment", value.asInstanceOf[js.Any])
  }
}
