package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogsOptions extends js.Object {
  /**
    * The length size.
    */
  val length: Double
  /**
    * The offset.
    */
  val offset: Double
}

object GetLogsOptions {
  @scala.inline
  def apply(length: Double, offset: Double): GetLogsOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLogsOptions]
  }
}

