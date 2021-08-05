package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleGetAccFlowTo
  extends StObject
     with XInterface {
  
  def getAccFlowTo(aXShape: js.Any, nType: Double): SafeArray[js.Any]
}
object XAccessibleGetAccFlowTo {
  
  inline def apply(
    acquire: () => Unit,
    getAccFlowTo: (js.Any, Double) => SafeArray[js.Any],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAccFlowTo = js.Any.fromFunction2(getAccFlowTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
  
  extension [Self <: XAccessibleGetAccFlowTo](x: Self) {
    
    inline def setGetAccFlowTo(value: (js.Any, Double) => SafeArray[js.Any]): Self = StObject.set(x, "getAccFlowTo", js.Any.fromFunction2(value))
  }
}
