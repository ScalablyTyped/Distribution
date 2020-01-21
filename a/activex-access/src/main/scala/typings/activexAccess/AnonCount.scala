package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  val Count: Double
  val Page: Boolean
}

object AnonCount {
  @scala.inline
  def apply(Count: Double, Page: Boolean): AnonCount = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCount]
  }
}

