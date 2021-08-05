package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestability extends StObject {
  
  def addToWindow(registry: TestabilityRegistry): Unit
  
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null
}
object GetTestability {
  
  inline def apply(
    addToWindow: TestabilityRegistry => Unit,
    findTestabilityInTree: (TestabilityRegistry, js.Any, Boolean) => Testability | Null
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = js.Any.fromFunction1(addToWindow), findTestabilityInTree = js.Any.fromFunction3(findTestabilityInTree))
    __obj.asInstanceOf[GetTestability]
  }
  
  extension [Self <: GetTestability](x: Self) {
    
    inline def setAddToWindow(value: TestabilityRegistry => Unit): Self = StObject.set(x, "addToWindow", js.Any.fromFunction1(value))
    
    inline def setFindTestabilityInTree(value: (TestabilityRegistry, js.Any, Boolean) => Testability | Null): Self = StObject.set(x, "findTestabilityInTree", js.Any.fromFunction3(value))
  }
}
