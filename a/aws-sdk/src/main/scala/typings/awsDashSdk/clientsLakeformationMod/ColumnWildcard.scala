package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnWildcard extends js.Object {
  /**
    * Excludes column names. Any column with this name will be excluded.
    */
  var ExcludedColumnNames: js.UndefOr[ColumnNames] = js.native
}

object ColumnWildcard {
  @scala.inline
  def apply(ExcludedColumnNames: ColumnNames = null): ColumnWildcard = {
    val __obj = js.Dynamic.literal()
    if (ExcludedColumnNames != null) __obj.updateDynamic("ExcludedColumnNames")(ExcludedColumnNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnWildcard]
  }
}

