package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMatchConstraint extends js.Object {
  /**
    * The type of geographical area you want AWS WAF to search for. Currently Country is the only valid value.
    */
  var Type: GeoMatchConstraintType
  /**
    * The country that you want AWS WAF to search for.
    */
  var Value: GeoMatchConstraintValue
}

object GeoMatchConstraint {
  @scala.inline
  def apply(Type: GeoMatchConstraintType, Value: GeoMatchConstraintValue): GeoMatchConstraint = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeoMatchConstraint]
  }
}

