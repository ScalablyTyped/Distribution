package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileOutput extends js.Object {
  /**
    * The blob ID removed from the tree as part of deleting the file.
    */
  var blobId: ObjectId
  /**
    * The full commit ID of the commit that contains the change that deletes the file.
    */
  var commitId: ObjectId
  /**
    * The fully-qualified path to the file that will be deleted, including the full name and extension of that file.
    */
  var filePath: Path
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the delete file change.
    */
  var treeId: ObjectId
}

object DeleteFileOutput {
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, filePath: Path, treeId: ObjectId): DeleteFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId, commitId = commitId, filePath = filePath, treeId = treeId)
  
    __obj.asInstanceOf[DeleteFileOutput]
  }
}

