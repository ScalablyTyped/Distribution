package typings.angularUiTree.anon

import typings.angularUiTree.AngularUITree.IParentTreeNodeScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var nodesScope: IParentTreeNodeScope
}

object Index {
  @scala.inline
  def apply(index: Double, nodesScope: IParentTreeNodeScope): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], nodesScope = nodesScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

