package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlobInput extends js.Object {
  /**
    * The ID of the blob, which is its SHA-1 pointer.
    */
  var blobId: ObjectId
  /**
    * The name of the repository that contains the blob.
    */
  var repositoryName: RepositoryName
}

object GetBlobInput {
  @scala.inline
  def apply(blobId: ObjectId, repositoryName: RepositoryName): GetBlobInput = {
    val __obj = js.Dynamic.literal(blobId = blobId, repositoryName = repositoryName)
  
    __obj.asInstanceOf[GetBlobInput]
  }
}

