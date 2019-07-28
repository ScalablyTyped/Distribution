package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDiagram extends XInterface {
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  var DefaultColorScheme: XColorScheme
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  val Floor: XPropertySet
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  var Legend: XLegend
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  val Wall: XPropertySet
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def getDefaultColorScheme(): XColorScheme
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  def getFloor(): XPropertySet
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  def getLegend(): XLegend
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  def getWall(): XPropertySet
  /** sets an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def setDefaultColorScheme(xColorScheme: XColorScheme): Unit
  /**
    * sets new data to the diagram.
    * @param xDataSource This data source will be interpreted in a chart-type specific way and the {@link DataSeries} found in `xDiagram` will be adapted to t
    * @param aArguments Arguments tells how to slice the given data.  For standard parameters that may be used, see the service {@link StandardDiagramCreation
    */
  def setDiagramData(xDataSource: XDataSource, aArguments: SeqEquiv[PropertyValue]): Unit
  /** sets a new legend. */
  def setLegend(xLegend: XLegend): Unit
}

object XDiagram {
  @scala.inline
  def apply(
    DefaultColorScheme: XColorScheme,
    Floor: XPropertySet,
    Legend: XLegend,
    Wall: XPropertySet,
    acquire: () => Unit,
    getDefaultColorScheme: () => XColorScheme,
    getFloor: () => XPropertySet,
    getLegend: () => XLegend,
    getWall: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDefaultColorScheme: XColorScheme => Unit,
    setDiagramData: (XDataSource, SeqEquiv[PropertyValue]) => Unit,
    setLegend: XLegend => Unit
  ): XDiagram = {
    val __obj = js.Dynamic.literal(DefaultColorScheme = DefaultColorScheme, Floor = Floor, Legend = Legend, Wall = Wall, acquire = js.Any.fromFunction0(acquire), getDefaultColorScheme = js.Any.fromFunction0(getDefaultColorScheme), getFloor = js.Any.fromFunction0(getFloor), getLegend = js.Any.fromFunction0(getLegend), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultColorScheme = js.Any.fromFunction1(setDefaultColorScheme), setDiagramData = js.Any.fromFunction2(setDiagramData), setLegend = js.Any.fromFunction1(setLegend))
  
    __obj.asInstanceOf[XDiagram]
  }
}

