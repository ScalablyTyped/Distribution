package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTestability extends js.Object {
  def addToWindow(registry: TestabilityRegistry): scala.Unit
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: scala.Boolean): Testability | scala.Null
}

