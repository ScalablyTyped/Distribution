package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentsMetadataConfiguration extends js.Object {
  /**
    * A prefix used to filter metadata configuration files in the AWS S3 bucket. The S3 bucket might contain multiple metadata files. Use S3Prefix to include only the desired metadata files.
    */
  var S3Prefix: js.UndefOr[S3ObjectKey] = js.native
}

object DocumentsMetadataConfiguration {
  @scala.inline
  def apply(S3Prefix: S3ObjectKey = null): DocumentsMetadataConfiguration = {
    val __obj = js.Dynamic.literal()
    if (S3Prefix != null) __obj.updateDynamic("S3Prefix")(S3Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentsMetadataConfiguration]
  }
}

