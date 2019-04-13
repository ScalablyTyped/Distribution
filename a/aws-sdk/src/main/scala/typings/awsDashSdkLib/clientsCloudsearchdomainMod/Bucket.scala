package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  /**
    * The number of hits that contain the facet value in the specified facet field.
    */
  var count: js.UndefOr[Long] = js.undefined
  /**
    * The facet value being counted.
    */
  var value: js.UndefOr[String] = js.undefined
}

object Bucket {
  @scala.inline
  def apply(count: js.UndefOr[Long] = js.undefined, value: String = null): Bucket = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Bucket]
  }
}

