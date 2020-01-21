package typings.angularUiTree

import typings.angularUiTree.AngularUITree.IParentTreeNodeScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: Double
  var nodesScope: IParentTreeNodeScope
}

object AnonIndex {
  @scala.inline
  def apply(index: Double, nodesScope: IParentTreeNodeScope): AnonIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndex]
  }
}

