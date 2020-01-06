package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParallelismUpdate extends js.Object {
  /**
    * Number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: js.UndefOr[InputParallelismCount] = js.native
}

object InputParallelismUpdate {
  @scala.inline
  def apply(CountUpdate: Int | Double = null): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal()
    if (CountUpdate != null) __obj.updateDynamic("CountUpdate")(CountUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelismUpdate]
  }
}

