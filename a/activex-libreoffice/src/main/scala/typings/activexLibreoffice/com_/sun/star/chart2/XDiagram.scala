package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDiagram extends XInterface {
  
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  var DefaultColorScheme: XColorScheme = js.native
  
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  val Floor: XPropertySet = js.native
  
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  var Legend: XLegend = js.native
  
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  val Wall: XPropertySet = js.native
  
  /** returns an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def getDefaultColorScheme(): XColorScheme = js.native
  
  /**
    * returns the property set that determines the visual appearance of the floor if any.
    *
    * The floor is the bottom of a 3D diagram. For a 2D diagram NULL is returned.
    */
  def getFloor(): XPropertySet = js.native
  
  /** returns the legend, which may represent data series and other information about a diagram in a separate box. */
  def getLegend(): XLegend = js.native
  
  /**
    * returns the property set that determines the visual appearance of the wall.
    *
    * The wall is the area behind the union of all coordinate systems used in a diagram.
    */
  def getWall(): XPropertySet = js.native
  
  /** sets an {@link XColorScheme} that defines the default colors for data series (or data points) in the diagram. */
  def setDefaultColorScheme(xColorScheme: XColorScheme): Unit = js.native
  
  /**
    * sets new data to the diagram.
    * @param xDataSource This data source will be interpreted in a chart-type specific way and the {@link DataSeries} found in `xDiagram` will be adapted to t
    * @param aArguments Arguments tells how to slice the given data.  For standard parameters that may be used, see the service {@link StandardDiagramCreation
    */
  def setDiagramData(xDataSource: XDataSource, aArguments: SeqEquiv[PropertyValue]): Unit = js.native
  
  /** sets a new legend. */
  def setLegend(xLegend: XLegend): Unit = js.native
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
    val __obj = js.Dynamic.literal(DefaultColorScheme = DefaultColorScheme.asInstanceOf[js.Any], Floor = Floor.asInstanceOf[js.Any], Legend = Legend.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultColorScheme = js.Any.fromFunction0(getDefaultColorScheme), getFloor = js.Any.fromFunction0(getFloor), getLegend = js.Any.fromFunction0(getLegend), getWall = js.Any.fromFunction0(getWall), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDefaultColorScheme = js.Any.fromFunction1(setDefaultColorScheme), setDiagramData = js.Any.fromFunction2(setDiagramData), setLegend = js.Any.fromFunction1(setLegend))
    __obj.asInstanceOf[XDiagram]
  }
  
  @scala.inline
  implicit class XDiagramMutableBuilder[Self <: XDiagram] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultColorScheme(value: XColorScheme): Self = StObject.set(x, "DefaultColorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloor(value: XPropertySet): Self = StObject.set(x, "Floor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultColorScheme(value: () => XColorScheme): Self = StObject.set(x, "getDefaultColorScheme", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFloor(value: () => XPropertySet): Self = StObject.set(x, "getFloor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLegend(value: () => XLegend): Self = StObject.set(x, "getLegend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWall(value: () => XPropertySet): Self = StObject.set(x, "getWall", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLegend(value: XLegend): Self = StObject.set(x, "Legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultColorScheme(value: XColorScheme => Unit): Self = StObject.set(x, "setDefaultColorScheme", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDiagramData(value: (XDataSource, SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "setDiagramData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLegend(value: XLegend => Unit): Self = StObject.set(x, "setLegend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWall(value: XPropertySet): Self = StObject.set(x, "Wall", value.asInstanceOf[js.Any])
  }
}
