package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformDataSource extends js.Object {
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: TransformS3DataSource
}

object TransformDataSource {
  @scala.inline
  def apply(S3DataSource: TransformS3DataSource): TransformDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource)
  
    __obj.asInstanceOf[TransformDataSource]
  }
}

