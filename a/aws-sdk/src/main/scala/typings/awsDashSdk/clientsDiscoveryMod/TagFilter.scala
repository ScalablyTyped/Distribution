package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFilter extends js.Object {
  /**
    * A name of the tag filter.
    */
  var name: FilterName
  /**
    * Values for the tag filter.
    */
  var values: FilterValues
}

object TagFilter {
  @scala.inline
  def apply(name: FilterName, values: FilterValues): TagFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[TagFilter]
  }
}

