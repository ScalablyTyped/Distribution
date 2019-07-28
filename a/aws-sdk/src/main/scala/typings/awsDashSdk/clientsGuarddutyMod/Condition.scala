package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Eq] = js.undefined
  var Equals: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Equals] = js.undefined
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var GreaterThan: js.UndefOr[Long] = js.undefined
  /**
    * Represents a greater than equal condition to be applied to a single field when querying for findings.
    */
  var GreaterThanOrEqual: js.UndefOr[Long] = js.undefined
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[Integer] = js.undefined
  /**
    * Represents a greater than equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[Integer] = js.undefined
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var LessThan: js.UndefOr[Long] = js.undefined
  /**
    * Represents a less than equal condition to be applied to a single field when querying for findings.
    */
  var LessThanOrEqual: js.UndefOr[Long] = js.undefined
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[Integer] = js.undefined
  /**
    * Represents a less than equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[Integer] = js.undefined
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Neq] = js.undefined
  var NotEquals: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.NotEquals] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    Eq: Eq = null,
    Equals: Equals = null,
    GreaterThan: js.UndefOr[Long] = js.undefined,
    GreaterThanOrEqual: js.UndefOr[Long] = js.undefined,
    Gt: js.UndefOr[Integer] = js.undefined,
    Gte: js.UndefOr[Integer] = js.undefined,
    LessThan: js.UndefOr[Long] = js.undefined,
    LessThanOrEqual: js.UndefOr[Long] = js.undefined,
    Lt: js.UndefOr[Integer] = js.undefined,
    Lte: js.UndefOr[Integer] = js.undefined,
    Neq: Neq = null,
    NotEquals: NotEquals = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (Eq != null) __obj.updateDynamic("Eq")(Eq)
    if (Equals != null) __obj.updateDynamic("Equals")(Equals)
    if (!js.isUndefined(GreaterThan)) __obj.updateDynamic("GreaterThan")(GreaterThan)
    if (!js.isUndefined(GreaterThanOrEqual)) __obj.updateDynamic("GreaterThanOrEqual")(GreaterThanOrEqual)
    if (!js.isUndefined(Gt)) __obj.updateDynamic("Gt")(Gt)
    if (!js.isUndefined(Gte)) __obj.updateDynamic("Gte")(Gte)
    if (!js.isUndefined(LessThan)) __obj.updateDynamic("LessThan")(LessThan)
    if (!js.isUndefined(LessThanOrEqual)) __obj.updateDynamic("LessThanOrEqual")(LessThanOrEqual)
    if (!js.isUndefined(Lt)) __obj.updateDynamic("Lt")(Lt)
    if (!js.isUndefined(Lte)) __obj.updateDynamic("Lte")(Lte)
    if (Neq != null) __obj.updateDynamic("Neq")(Neq)
    if (NotEquals != null) __obj.updateDynamic("NotEquals")(NotEquals)
    __obj.asInstanceOf[Condition]
  }
}

