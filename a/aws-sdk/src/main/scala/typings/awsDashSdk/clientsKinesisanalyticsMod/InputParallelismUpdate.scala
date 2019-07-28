package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParallelismUpdate extends js.Object {
  /**
    * Number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined
}

object InputParallelismUpdate {
  @scala.inline
  def apply(CountUpdate: js.UndefOr[InputParallelismCount] = js.undefined): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CountUpdate)) __obj.updateDynamic("CountUpdate")(CountUpdate)
    __obj.asInstanceOf[InputParallelismUpdate]
  }
}

