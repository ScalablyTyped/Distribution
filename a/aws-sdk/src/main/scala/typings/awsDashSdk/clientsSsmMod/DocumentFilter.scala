package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var key: DocumentFilterKey
  /**
    * The value of the filter.
    */
  var value: DocumentFilterValue
}

object DocumentFilter {
  @scala.inline
  def apply(key: DocumentFilterKey, value: DocumentFilterValue): DocumentFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[DocumentFilter]
  }
}

