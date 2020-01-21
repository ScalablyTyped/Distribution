package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTestability extends js.Object {
  def addToWindow(registry: TestabilityRegistry): Unit
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null
}

object GetTestability {
  @scala.inline
  def apply(
    addToWindow: TestabilityRegistry => Unit,
    findTestabilityInTree: (TestabilityRegistry, js.Any, Boolean) => Testability | Null
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = js.Any.fromFunction1(addToWindow), findTestabilityInTree = js.Any.fromFunction3(findTestabilityInTree))
  
    __obj.asInstanceOf[GetTestability]
  }
}

