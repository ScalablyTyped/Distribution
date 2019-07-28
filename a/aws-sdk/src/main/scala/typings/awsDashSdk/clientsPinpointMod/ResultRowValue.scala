package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultRowValue extends js.Object {
  /**
    *  The name of the field that Amazon Pinpoint uses to store the value specified by the Value property.
    */
  var Key: __string
  /**
    *  The data type of the value specified by the Value property.
    */
  var Type: __string
  /**
    *  In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value for the field that was used to group data in a result set that contains multiple results (Values objects).
    */
  var Value: __string
}

object ResultRowValue {
  @scala.inline
  def apply(Key: __string, Type: __string, Value: __string): ResultRowValue = {
    val __obj = js.Dynamic.literal(Key = Key, Type = Type, Value = Value)
  
    __obj.asInstanceOf[ResultRowValue]
  }
}

