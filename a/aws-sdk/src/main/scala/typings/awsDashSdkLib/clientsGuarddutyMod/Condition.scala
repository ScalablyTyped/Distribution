package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[Eq] = js.undefined
  /**
    * Represents the greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[__integer] = js.undefined
  /**
    * Represents the greater than equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[__integer] = js.undefined
  /**
    * Represents the less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[__integer] = js.undefined
  /**
    * Represents the less than equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[__integer] = js.undefined
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[Neq] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    Eq: Eq = null,
    Gt: js.UndefOr[__integer] = js.undefined,
    Gte: js.UndefOr[__integer] = js.undefined,
    Lt: js.UndefOr[__integer] = js.undefined,
    Lte: js.UndefOr[__integer] = js.undefined,
    Neq: Neq = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (Eq != null) __obj.updateDynamic("Eq")(Eq)
    if (!js.isUndefined(Gt)) __obj.updateDynamic("Gt")(Gt)
    if (!js.isUndefined(Gte)) __obj.updateDynamic("Gte")(Gte)
    if (!js.isUndefined(Lt)) __obj.updateDynamic("Lt")(Lt)
    if (!js.isUndefined(Lte)) __obj.updateDynamic("Lte")(Lte)
    if (Neq != null) __obj.updateDynamic("Neq")(Neq)
    __obj.asInstanceOf[Condition]
  }
}

