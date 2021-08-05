package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper service for chart documents which supply a z-axis. */
trait ChartAxisZSupplier
  extends StObject
     with XAxisZSupplier {
  
  /**
    * Determines if the z-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasZAxis: Boolean
  
  /** Determines if the description of the z-axis is shown or hidden. */
  var HasZAxisDescription: Boolean
  
  /**
    * Determines if the major grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisGrid: Boolean
  
  /**
    * Determines if the minor grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisHelpGrid: Boolean
  
  /**
    * Determines if the title of the z-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasZAxisTitle: Boolean
}
object ChartAxisZSupplier {
  
  inline def apply(
    HasZAxis: Boolean,
    HasZAxisDescription: Boolean,
    HasZAxisGrid: Boolean,
    HasZAxisHelpGrid: Boolean,
    HasZAxisTitle: Boolean,
    ZAxis: XPropertySet,
    ZAxisTitle: XShape,
    ZHelpGrid: XPropertySet,
    ZMainGrid: XPropertySet,
    acquire: () => Unit,
    getZAxis: () => XPropertySet,
    getZAxisTitle: () => XShape,
    getZHelpGrid: () => XPropertySet,
    getZMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): ChartAxisZSupplier = {
    val __obj = js.Dynamic.literal(HasZAxis = HasZAxis.asInstanceOf[js.Any], HasZAxisDescription = HasZAxisDescription.asInstanceOf[js.Any], HasZAxisGrid = HasZAxisGrid.asInstanceOf[js.Any], HasZAxisHelpGrid = HasZAxisHelpGrid.asInstanceOf[js.Any], HasZAxisTitle = HasZAxisTitle.asInstanceOf[js.Any], ZAxis = ZAxis.asInstanceOf[js.Any], ZAxisTitle = ZAxisTitle.asInstanceOf[js.Any], ZHelpGrid = ZHelpGrid.asInstanceOf[js.Any], ZMainGrid = ZMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getZAxis = js.Any.fromFunction0(getZAxis), getZAxisTitle = js.Any.fromFunction0(getZAxisTitle), getZHelpGrid = js.Any.fromFunction0(getZHelpGrid), getZMainGrid = js.Any.fromFunction0(getZMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[ChartAxisZSupplier]
  }
  
  extension [Self <: ChartAxisZSupplier](x: Self) {
    
    inline def setHasZAxis(value: Boolean): Self = StObject.set(x, "HasZAxis", value.asInstanceOf[js.Any])
    
    inline def setHasZAxisDescription(value: Boolean): Self = StObject.set(x, "HasZAxisDescription", value.asInstanceOf[js.Any])
    
    inline def setHasZAxisGrid(value: Boolean): Self = StObject.set(x, "HasZAxisGrid", value.asInstanceOf[js.Any])
    
    inline def setHasZAxisHelpGrid(value: Boolean): Self = StObject.set(x, "HasZAxisHelpGrid", value.asInstanceOf[js.Any])
    
    inline def setHasZAxisTitle(value: Boolean): Self = StObject.set(x, "HasZAxisTitle", value.asInstanceOf[js.Any])
  }
}
