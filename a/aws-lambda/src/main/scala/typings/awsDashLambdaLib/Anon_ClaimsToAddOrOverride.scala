package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClaimsToAddOrOverride extends js.Object {
  var claimsToAddOrOverride: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var claimsToSuppress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var groupOverrideDetails: js.UndefOr[scala.Null | Anon_GroupsToOverride] = js.undefined
}

object Anon_ClaimsToAddOrOverride {
  @scala.inline
  def apply(
    claimsToAddOrOverride: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    claimsToSuppress: js.Array[java.lang.String] = null,
    groupOverrideDetails: Anon_GroupsToOverride = null
  ): Anon_ClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    if (claimsToAddOrOverride != null) __obj.updateDynamic("claimsToAddOrOverride")(claimsToAddOrOverride)
    if (claimsToSuppress != null) __obj.updateDynamic("claimsToSuppress")(claimsToSuppress)
    if (groupOverrideDetails != null) __obj.updateDynamic("groupOverrideDetails")(groupOverrideDetails)
    __obj.asInstanceOf[Anon_ClaimsToAddOrOverride]
  }
}

