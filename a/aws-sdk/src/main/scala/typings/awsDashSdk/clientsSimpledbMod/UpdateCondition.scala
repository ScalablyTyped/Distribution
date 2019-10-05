package typings.awsDashSdk.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCondition extends js.Object {
  /**
    * A value specifying whether or not the specified attribute must exist with the specified value in order for the update condition to be satisfied. Specify true if the attribute must exist for the update condition to be satisfied. Specify false if the attribute should not exist in order for the update condition to be satisfied.
    */
  var Exists: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the attribute involved in the condition.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The value of an attribute. This value can only be specified when the Exists parameter is equal to true.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object UpdateCondition {
  @scala.inline
  def apply(Exists: js.UndefOr[scala.Boolean] = js.undefined, Name: String = null, Value: String = null): UpdateCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Exists)) __obj.updateDynamic("Exists")(Exists)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[UpdateCondition]
  }
}

