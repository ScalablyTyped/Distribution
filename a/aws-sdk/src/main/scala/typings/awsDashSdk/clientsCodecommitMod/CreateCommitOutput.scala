package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your committed file changes.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The files added as part of the committed file changes.
    */
  var filesAdded: js.UndefOr[FilesMetadata] = js.undefined
  /**
    * The files deleted as part of the committed file changes.
    */
  var filesDeleted: js.UndefOr[FilesMetadata] = js.undefined
  /**
    * The files updated as part of the commited file changes.
    */
  var filesUpdated: js.UndefOr[FilesMetadata] = js.undefined
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}

object CreateCommitOutput {
  @scala.inline
  def apply(
    commitId: ObjectId = null,
    filesAdded: FilesMetadata = null,
    filesDeleted: FilesMetadata = null,
    filesUpdated: FilesMetadata = null,
    treeId: ObjectId = null
  ): CreateCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (filesAdded != null) __obj.updateDynamic("filesAdded")(filesAdded)
    if (filesDeleted != null) __obj.updateDynamic("filesDeleted")(filesDeleted)
    if (filesUpdated != null) __obj.updateDynamic("filesUpdated")(filesUpdated)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[CreateCommitOutput]
  }
}

