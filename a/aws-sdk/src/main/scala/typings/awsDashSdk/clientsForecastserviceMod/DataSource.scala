package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the credentials to access the data.
    */
  var S3Config: typings.awsDashSdk.clientsForecastserviceMod.S3Config = js.native
}

object DataSource {
  @scala.inline
  def apply(S3Config: S3Config): DataSource = {
    val __obj = js.Dynamic.literal(S3Config = S3Config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSource]
  }
}

