package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to both the primary and the secondary y-axis of a diagram.
  * @see XChartDocument
  */
trait XTwoAxisYSupplier
  extends StObject
     with XAxisYSupplier {
  
  /**
    * @returns the properties of the secondary **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryYAxis: XPropertySet
  
  /**
    * @returns the properties of the secondary **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryYAxis(): XPropertySet
}
object XTwoAxisYSupplier {
  
  @scala.inline
  def apply(
    SecondaryYAxis: XPropertySet,
    YAxis: XPropertySet,
    YAxisTitle: XShape,
    YHelpGrid: XPropertySet,
    YMainGrid: XPropertySet,
    acquire: () => Unit,
    getSecondaryYAxis: () => XPropertySet,
    getYAxis: () => XPropertySet,
    getYAxisTitle: () => XShape,
    getYHelpGrid: () => XPropertySet,
    getYMainGrid: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTwoAxisYSupplier = {
    val __obj = js.Dynamic.literal(SecondaryYAxis = SecondaryYAxis.asInstanceOf[js.Any], YAxis = YAxis.asInstanceOf[js.Any], YAxisTitle = YAxisTitle.asInstanceOf[js.Any], YHelpGrid = YHelpGrid.asInstanceOf[js.Any], YMainGrid = YMainGrid.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondaryYAxis = js.Any.fromFunction0(getSecondaryYAxis), getYAxis = js.Any.fromFunction0(getYAxis), getYAxisTitle = js.Any.fromFunction0(getYAxisTitle), getYHelpGrid = js.Any.fromFunction0(getYHelpGrid), getYMainGrid = js.Any.fromFunction0(getYMainGrid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTwoAxisYSupplier]
  }
  
  @scala.inline
  implicit class XTwoAxisYSupplierMutableBuilder[Self <: XTwoAxisYSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSecondaryYAxis(value: () => XPropertySet): Self = StObject.set(x, "getSecondaryYAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSecondaryYAxis(value: XPropertySet): Self = StObject.set(x, "SecondaryYAxis", value.asInstanceOf[js.Any])
  }
}
