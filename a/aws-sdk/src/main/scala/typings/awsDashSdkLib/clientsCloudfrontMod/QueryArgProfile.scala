package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArgProfile extends js.Object {
  /**
    * ID of profile to use for field-level encryption query argument-profile mapping
    */
  var ProfileId: java.lang.String
  /**
    * Query argument for field-level encryption query argument-profile mapping.
    */
  var QueryArg: java.lang.String
}

object QueryArgProfile {
  @scala.inline
  def apply(ProfileId: java.lang.String, QueryArg: java.lang.String): QueryArgProfile = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId, QueryArg = QueryArg)
  
    __obj.asInstanceOf[QueryArgProfile]
  }
}

