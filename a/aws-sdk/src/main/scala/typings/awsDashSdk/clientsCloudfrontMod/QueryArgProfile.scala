package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArgProfile extends js.Object {
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: String
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: String
}

object QueryArgProfile {
  @scala.inline
  def apply(ProfileId: String, QueryArg: String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId, QueryArg = QueryArg)
  
    __obj.asInstanceOf[QueryArgProfile]
  }
}

