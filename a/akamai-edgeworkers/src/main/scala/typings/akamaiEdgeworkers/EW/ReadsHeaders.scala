package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadsHeaders extends js.Object {
  /**
    * Provides header values by header name
    */
  def getHeader(name: String): js.Array[String] | Null
}

object ReadsHeaders {
  @scala.inline
  def apply(getHeader: String => js.Array[String] | Null): ReadsHeaders = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
    __obj.asInstanceOf[ReadsHeaders]
  }
}

