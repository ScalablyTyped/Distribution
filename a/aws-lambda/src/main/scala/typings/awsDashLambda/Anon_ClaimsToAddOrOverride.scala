package typings.awsDashLambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClaimsToAddOrOverride extends js.Object {
  var claimsToAddOrOverride: js.UndefOr[StringDictionary[String]] = js.undefined
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined
  var groupOverrideDetails: js.UndefOr[Null | Anon_GroupsToOverride] = js.undefined
}

object Anon_ClaimsToAddOrOverride {
  @scala.inline
  def apply(
    claimsToAddOrOverride: StringDictionary[String] = null,
    claimsToSuppress: js.Array[String] = null,
    groupOverrideDetails: Anon_GroupsToOverride = null
  ): Anon_ClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    if (claimsToAddOrOverride != null) __obj.updateDynamic("claimsToAddOrOverride")(claimsToAddOrOverride.asInstanceOf[js.Any])
    if (claimsToSuppress != null) __obj.updateDynamic("claimsToSuppress")(claimsToSuppress.asInstanceOf[js.Any])
    if (groupOverrideDetails != null) __obj.updateDynamic("groupOverrideDetails")(groupOverrideDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClaimsToAddOrOverride]
  }
}

