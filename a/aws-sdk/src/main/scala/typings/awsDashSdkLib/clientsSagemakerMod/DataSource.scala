package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: awsDashSdkLib.clientsSagemakerMod.S3DataSource
}

object DataSource {
  @scala.inline
  def apply(S3DataSource: S3DataSource): DataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource)
  
    __obj.asInstanceOf[DataSource]
  }
}

