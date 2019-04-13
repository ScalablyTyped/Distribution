package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttackProperty extends js.Object {
  /**
    * The type of DDoS event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
    */
  var AttackLayer: js.UndefOr[AttackLayer] = js.undefined
  /**
    * Defines the DDoS attack property information that is provided.
    */
  var AttackPropertyIdentifier: js.UndefOr[AttackPropertyIdentifier] = js.undefined
  /**
    * The array of Contributor objects that includes the top five contributors to an attack. 
    */
  var TopContributors: js.UndefOr[TopContributors] = js.undefined
  /**
    * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
    */
  var Total: js.UndefOr[Long] = js.undefined
  /**
    * The unit of the Value of the contributions.
    */
  var Unit: js.UndefOr[Unit] = js.undefined
}

object AttackProperty {
  @scala.inline
  def apply(
    AttackLayer: AttackLayer = null,
    AttackPropertyIdentifier: AttackPropertyIdentifier = null,
    TopContributors: TopContributors = null,
    Total: js.UndefOr[Long] = js.undefined,
    Unit: Unit = null
  ): AttackProperty = {
    val __obj = js.Dynamic.literal()
    if (AttackLayer != null) __obj.updateDynamic("AttackLayer")(AttackLayer.asInstanceOf[js.Any])
    if (AttackPropertyIdentifier != null) __obj.updateDynamic("AttackPropertyIdentifier")(AttackPropertyIdentifier.asInstanceOf[js.Any])
    if (TopContributors != null) __obj.updateDynamic("TopContributors")(TopContributors)
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackProperty]
  }
}

