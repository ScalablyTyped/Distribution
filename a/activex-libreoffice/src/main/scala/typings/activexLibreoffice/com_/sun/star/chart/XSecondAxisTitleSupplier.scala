package typings.activexLibreoffice.com_.sun.star.chart

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSecondAxisTitleSupplier
  extends StObject
     with XInterface {
  
  val SecondXAxisTitle: XShape
  
  val SecondYAxisTitle: XShape
  
  def getSecondXAxisTitle(): XShape
  
  def getSecondYAxisTitle(): XShape
}
object XSecondAxisTitleSupplier {
  
  inline def apply(
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    acquire: () => Unit,
    getSecondXAxisTitle: () => XShape,
    getSecondYAxisTitle: () => XShape,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSecondXAxisTitle = js.Any.fromFunction0(getSecondXAxisTitle), getSecondYAxisTitle = js.Any.fromFunction0(getSecondYAxisTitle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
  
  extension [Self <: XSecondAxisTitleSupplier](x: Self) {
    
    inline def setGetSecondXAxisTitle(value: () => XShape): Self = StObject.set(x, "getSecondXAxisTitle", js.Any.fromFunction0(value))
    
    inline def setGetSecondYAxisTitle(value: () => XShape): Self = StObject.set(x, "getSecondYAxisTitle", js.Any.fromFunction0(value))
    
    inline def setSecondXAxisTitle(value: XShape): Self = StObject.set(x, "SecondXAxisTitle", value.asInstanceOf[js.Any])
    
    inline def setSecondYAxisTitle(value: XShape): Self = StObject.set(x, "SecondYAxisTitle", value.asInstanceOf[js.Any])
  }
}
