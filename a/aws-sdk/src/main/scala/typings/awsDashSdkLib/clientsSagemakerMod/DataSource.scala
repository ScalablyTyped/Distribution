package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: js.UndefOr[S3DataSource] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(S3DataSource: S3DataSource = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (S3DataSource != null) __obj.updateDynamic("S3DataSource")(S3DataSource)
    __obj.asInstanceOf[DataSource]
  }
}

