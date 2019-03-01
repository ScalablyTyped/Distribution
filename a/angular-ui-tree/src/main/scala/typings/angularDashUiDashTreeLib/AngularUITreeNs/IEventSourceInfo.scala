package typings
package angularDashUiDashTreeLib.AngularUITreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventSourceInfo extends js.Object {
  var cloneModel: js.Any
  var index: scala.Double
  var nodeScope: ITreeNodeScope
  var nodesScope: ITreeNodeScope
}

object IEventSourceInfo {
  @scala.inline
  def apply(cloneModel: js.Any, index: scala.Double, nodeScope: ITreeNodeScope, nodesScope: ITreeNodeScope): IEventSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloneModel")(cloneModel)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("nodeScope")(nodeScope)
    __obj.updateDynamic("nodesScope")(nodesScope)
    __obj.asInstanceOf[IEventSourceInfo]
  }
}

