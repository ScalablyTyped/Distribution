package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTestability extends js.Object {
  def addToWindow(registry: TestabilityRegistry): Unit = js.native
  def findTestabilityInTree(registry: TestabilityRegistry, elem: js.Any, findInAncestors: Boolean): Testability | Null = js.native
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
  @scala.inline
  implicit class GetTestabilityOps[Self <: GetTestability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddToWindow(value: TestabilityRegistry => Unit): Self = this.set("addToWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setFindTestabilityInTree(value: (TestabilityRegistry, js.Any, Boolean) => Testability | Null): Self = this.set("findTestabilityInTree", js.Any.fromFunction3(value))
  }
  
}

