package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

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
    addToWindow: js.Function1[TestabilityRegistry, scala.Unit],
    findTestabilityInTree: js.Function3[TestabilityRegistry, js.Any, scala.Boolean, Testability | scala.Null]
  ): GetTestability = {
    val __obj = js.Dynamic.literal(addToWindow = addToWindow, findTestabilityInTree = findTestabilityInTree)
  
    __obj.asInstanceOf[GetTestability]
  }
}

