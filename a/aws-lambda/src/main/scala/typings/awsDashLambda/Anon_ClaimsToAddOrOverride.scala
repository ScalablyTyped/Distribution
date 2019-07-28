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
    if (claimsToAddOrOverride != null) __obj.updateDynamic("claimsToAddOrOverride")(claimsToAddOrOverride)
    if (claimsToSuppress != null) __obj.updateDynamic("claimsToSuppress")(claimsToSuppress)
    if (groupOverrideDetails != null) __obj.updateDynamic("groupOverrideDetails")(groupOverrideDetails)
    __obj.asInstanceOf[Anon_ClaimsToAddOrOverride]
  }
}

