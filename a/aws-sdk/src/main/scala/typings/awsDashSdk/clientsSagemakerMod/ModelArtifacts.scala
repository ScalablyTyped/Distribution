package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelArtifacts extends js.Object {
  /**
    * The path of the S3 object that contains the model artifacts. For example, s3://bucket-name/keynameprefix/model.tar.gz.
    */
  var S3ModelArtifacts: S3Uri
}

object ModelArtifacts {
  @scala.inline
  def apply(S3ModelArtifacts: S3Uri): ModelArtifacts = {
    val __obj = js.Dynamic.literal(S3ModelArtifacts = S3ModelArtifacts)
  
    __obj.asInstanceOf[ModelArtifacts]
  }
}

