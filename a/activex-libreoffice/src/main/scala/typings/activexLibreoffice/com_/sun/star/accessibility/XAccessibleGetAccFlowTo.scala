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
  
  def getAccFlowTo(aXShape: Any, nType: Double): SafeArray[Any]
}
object XAccessibleGetAccFlowTo {
  
  inline def apply(
    acquire: () => Unit,
    getAccFlowTo: (Any, Double) => SafeArray[Any],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getAccFlowTo = js.Any.fromFunction2(getAccFlowTo), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
  
  extension [Self <: XAccessibleGetAccFlowTo](x: Self) {
    
    inline def setGetAccFlowTo(value: (Any, Double) => SafeArray[Any]): Self = StObject.set(x, "getAccFlowTo", js.Any.fromFunction2(value))
  }
}
