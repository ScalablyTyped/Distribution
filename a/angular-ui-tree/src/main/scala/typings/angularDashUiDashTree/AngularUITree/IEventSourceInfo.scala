package typings.angularDashUiDashTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventSourceInfo extends js.Object {
  var cloneModel: js.Any
  var index: Double
  var nodeScope: ITreeNodeScope
  var nodesScope: ITreeNodeScope
}

object IEventSourceInfo {
  @scala.inline
  def apply(cloneModel: js.Any, index: Double, nodeScope: ITreeNodeScope, nodesScope: ITreeNodeScope): IEventSourceInfo = {
    val __obj = js.Dynamic.literal(cloneModel = cloneModel, index = index, nodeScope = nodeScope, nodesScope = nodesScope)
  
    __obj.asInstanceOf[IEventSourceInfo]
  }
}

