package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoMLDataSource extends js.Object {
  /**
    * The Amazon S3 location of the data.
    */
  var S3DataSource: AutoMLS3DataSource = js.native
}

object AutoMLDataSource {
  @scala.inline
  def apply(S3DataSource: AutoMLS3DataSource): AutoMLDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AutoMLDataSource]
  }
}

