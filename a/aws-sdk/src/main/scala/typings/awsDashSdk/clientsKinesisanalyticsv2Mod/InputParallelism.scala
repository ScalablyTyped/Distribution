package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParallelism extends js.Object {
  /**
    * The number of in-application streams to create.
    */
  var Count: js.UndefOr[InputParallelismCount] = js.undefined
}

object InputParallelism {
  @scala.inline
  def apply(Count: Int | Double = null): InputParallelism = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelism]
  }
}

