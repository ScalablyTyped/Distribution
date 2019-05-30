package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTestability extends js.Object {
  def addToWindow(registry: TestabilityRegistry): scala.Unit
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: scala.Boolean): Testability | scala.Null
}

object GetTestability {
  @scala.inline
  def apply(
    addToWindow: TestabilityRegistry => scala.Unit,
    findTestabilityInTree: (TestabilityRegistry, js.Any, scala.Boolean) => Testability | scala.Null
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = js.Any.fromFunction1(addToWindow), findTestabilityInTree = js.Any.fromFunction3(findTestabilityInTree))
  
    __obj.asInstanceOf[GetTestability]
  }
}

