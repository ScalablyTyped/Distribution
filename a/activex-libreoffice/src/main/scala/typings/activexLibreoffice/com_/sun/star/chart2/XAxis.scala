package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAxis extends XInterface {
  
  /** the returned property set must support the service {@link GridProperties} */
  val GridProperties: XPropertySet = js.native
  
  var ScaleData: typings.activexLibreoffice.com_.sun.star.chart2.ScaleData = js.native
  
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  val SubGridProperties: SafeArray[XPropertySet] = js.native
  
  /** the returned property sets must support the service TickProperties */
  val SubTickProperties: SafeArray[XPropertySet] = js.native
  
  /** the returned property set must support the service {@link GridProperties} */
  def getGridProperties(): XPropertySet = js.native
  
  def getScaleData(): ScaleData = js.native
  
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  def getSubGridProperties(): SafeArray[XPropertySet] = js.native
  
  /** the returned property sets must support the service TickProperties */
  def getSubTickProperties(): SafeArray[XPropertySet] = js.native
  
  def setScaleData(aScale: ScaleData): Unit = js.native
}
object XAxis {
  
  @scala.inline
  def apply(
    GridProperties: XPropertySet,
    ScaleData: ScaleData,
    SubGridProperties: SafeArray[XPropertySet],
    SubTickProperties: SafeArray[XPropertySet],
    acquire: () => Unit,
    getGridProperties: () => XPropertySet,
    getScaleData: () => ScaleData,
    getSubGridProperties: () => SafeArray[XPropertySet],
    getSubTickProperties: () => SafeArray[XPropertySet],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScaleData: ScaleData => Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(GridProperties = GridProperties.asInstanceOf[js.Any], ScaleData = ScaleData.asInstanceOf[js.Any], SubGridProperties = SubGridProperties.asInstanceOf[js.Any], SubTickProperties = SubTickProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGridProperties = js.Any.fromFunction0(getGridProperties), getScaleData = js.Any.fromFunction0(getScaleData), getSubGridProperties = js.Any.fromFunction0(getSubGridProperties), getSubTickProperties = js.Any.fromFunction0(getSubTickProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScaleData = js.Any.fromFunction1(setScaleData))
    __obj.asInstanceOf[XAxis]
  }
  
  @scala.inline
  implicit class XAxisMutableBuilder[Self <: XAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGridProperties(value: () => XPropertySet): Self = StObject.set(x, "getGridProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScaleData(value: () => ScaleData): Self = StObject.set(x, "getScaleData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubGridProperties(value: () => SafeArray[XPropertySet]): Self = StObject.set(x, "getSubGridProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubTickProperties(value: () => SafeArray[XPropertySet]): Self = StObject.set(x, "getSubTickProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGridProperties(value: XPropertySet): Self = StObject.set(x, "GridProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleData(value: ScaleData): Self = StObject.set(x, "ScaleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetScaleData(value: ScaleData => Unit): Self = StObject.set(x, "setScaleData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubGridProperties(value: SafeArray[XPropertySet]): Self = StObject.set(x, "SubGridProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTickProperties(value: SafeArray[XPropertySet]): Self = StObject.set(x, "SubTickProperties", value.asInstanceOf[js.Any])
  }
}
