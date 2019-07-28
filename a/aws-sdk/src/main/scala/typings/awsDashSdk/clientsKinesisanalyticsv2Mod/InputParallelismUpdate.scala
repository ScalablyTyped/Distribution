package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParallelismUpdate extends js.Object {
  /**
    * The number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: InputParallelismCount
}

object InputParallelismUpdate {
  @scala.inline
  def apply(CountUpdate: InputParallelismCount): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal(CountUpdate = CountUpdate)
  
    __obj.asInstanceOf[InputParallelismUpdate]
  }
}

