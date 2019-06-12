package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUnreferencedMergeCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your merge results.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}

object CreateUnreferencedMergeCommitOutput {
  @scala.inline
  def apply(commitId: ObjectId = null, treeId: ObjectId = null): CreateUnreferencedMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[CreateUnreferencedMergeCommitOutput]
  }
}

