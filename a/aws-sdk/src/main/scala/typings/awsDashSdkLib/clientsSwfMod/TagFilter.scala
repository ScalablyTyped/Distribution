package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFilter extends js.Object {
  /**
    *  Specifies the tag that must be associated with the execution for it to meet the filter criteria.
    */
  var tag: Tag
}

object TagFilter {
  @scala.inline
  def apply(tag: Tag): TagFilter = {
    val __obj = js.Dynamic.literal(tag = tag)
  
    __obj.asInstanceOf[TagFilter]
  }
}

