package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnWildcard extends js.Object {
  /**
    * Excludes column names. Any column with this name will be excluded.
    */
  var ExcludedColumnNames: js.UndefOr[ColumnNames] = js.undefined
}

object ColumnWildcard {
  @scala.inline
  def apply(ExcludedColumnNames: ColumnNames = null): ColumnWildcard = {
    val __obj = js.Dynamic.literal()
    if (ExcludedColumnNames != null) __obj.updateDynamic("ExcludedColumnNames")(ExcludedColumnNames)
    __obj.asInstanceOf[ColumnWildcard]
  }
}

