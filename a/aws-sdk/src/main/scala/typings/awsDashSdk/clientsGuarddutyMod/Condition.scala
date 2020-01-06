package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * Represents the equal condition to be applied to a single field when querying for findings.
    */
  var Eq: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Eq] = js.native
  /**
    * Represents an equal condition to be applied to a single field when querying for findings.
    */
  var Equals: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Equals] = js.native
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var GreaterThan: js.UndefOr[Long] = js.native
  /**
    * Represents a greater than equal condition to be applied to a single field when querying for findings.
    */
  var GreaterThanOrEqual: js.UndefOr[Long] = js.native
  /**
    * Represents a greater than condition to be applied to a single field when querying for findings.
    */
  var Gt: js.UndefOr[Integer] = js.native
  /**
    * Represents a greater than equal condition to be applied to a single field when querying for findings.
    */
  var Gte: js.UndefOr[Integer] = js.native
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var LessThan: js.UndefOr[Long] = js.native
  /**
    * Represents a less than equal condition to be applied to a single field when querying for findings.
    */
  var LessThanOrEqual: js.UndefOr[Long] = js.native
  /**
    * Represents a less than condition to be applied to a single field when querying for findings.
    */
  var Lt: js.UndefOr[Integer] = js.native
  /**
    * Represents a less than equal condition to be applied to a single field when querying for findings.
    */
  var Lte: js.UndefOr[Integer] = js.native
  /**
    * Represents the not equal condition to be applied to a single field when querying for findings.
    */
  var Neq: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Neq] = js.native
  /**
    * Represents an not equal condition to be applied to a single field when querying for findings.
    */
  var NotEquals: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.NotEquals] = js.native
}

object Condition {
  @scala.inline
  def apply(
    Eq: Eq = null,
    Equals: Equals = null,
    GreaterThan: Int | scala.Double = null,
    GreaterThanOrEqual: Int | scala.Double = null,
    Gt: Int | scala.Double = null,
    Gte: Int | scala.Double = null,
    LessThan: Int | scala.Double = null,
    LessThanOrEqual: Int | scala.Double = null,
    Lt: Int | scala.Double = null,
    Lte: Int | scala.Double = null,
    Neq: Neq = null,
    NotEquals: NotEquals = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (Eq != null) __obj.updateDynamic("Eq")(Eq.asInstanceOf[js.Any])
    if (Equals != null) __obj.updateDynamic("Equals")(Equals.asInstanceOf[js.Any])
    if (GreaterThan != null) __obj.updateDynamic("GreaterThan")(GreaterThan.asInstanceOf[js.Any])
    if (GreaterThanOrEqual != null) __obj.updateDynamic("GreaterThanOrEqual")(GreaterThanOrEqual.asInstanceOf[js.Any])
    if (Gt != null) __obj.updateDynamic("Gt")(Gt.asInstanceOf[js.Any])
    if (Gte != null) __obj.updateDynamic("Gte")(Gte.asInstanceOf[js.Any])
    if (LessThan != null) __obj.updateDynamic("LessThan")(LessThan.asInstanceOf[js.Any])
    if (LessThanOrEqual != null) __obj.updateDynamic("LessThanOrEqual")(LessThanOrEqual.asInstanceOf[js.Any])
    if (Lt != null) __obj.updateDynamic("Lt")(Lt.asInstanceOf[js.Any])
    if (Lte != null) __obj.updateDynamic("Lte")(Lte.asInstanceOf[js.Any])
    if (Neq != null) __obj.updateDynamic("Neq")(Neq.asInstanceOf[js.Any])
    if (NotEquals != null) __obj.updateDynamic("NotEquals")(NotEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

