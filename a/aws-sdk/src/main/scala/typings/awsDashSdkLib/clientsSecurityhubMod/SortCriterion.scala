package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCriterion extends js.Object {
  /**
    * The finding attribute used for sorting findings.
    */
  var Field: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The order used for sorting findings.
    */
  var SortOrder: js.UndefOr[SortOrder] = js.undefined
}

object SortCriterion {
  @scala.inline
  def apply(Field: NonEmptyString = null, SortOrder: SortOrder = null): SortCriterion = {
    val __obj = js.Dynamic.literal()
    if (Field != null) __obj.updateDynamic("Field")(Field)
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriterion]
  }
}

