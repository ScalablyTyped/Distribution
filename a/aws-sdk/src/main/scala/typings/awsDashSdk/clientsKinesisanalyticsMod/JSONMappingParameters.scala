package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONMappingParameters extends js.Object {
  /**
    * Path to the top-level parent that contains the records.
    */
  var RecordRowPath: typings.awsDashSdk.clientsKinesisanalyticsMod.RecordRowPath = js.native
}

object JSONMappingParameters {
  @scala.inline
  def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONMappingParameters]
  }
}

