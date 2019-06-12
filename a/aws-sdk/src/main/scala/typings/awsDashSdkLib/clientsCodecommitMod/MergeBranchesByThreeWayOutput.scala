package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeBranchesByThreeWayOutput extends js.Object {
  /**
    * The commit ID of the merge in the destination or target branch.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The tree ID of the merge in the destination or target branch.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}

object MergeBranchesByThreeWayOutput {
  @scala.inline
  def apply(commitId: ObjectId = null, treeId: ObjectId = null): MergeBranchesByThreeWayOutput = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[MergeBranchesByThreeWayOutput]
  }
}

