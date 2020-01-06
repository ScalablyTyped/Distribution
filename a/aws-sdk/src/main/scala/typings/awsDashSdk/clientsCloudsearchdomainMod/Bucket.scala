package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bucket extends js.Object {
  /**
    * The number of hits that contain the facet value in the specified facet field.
    */
  var count: js.UndefOr[Long] = js.native
  /**
    * The facet value being counted.
    */
  var value: js.UndefOr[String] = js.native
}

object Bucket {
  @scala.inline
  def apply(count: Int | scala.Double = null, value: String = null): Bucket = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

