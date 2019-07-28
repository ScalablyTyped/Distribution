package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contributor extends js.Object {
  /**
    * The name of the contributor. This is dependent on the AttackPropertyIdentifier. For example, if the AttackPropertyIdentifier is SOURCE_COUNTRY, the Name could be United States.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The contribution of this contributor expressed in Protection units. For example 10,000.
    */
  var Value: js.UndefOr[Long] = js.undefined
}

object Contributor {
  @scala.inline
  def apply(Name: String = null, Value: js.UndefOr[Long] = js.undefined): Contributor = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Contributor]
  }
}

