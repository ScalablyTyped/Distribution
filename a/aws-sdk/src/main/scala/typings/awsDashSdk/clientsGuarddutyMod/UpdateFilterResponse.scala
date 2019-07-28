package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFilterResponse extends js.Object {
  /**
    * The name of the filter.
    */
  var Name: FilterName
}

object UpdateFilterResponse {
  @scala.inline
  def apply(Name: FilterName): UpdateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[UpdateFilterResponse]
  }
}

