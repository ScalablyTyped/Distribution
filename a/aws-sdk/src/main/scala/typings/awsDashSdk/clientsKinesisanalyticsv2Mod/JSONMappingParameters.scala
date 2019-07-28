package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONMappingParameters extends js.Object {
  /**
    * The path to the top-level parent that contains the records.
    */
  var RecordRowPath: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RecordRowPath
}

object JSONMappingParameters {
  @scala.inline
  def apply(RecordRowPath: RecordRowPath): JSONMappingParameters = {
    val __obj = js.Dynamic.literal(RecordRowPath = RecordRowPath)
  
    __obj.asInstanceOf[JSONMappingParameters]
  }
}

