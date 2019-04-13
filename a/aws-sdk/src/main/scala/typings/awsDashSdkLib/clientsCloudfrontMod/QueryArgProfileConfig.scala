package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArgProfileConfig extends js.Object {
  /**
    * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level encryption query argument, fle-profile, is unknown.
    */
  var ForwardWhenQueryArgProfileIsUnknown: scala.Boolean
  /**
    * Profiles specified for query argument-profile mapping for field-level encryption.
    */
  var QueryArgProfiles: js.UndefOr[QueryArgProfiles] = js.undefined
}

object QueryArgProfileConfig {
  @scala.inline
  def apply(ForwardWhenQueryArgProfileIsUnknown: scala.Boolean, QueryArgProfiles: QueryArgProfiles = null): QueryArgProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenQueryArgProfileIsUnknown = ForwardWhenQueryArgProfileIsUnknown)
    if (QueryArgProfiles != null) __obj.updateDynamic("QueryArgProfiles")(QueryArgProfiles)
    __obj.asInstanceOf[QueryArgProfileConfig]
  }
}

