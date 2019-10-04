package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactStore extends js.Object {
  /**
    * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
    */
  var encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
  /**
    * The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but not a folder in the bucket. A folder to contain the pipeline artifacts is created for you based on the name of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
    */
  var location: ArtifactStoreLocation
  /**
    * The type of the artifact store, such as S3.
    */
  var `type`: ArtifactStoreType
}

object ArtifactStore {
  @scala.inline
  def apply(location: ArtifactStoreLocation, `type`: ArtifactStoreType, encryptionKey: EncryptionKey = null): ArtifactStore = {
    val __obj = js.Dynamic.literal(location = location)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey)
    __obj.asInstanceOf[ArtifactStore]
  }
}

