package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheNodeTypeSpecificValue extends js.Object {
  /**
    * The cache node type for which this value applies.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  /**
    * The value for the cache node type.
    */
  var Value: js.UndefOr[String] = js.native
}

object CacheNodeTypeSpecificValue {
  @scala.inline
  def apply(CacheNodeType: String = null, Value: String = null): CacheNodeTypeSpecificValue = {
    val __obj = js.Dynamic.literal()
    if (CacheNodeType != null) __obj.updateDynamic("CacheNodeType")(CacheNodeType.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheNodeTypeSpecificValue]
  }
}

