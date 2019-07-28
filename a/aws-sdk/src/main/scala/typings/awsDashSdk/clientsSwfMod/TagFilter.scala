package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFilter extends js.Object {
  /**
    *  Specifies the tag that must be associated with the execution for it to meet the filter criteria. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
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

