package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGeoMatchSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafMod.ChangeToken
  /**
    * A friendly name or description of the GeoMatchSet. You can't change Name after you create the GeoMatchSet.
    */
  var Name: ResourceName
}

object CreateGeoMatchSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, Name: ResourceName): CreateGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, Name = Name)
  
    __obj.asInstanceOf[CreateGeoMatchSetRequest]
  }
}

