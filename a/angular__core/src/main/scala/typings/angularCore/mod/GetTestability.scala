package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestability extends StObject {
  
  def addToWindow(registry: TestabilityRegistry): Unit
  
  def findTestabilityInTree(registry: TestabilityRegistry, elem: Any, findInAncestors: Boolean): Testability | Null
}
object GetTestability {
  
  inline def apply(
    addToWindow: TestabilityRegistry => Unit,
    findTestabilityInTree: (TestabilityRegistry, Any, Boolean) => Testability | Null
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = js.Any.fromFunction1(addToWindow), findTestabilityInTree = js.Any.fromFunction3(findTestabilityInTree))
    __obj.asInstanceOf[GetTestability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTestability] (val x: Self) extends AnyVal {
    
    inline def setAddToWindow(value: TestabilityRegistry => Unit): Self = StObject.set(x, "addToWindow", js.Any.fromFunction1(value))
    
    inline def setFindTestabilityInTree(value: (TestabilityRegistry, Any, Boolean) => Testability | Null): Self = StObject.set(x, "findTestabilityInTree", js.Any.fromFunction3(value))
  }
}
