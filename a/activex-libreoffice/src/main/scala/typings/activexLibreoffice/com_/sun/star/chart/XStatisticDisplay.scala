package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to statistical elements for the chart.
  *
  * Statistical elements are used by a {@link StockDiagram} .
  * @see XChartDocument
  * @see StockDiagram
  */
@js.native
trait XStatisticDisplay extends XInterface {
  
  /**
    * @returns the properties of the down bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **DownBar** is the box that is drawn
    * @see ChartArea
    */
  val DownBar: XPropertySet = js.native
  
  /**
    * @returns the properties of the lines that are drawn between the lowest and highest stock value during a day.
    * @see ChartLine
    */
  val MinMaxLine: XPropertySet = js.native
  
  /**
    * @returns the properties of the up bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **UpBar** is the box that is drawn betw
    * @see ChartArea
    */
  val UpBar: XPropertySet = js.native
  
  /**
    * @returns the properties of the down bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **DownBar** is the box that is drawn
    * @see ChartArea
    */
  def getDownBar(): XPropertySet = js.native
  
  /**
    * @returns the properties of the lines that are drawn between the lowest and highest stock value during a day.
    * @see ChartLine
    */
  def getMinMaxLine(): XPropertySet = js.native
  
  /**
    * @returns the properties of the up bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **UpBar** is the box that is drawn betw
    * @see ChartArea
    */
  def getUpBar(): XPropertySet = js.native
}
object XStatisticDisplay {
  
  @scala.inline
  def apply(
    DownBar: XPropertySet,
    MinMaxLine: XPropertySet,
    UpBar: XPropertySet,
    acquire: () => Unit,
    getDownBar: () => XPropertySet,
    getMinMaxLine: () => XPropertySet,
    getUpBar: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatisticDisplay = {
    val __obj = js.Dynamic.literal(DownBar = DownBar.asInstanceOf[js.Any], MinMaxLine = MinMaxLine.asInstanceOf[js.Any], UpBar = UpBar.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDownBar = js.Any.fromFunction0(getDownBar), getMinMaxLine = js.Any.fromFunction0(getMinMaxLine), getUpBar = js.Any.fromFunction0(getUpBar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStatisticDisplay]
  }
  
  @scala.inline
  implicit class XStatisticDisplayMutableBuilder[Self <: XStatisticDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownBar(value: XPropertySet): Self = StObject.set(x, "DownBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDownBar(value: () => XPropertySet): Self = StObject.set(x, "getDownBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinMaxLine(value: () => XPropertySet): Self = StObject.set(x, "getMinMaxLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpBar(value: () => XPropertySet): Self = StObject.set(x, "getUpBar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinMaxLine(value: XPropertySet): Self = StObject.set(x, "MinMaxLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpBar(value: XPropertySet): Self = StObject.set(x, "UpBar", value.asInstanceOf[js.Any])
  }
}
