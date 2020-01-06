package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeOperations extends js.Object {
  /**
    * The operation on a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[ChangeTypeEnum] = js.native
  /**
    * The operation (add, modify, or delete) on a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[ChangeTypeEnum] = js.native
}

object MergeOperations {
  @scala.inline
  def apply(destination: ChangeTypeEnum = null, source: ChangeTypeEnum = null): MergeOperations = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeOperations]
  }
}

