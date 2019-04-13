package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutFileOutput extends js.Object {
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId
  /**
    * The full SHA of the commit that contains this file change.
    */
  var commitId: ObjectId
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains this file change.
    */
  var treeId: ObjectId
}

object PutFileOutput {
  @scala.inline
  def apply(blobId: ObjectId, commitId: ObjectId, treeId: ObjectId): PutFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId, commitId = commitId, treeId = treeId)
  
    __obj.asInstanceOf[PutFileOutput]
  }
}

