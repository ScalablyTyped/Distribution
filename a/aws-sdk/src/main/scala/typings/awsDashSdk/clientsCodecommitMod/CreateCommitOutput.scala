package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your committed file changes.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The files added as part of the committed file changes.
    */
  var filesAdded: js.UndefOr[FilesMetadata] = js.native
  /**
    * The files deleted as part of the committed file changes.
    */
  var filesDeleted: js.UndefOr[FilesMetadata] = js.native
  /**
    * The files updated as part of the commited file changes.
    */
  var filesUpdated: js.UndefOr[FilesMetadata] = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the commited file changes.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
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
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (filesAdded != null) __obj.updateDynamic("filesAdded")(filesAdded.asInstanceOf[js.Any])
    if (filesDeleted != null) __obj.updateDynamic("filesDeleted")(filesDeleted.asInstanceOf[js.Any])
    if (filesUpdated != null) __obj.updateDynamic("filesUpdated")(filesUpdated.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommitOutput]
  }
}

