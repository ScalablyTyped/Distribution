package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDiagram
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  var DefaultColorScheme: XColorScheme
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  val Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  var Legend: XLegend
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  val Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def getDefaultColorScheme(): XColorScheme
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  def getFloor(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  def getLegend(): XLegend
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  def getWall(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** sets an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def setDefaultColorScheme(xColorScheme: XColorScheme): scala.Unit
  /**
    * sets new data to the diagram.
    * @param xDataSource This data source will be interpreted in a chart-type specific way and the {@link DataSeries} found in `xDiagram` will be adapted to t
    * @param aArguments Arguments tells how to slice the given data.  For standard parameters that may be used, see the service {@link StandardDiagramCreation
    */
  def setDiagramData(
    xDataSource: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource,
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /** sets a new legend. */
  def setLegend(xLegend: XLegend): scala.Unit
}

object XDiagram {
  @scala.inline
  def apply(
    DefaultColorScheme: XColorScheme,
    Floor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    Legend: XLegend,
    Wall: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getDefaultColorScheme: js.Function0[XColorScheme],
    getFloor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getLegend: js.Function0[XLegend],
    getWall: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDefaultColorScheme: js.Function1[XColorScheme, scala.Unit],
    setDiagramData: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    setLegend: js.Function1[XLegend, scala.Unit]
  ): XDiagram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultColorScheme")(DefaultColorScheme)
    __obj.updateDynamic("Floor")(Floor)
    __obj.updateDynamic("Legend")(Legend)
    __obj.updateDynamic("Wall")(Wall)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDefaultColorScheme")(getDefaultColorScheme)
    __obj.updateDynamic("getFloor")(getFloor)
    __obj.updateDynamic("getLegend")(getLegend)
    __obj.updateDynamic("getWall")(getWall)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDefaultColorScheme")(setDefaultColorScheme)
    __obj.updateDynamic("setDiagramData")(setDiagramData)
    __obj.updateDynamic("setLegend")(setLegend)
    __obj.asInstanceOf[XDiagram]
  }
}

