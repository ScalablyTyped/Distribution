package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows easier access to the different subelements of an axis.
  * @since OOo 3.4
  */
trait XAxis
  extends StObject
     with XInterface {
  
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  val AxisTitle: XPropertySet
  
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MajorGrid: XPropertySet
  
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  val MinorGrid: XPropertySet
  
  /** @returns the title of the axis. The returned object supports the properties described in service {@link ChartTitle} . */
  def getAxisTitle(): XPropertySet
  
  /** @returns the properties of the major grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMajorGrid(): XPropertySet
  
  /** @returns the properties of the minor grid of the axis. The returned object supports service {@link ChartGrid} . */
  def getMinorGrid(): XPropertySet
}
object XAxis {
  
  inline def apply(
    AxisTitle: XPropertySet,
    MajorGrid: XPropertySet,
    MinorGrid: XPropertySet,
    acquire: () => Unit,
    getAxisTitle: () => XPropertySet,
    getMajorGrid: () => XPropertySet,
    getMinorGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(AxisTitle = AxisTitle.asInstanceOf[js.Any], MajorGrid = MajorGrid.asInstanceOf[js.Any], MinorGrid = MinorGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAxisTitle = js.Any.fromFunction0(getAxisTitle), getMajorGrid = js.Any.fromFunction0(getMajorGrid), getMinorGrid = js.Any.fromFunction0(getMinorGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAxis]
  }
  
  extension [Self <: XAxis](x: Self) {
    
    inline def setAxisTitle(value: XPropertySet): Self = StObject.set(x, "AxisTitle", value.asInstanceOf[js.Any])
    
    inline def setGetAxisTitle(value: () => XPropertySet): Self = StObject.set(x, "getAxisTitle", js.Any.fromFunction0(value))
    
    inline def setGetMajorGrid(value: () => XPropertySet): Self = StObject.set(x, "getMajorGrid", js.Any.fromFunction0(value))
    
    inline def setGetMinorGrid(value: () => XPropertySet): Self = StObject.set(x, "getMinorGrid", js.Any.fromFunction0(value))
    
    inline def setMajorGrid(value: XPropertySet): Self = StObject.set(x, "MajorGrid", value.asInstanceOf[js.Any])
    
    inline def setMinorGrid(value: XPropertySet): Self = StObject.set(x, "MinorGrid", value.asInstanceOf[js.Any])
  }
}
